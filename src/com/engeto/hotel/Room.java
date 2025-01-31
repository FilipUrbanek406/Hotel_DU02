package com.engeto.hotel;

import java.math.BigDecimal;

public class Room {

    private int numberOfBeds;
    private int roomNumber;
    private boolean balcony;
    private boolean seaView;
    private BigDecimal pricePerNight;

    public Room(int numberOfBeds, int roomNumber, boolean balcony, boolean seaView, BigDecimal pricePerNight) {
        this.numberOfBeds = numberOfBeds;
        this.roomNumber = roomNumber;
        this.balcony = balcony;
        this.seaView = seaView;
        this.pricePerNight = pricePerNight;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public boolean isBalcony() {
        return balcony;
    }

    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }

    public boolean isSeaView() {
        return seaView;
    }

    public void setSeaView(boolean seaView) {
        this.seaView = seaView;
    }

    public BigDecimal getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(BigDecimal pricePerNight) {
        this.pricePerNight = pricePerNight;
    }
}
