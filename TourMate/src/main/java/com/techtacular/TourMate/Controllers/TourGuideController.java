package com.techtacular.TourMate.Controllers;

import java.util.List;

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

import com.techtacular.TourMate.Domain.TourGuide;
import com.techtacular.TourMate.Repository.TourGuideRepository;

@RestController
@RequestMapping("/tour-guides")
public class TourGuideController {

    private final TourGuideRepository tourGuideRepository;

    public TourGuideController(TourGuideRepository tourGuideRepository) {
        this.tourGuideRepository = tourGuideRepository;
    }

    @GetMapping
    public List<TourGuide> getTourGuides() {
        return tourGuideRepository.findAll();
    }

    // @GetMapping("/{id}")
    // public TourGuide getTourGuideById(@PathVariable Long id) {
    // return tourGuideRepository.findById(id)
    // .orElseThrow(() -> new ResourceNotFoundException("TourGuide not found with id
    // " + id));
    // }

    @PostMapping
    public TourGuide createTourGuide(@RequestBody TourGuide tourGuide) {
        return tourGuideRepository.save(tourGuide);
    }

    // @PutMapping("/{id}")
    // public TourGuide updateTourGuide(@PathVariable Long id, @RequestBody
    // TourGuide tourGuideDetails) {
    // TourGuide tourGuide = tourGuideRepository.findById(id)
    // .orElseThrow(() -> new ResourceNotFoundException("TourGuide not found with id
    // " + id));

    // tourGuide.update(tourGuideDetails);

    // return tourGuideRepository.save(tourGuide);

}

// @DeleteMapping("/{id}")
// public ResponseEntity<?> deleteTourGuide(@PathVariable Long id) {
// TourGuide tourGuide = tourGuideRepository.findById(id)
// .orElseThrow(() -> new ResourceNotFoundException("TourGuide not found with id
// " + id));

// tourGuideRepository.delete(tourGuide);

// return ResponseEntity.ok().build();
// }
