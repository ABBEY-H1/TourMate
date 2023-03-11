package com.techtacular.TourMate.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tour_guides")
public class TourGuide {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    private String location;

    @NotBlank
    private String language;

    @NotBlank
    private String specialization;

    // getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    // update method

    public void update(TourGuide tourGuide) {
        if (tourGuide.getName() != null) {
            this.setName(tourGuide.getName());
        }
        if (tourGuide.getLocation() != null) {
            this.setLocation(tourGuide.getLocation());
        }
        if (tourGuide.getLanguage() != null) {
            this.setLanguage(tourGuide.getLanguage());
        }
        if (tourGuide.getSpecialization() != null) {
            this.setSpecialization(tourGuide.getSpecialization());
        }
    }
}
