package com.techtacular.TourMate.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techtacular.TourMate.Domain.TourGuide;

public interface TourGuideRepository extends JpaRepository<TourGuide, Long> {

    List<TourGuide> findByLocationAndLanguageAndSpecialization(String location, String language, String specialization);

    List<TourGuide> findByLocationAndLanguageAndSpecializationAndIdNotIn(String location, String language,
            String specialization, List<Long> ids);

}
