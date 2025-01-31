package com.engeto;

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
}
