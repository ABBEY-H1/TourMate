import { Component } from '@angular/core';

@Component({
  selector: 'app-guide-list',
  templateUrl: './guide-list.component.html',
  styleUrls: ['./guide-list.component.css']
})
export class GuideListComponent {
  guides = [
    { id: 1, name: 'John Doe', language: 'English', specialization: 'History', rating: 4.5, profilePicture: 'assets/images/guide1.jpg' },
    { id: 2, name: 'Jane Smith', language: 'French', specialization: 'Food', rating: 4.8, profilePicture: 'assets/images/guide2.jpg' },
    { id: 3, name: 'Bob Johnson', language: 'Spanish', specialization: 'Outdoor Activities', rating: 4.2, profilePicture: 'assets/images/guide3.jpg' }
  ];
}
