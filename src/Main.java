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

        // Pokus o vytvoření objektu rezervace pomocí nově vytvořené třídy Booking - zatím nefunkční

//        Booking booking1 = new Booking(guest1, room1, "Rekreační", LocalDate.of(2021, 7, 1),
//                LocalDate.of(2021, 7, 14), null);
//        Booking booking2 = new Booking(guest2, room3, "Pracovní", LocalDate.of(2021, 9, 1),
//                LocalDate.of(2021, 9, 14), guest1);

        Composition(room1, room3);

        guestList(guest1, guest2);


    }

    private static void Composition(Room room1, Room room3) {
    }

    private static void guestList(Guest guest1, Guest guest2) {
        List<Guest> guestsList = new ArrayList<>();

        guestsList.add(guest1);
        guestsList.add(guest2);
        guestsList.addAll(List.of(guest1, guest2));


    }
}

