package com.techtacular.TourMate.Services;

@Service
public class BookingService {

    private BookingRepository bookingRepository;

    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    @Transactional
    public Booking createBooking(Guide guide, User user, Date bookingDate) {
        Booking booking = new Booking(guide, user, bookingDate);
        return bookingRepository.save(booking);
    }
}
