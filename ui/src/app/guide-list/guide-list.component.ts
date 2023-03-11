import { Component } from '@angular/core';

@Component({
  selector: 'app-guide-list',
  templateUrl: './guide-list.component.html',
  styleUrls: ['./guide-list.component.css']
})
export class GuideListComponent {
  guides = [
    { id: 1, name: 'Archi', language: 'English', specialization: 'History', rating: 4.5, profilePicture: 'assets/guide1.jpg' },
    { id: 2, name: 'Abhranil', language: 'French', specialization: 'Food', rating: 4.8, profilePicture: 'assets/guide2.jpg' },
    { id: 3, name: 'Ankita', language: 'Spanish', specialization: 'Outdoor Activities', rating: 4.2, profilePicture: 'assets/guide3.jpg' }
  ];
}
