package com.techtacular.TourMate.Controllers;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techtacular.TourMate.Domain.Booking;
import com.techtacular.TourMate.Domain.Tourist;
import com.techtacular.TourMate.Repository.BookingRepository;
import com.techtacular.TourMate.Repository.TouristRepository;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    public BookingController() {
        // This constructor does not need to do anything
      }


  @Autowired
  private BookingRepository bookingRepository;

  @Autowired
  private TouristRepository touristRepository;

  public BookingController(TouristRepository touristRepository) {
    this.touristRepository = touristRepository;
}

public BookingController(BookingRepository bookingRepository) {
    this.bookingRepository = bookingRepository;
}

@PostMapping("/createBooking")
public ResponseEntity<?> createBooking(@RequestBody Booking booking) {
  // Save the tourist object first
  Tourist savedTourist = touristRepository.save(booking.getTourist());
  // Set the tourist ID on the booking object
  booking.getTourist().setId(savedTourist.getId());
  // Save the booking object
  Booking savedBooking = bookingRepository.save(booking);
  return ResponseEntity.created(URI.create("/bookings/" + savedBooking.getId())).build();
}

  @GetMapping("/{id}")
  public ResponseEntity<Booking> getBooking(@PathVariable Long id) {
    Optional<Booking> booking = bookingRepository.findById(id);
    return ResponseEntity.of(booking);
  }

  @GetMapping
  public List<Booking> getAllBookings() {
    return bookingRepository.findAll();
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<?> deleteBooking(@PathVariable Long id) {
    if (bookingRepository.existsById(id)) {
      bookingRepository.deleteById(id);
      return ResponseEntity.noContent().build();
    } else {
      return ResponseEntity.notFound().build();
    }
  }

  @PutMapping("/{id}")
  public ResponseEntity<?> updateBooking(@PathVariable Long id, @RequestBody Booking booking) {
    if (!bookingRepository.existsById(id)) {
      return ResponseEntity.notFound().build();
    } else {
      booking.setId(id);
      bookingRepository.save(booking);
      return ResponseEntity.noContent().build();
    }
  }
}
