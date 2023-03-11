package com.techtacular.TourMate.Repository;

public interface BookingRepository extends JpaRepository<Booking, Long> {

    List<Booking> findByGuideId(Long guideId);

    List<Booking> findByUserId(Long userId);

}
