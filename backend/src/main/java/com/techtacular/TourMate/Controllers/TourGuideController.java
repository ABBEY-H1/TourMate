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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.techtacular.TourMate.Domain.Booking;
import com.techtacular.TourMate.Domain.TourGuide;
import com.techtacular.TourMate.Repository.TourGuideRepository;
import com.techtacular.TourMate.Services.TourGuideService;

@RestController
@RequestMapping("/tourGuides")
public class TourGuideController {

    public TourGuideController() {
        // This constructor does not need to do anything
      }

  @Autowired
  private TourGuideService tourGuideService;

  public TourGuideController(TourGuideRepository tourGuideRepository) {
    this.tourGuideRepository = tourGuideRepository;
}

private TourGuideRepository tourGuideRepository;

  public TourGuideController(TourGuideService tourGuideService) {
    this.tourGuideService = tourGuideService;
}

@PostMapping
  public ResponseEntity<?> createTourGuide(@RequestBody TourGuide tourGuide) {
    TourGuide savedTourGuide = tourGuideService.createTourGuide(tourGuide);
    return ResponseEntity.created(URI.create("/tourGuides/" + savedTourGuide.getId())).build();
  }

  @GetMapping("/{id}")
  public ResponseEntity<?> getTourGuide(@PathVariable Long id) {
      Optional<TourGuide> tourGuide = tourGuideRepository.findById(id);
      if (tourGuide.isPresent()) {
          return ResponseEntity.ok(tourGuide.get());
      } else {
          return ResponseEntity.notFound().build();
      }
  }

  @GetMapping
  public List<TourGuide> getAllTourGuides() {
    return tourGuideService.getAllTourGuides();
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<?> deleteTourGuide(@PathVariable Long id) throws Exception {
    if (tourGuideService.deleteTourGuide(id)) {
      return ResponseEntity.noContent().build();
    } else {
      return ResponseEntity.notFound().build();
    }
  }

  @PutMapping("/{id}")
  public ResponseEntity<?> updateTourGuide(@PathVariable Long id, @RequestBody TourGuide tourGuide) throws Exception {
    if (!tourGuideService.tourGuideExists(id)) {
      return ResponseEntity.notFound().build();
    } else {
      tourGuide.setId(id);
      tourGuideService.updateTourGuide(id, tourGuide);
      return ResponseEntity.noContent().build();
    }
  }

  @GetMapping("/search")
  public List<TourGuide> searchTourGuides(
          @RequestParam(name = "location", required = false) String location,
          @RequestParam(name = "language", required = false) String language,
          @RequestParam(name = "specialization", required = false) String specialization) {
    return tourGuideService.searchTourGuides(location, language);
  }

  @GetMapping("/{id}/bookings")
  public TourGuide getTourGuideBookings(@PathVariable Long id) throws Exception {
    return tourGuideService.getTourGuideById(id);
  }

  @PostMapping("/{id}/bookings")
  public ResponseEntity<?> createTourGuideBooking(@PathVariable Long id, @RequestBody Booking booking) {
    Booking savedBooking = tourGuideService.createTourGuideBooking(id, booking);
    return ResponseEntity.created(URI.create("/tourGuides/" + id + "/bookings/" + savedBooking.getId())).build();
  }

}
