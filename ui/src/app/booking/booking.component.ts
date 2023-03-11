import { Component } from '@angular/core';

@Component({
  selector: 'app-booking',
  templateUrl: './booking.component.html',
  styleUrls: ['./booking.component.css']
})
export class BookingComponent {
bookings = [
  {
    "id": 0,
    "tourist": {
      "id": 0,
      "name": "string",
      "email": "string",
      "phoneNumber": "string",
      "language": "string"
    },
    "date": "2023-03-11",
    "time": {
      "hour": 0,
      "minute": 0,
      "second": 0,
      "nano": 0
    },
    "duration": 0,
    "guide": {
      "id": 0,
      "name": "string",
      "language": "string",
      "location": "string",
      "expertise": "string",
      "description": "string",
      "rating": 0,
      "availability": true
    }
  }
];

}
