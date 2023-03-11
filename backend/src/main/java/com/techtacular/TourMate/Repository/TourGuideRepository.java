package com.techtacular.TourMate.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techtacular.TourMate.Domain.TourGuide;

public interface TourGuideRepository extends JpaRepository<TourGuide, Long> {
    List<TourGuide> findByLocation(String location);
    List<TourGuide> findByLanguage(String language);
    List<TourGuide> findByLocationAndLanguage(String location, String language);
}
