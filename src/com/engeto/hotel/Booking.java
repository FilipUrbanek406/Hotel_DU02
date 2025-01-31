package com.engeto.hotel;

import java.time.LocalDate;
import java.util.List;

public class Booking {

    private Guest guest;
    private Room room;
    private String typeOfVacation;
    private LocalDate startDate;
    private LocalDate endDate;
    private List otherGuests;

    public Booking(Guest guest, Room room, String typeOfVacation, LocalDate startDate, LocalDate endDate, List otherGuests) {
        this.guest = guest;
        this.room = room;
        this.typeOfVacation = typeOfVacation;
        this.startDate = startDate;
        this.endDate = endDate;
        this.otherGuests = otherGuests;
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

    public String getTypeOfVacation() {
        return typeOfVacation;
    }

    public void setTypeOfVacation(String typeOfVacation) {
        this.typeOfVacation = typeOfVacation;
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

    public List getOtherGuests() {
        return otherGuests;
    }

    public void setOtherGuests(List otherGuests) {
        this.otherGuests = otherGuests;
    }
}

