import com.engeto.hotel.Booking;
import com.engeto.hotel.Guest;
import com.engeto.hotel.Room;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Vytvoření objektů hostů
        Guest guest1 = new Guest("Adéla", "Malíková", LocalDate.of(1993, 3, 13));
        Guest guest2 = new Guest("Jan", "Dvořáček", LocalDate.of(1995, 5, 5));

        // Změna data narození
        guest2.setDateOfBirth(LocalDate.of(1995, 4,5));

        // Výpis informací o hostech
        System.out.println("Jméno a datum narození hosta: " + guest2.getFirstName() + " " + guest2.getLastName()
                + " " + "(" + guest2.getDateOfBirth() + ")");

        // Vytvoření objektů pokojů
        Room room1 = new Room(1, 101, true, true, new BigDecimal(1000));
        Room room2 = new Room(1, 102, true, true, new BigDecimal(1000));
        Room room3 = new Room(3, 103, false, true, new BigDecimal(2400));

        // Vytvoření objektů rezervací
        Booking booking1 = new Booking(guest1, room1, false, LocalDate.of(2021, 7, 19), LocalDate.of(2021, 7, 26));
        Booking booking2 = new Booking(guest2, room2, true, LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14));
        booking2.addOtherGuest(guest1);

        // Vytvoření seznamu rezervací
        List<Booking> bookings = new ArrayList<>();
        bookings.add(booking1);
        bookings.add(booking2);

        // Výpis informací o rezervacích
        System.out.println("Výpis všech rezervací:");
        for (Booking booking : bookings) {
            System.out.println("Rezervace pro: " + booking.getGuest().getFirstName() + " " + booking.getGuest().getLastName()
                    + ", pokoj č. " + booking.getRoom().getRoomNumber() + ", typ: " + (booking.isWorkingStay() ? "pracovní" : "rekreační")
                    + ", od: " + booking.getStartDate() + " do: " + booking.getEndDate());
            if (booking.getOtherGuests().size() > 0) {
                System.out.println("Další hosté: ");
                for (Guest otherGuest : booking.getOtherGuests()) {
                    System.out.println(otherGuest.getFirstName() + " " + otherGuest.getLastName());
                }
            }
        }

    }
}

