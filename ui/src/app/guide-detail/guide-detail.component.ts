import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-guide-details',
  templateUrl: './guide-detail.component.html',
  styleUrls: ['./guide-detail.component.css']
})
export class GuideDetailComponent implements OnInit {
  guideId: number | null = null;

  constructor(private route: ActivatedRoute) { }

  ngOnInit(): void {
    const idString = this.route.snapshot.paramMap.get('id');
    if (idString !== null) {
      const id = +idString;
      if (!isNaN(id)) {
        this.guideId = id;
      } else {
        console.error('Invalid guide ID:', idString);
      }
    } else {
      console.error('Guide ID not found in URL parameters');
    }
  }
}

