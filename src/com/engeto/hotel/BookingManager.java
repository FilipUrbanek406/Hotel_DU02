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

    public List<Booking> getTopNHolidayBookings(int bookingsCount) {
        int countOfBookings = 0;
        List<Booking> result = new ArrayList<>();
        for (Booking booking : bookings) {
            if (countOfBookings >= bookingsCount) {
                break;
            }
            if (! booking.isWorkingStay()) {
                result.add(booking);
                countOfBookings++;
            }
        }
        return result;
    }

    public void printGuestStatistics() {
        int oneGuest = 0, twoGuests = 0, moreGuests = 0;

        for (Booking booking : bookings) {
            int guests = booking.getGuestsCount();

            if (guests == 1) {
                oneGuest++;
            } else if (guests == 2) {
                twoGuests++;
            } else {
                moreGuests++;
            }
        }

        System.out.println("Počet rezervací s jedním hostem: " + oneGuest);
        System.out.println("Počet rezervací se dvěma hosty: " + twoGuests);
        System.out.println("Počet rezervací s více hosty: " + moreGuests);
    }
}
