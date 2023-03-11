package com.techtacular.TourMate.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techtacular.TourMate.Domain.Booking;
import com.techtacular.TourMate.Domain.TourGuide;
import com.techtacular.TourMate.Repository.TourGuideRepository;

@Service
public class TourGuideService {

    @Autowired
    private TourGuideRepository tourGuideRepository;

    public TourGuideService(TourGuideRepository tourGuideRepository) {
        this.tourGuideRepository = tourGuideRepository;
    }

    public List<TourGuide> getAllTourGuides() {
        return tourGuideRepository.findAll();
    }

    public TourGuide getTourGuideById(Long id) throws Exception {
        Optional<TourGuide> tourGuide = tourGuideRepository.findById(id);
        if (tourGuide.isPresent()) {
            return tourGuide.get();
        } else {
            throw new Exception("Tour guide not found with id: " + id);
        }
    }

    public List<TourGuide> searchTourGuides(String location, String language) {
        if (location == null && language == null) {
            return tourGuideRepository.findAll();
        } else if (location == null) {
            return tourGuideRepository.findByLanguage(language);
        } else if (language == null) {
            return tourGuideRepository.findByLocation(location);
        } else {
            return tourGuideRepository.findByLocationAndLanguage(location, language);
        }
    }

    public TourGuide createTourGuide(TourGuide tourGuide) {
        return tourGuideRepository.save(tourGuide);
    }

    public boolean deleteTourGuide(Long id) throws Exception {
        if (tourGuideRepository.existsById(id)) {
            tourGuideRepository.deleteById(id);
        } else {
            throw new Exception("Tour guide not found with id: " + id);
        }
        return false;
    }

    public TourGuide updateTourGuide(Long id, TourGuide tourGuide) throws Exception {
        if (!tourGuideRepository.existsById(id)) {
            throw new Exception("Tour guide not found with id: " + id);
        } else {
            tourGuide.setId(id);
            return tourGuideRepository.save(tourGuide);
        }
    }

    public Booking createTourGuideBooking(Long id, Booking booking) {
        return null;
    }

    public boolean tourGuideExists(Long id) {
        return false;
    }
}
