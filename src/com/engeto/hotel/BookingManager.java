package com.engeto.hotel;

import java.util.ArrayList;
import java.util.List;

public class BookingManager {
    private List<Booking> bookings = new ArrayList<>();

    public void addBooking(Booking booking) {
        bookings.add(booking);
    }

    public Booking getBooking(int index) {
        return bookings.get(index);
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void clearBookingList() {
        bookings.clear();
    }

    public int getNumberOfWorkingBookings() {
        int count = 0;
        for (Booking booking : bookings) {
            if (booking.isWorkingStay()) {
                count++;
            }
        }
        return count;
    }

    public double getAvarageGuests() {
        double sum = 0;
        for (Booking booking : bookings) {
            sum += booking.getGuestsCount();
        }
        return sum / bookings.size();
    }
}
