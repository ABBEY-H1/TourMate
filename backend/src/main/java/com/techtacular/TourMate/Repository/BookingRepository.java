package com.techtacular.TourMate.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techtacular.TourMate.Domain.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {

  List<Booking> findByTourGuideId(Long tourGuideId);

  List<Booking> findByTouristId(Long touristId);

//   List<Booking> findByTourGuideIdAndStatus(Long tourGuideId, BookingStatus status);

}
