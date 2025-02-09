package com.engeto.hotel;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Booking {

    private Guest guest;
    private Room room;
    private boolean isWorkingStay;
    private LocalDate startDate;
    private LocalDate endDate;
    private List<Guest> otherGuests = new ArrayList<>();

    public Booking(Guest guest, Room room, boolean isWorkingStay, LocalDate startDate, LocalDate endDate) {
        this.guest = guest;
        this.room = room;
        this.isWorkingStay = isWorkingStay;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public boolean isWorkingStay() {
        return isWorkingStay;
    }

    public void setWorkingStay(boolean workingStay) {
        this.isWorkingStay = workingStay;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public List<Guest> getOtherGuests() {
        return otherGuests;
    }

    public void setOtherGuests(List<Guest> otherGuests) {
        this.otherGuests = otherGuests;
    }

    public void addOtherGuest(Guest guest) {
        otherGuests.add(guest);
    }

    public int getGuestsCount() {
        return otherGuests.size() + 1;
    }

    public long getBookingLength() {
        return ChronoUnit.DAYS.between(startDate, endDate);
    }

    public BigDecimal getTotalPrice() {
        return room.getPricePerNight().multiply(BigDecimal.valueOf(getBookingLength()));
    }

    public String getFormattedSummary() {
        Guest guest = getGuest();
        return getStartDate() + " až " + getEndDate() + ": " + guest.getFirstName() + guest.getLastName() + " (" + guest.getDateOfBirth() + ")[počet hostů: " + getGuestsCount() +
                ", " + (room.isSeaView() ? "s výhledem na moře" : "bez výhledu na moře") + "] za " + getTotalPrice() + " Kč";
    }
}

