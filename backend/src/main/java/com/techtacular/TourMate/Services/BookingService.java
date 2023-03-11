package com.techtacular.TourMate.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techtacular.TourMate.Domain.Booking;
import com.techtacular.TourMate.Repository.BookingRepository;

@Service
public class BookingService {

  @Autowired
  private BookingRepository bookingRepository;

  public Booking createBooking(Booking booking) {
    return bookingRepository.save(booking);
  }

  public Optional<Booking> getBooking(Long id) {
    return bookingRepository.findById(id);
  }

  public List<Booking> getAllBookings() {
    return bookingRepository.findAll();
  }

  public void deleteBooking(Long id) {
    bookingRepository.deleteById(id);
  }

  public void updateBooking(Long id, Booking booking) {
    booking.setId(id);
    bookingRepository.save(booking);
  }

  public List<Booking> getBookingsForTourGuide(Long tourGuideId) {
    return bookingRepository.findByTourGuideId(tourGuideId);
  }

  public List<Booking> getBookingsForTourist(Long touristId) {
    return bookingRepository.findByTouristId(touristId);
  }

//   public List<Booking> getBookingsForTourGuideByStatus(Long tourGuideId, BookingStatus status) {
//     return bookingRepository.findByTourGuideIdAndStatus(tourGuideId, status);
//   }

}