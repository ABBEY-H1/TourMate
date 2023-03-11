package com.techtacular.TourMate.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techtacular.TourMate.Domain.Tourist;

public interface TouristRepository extends JpaRepository<Tourist, Long> {

}