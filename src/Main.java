import com.engeto.hotel.Guest;
import com.engeto.hotel.Room;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Guest guest1 = new Guest();
        Guest guest2 = new Guest();

        guest1.setFirstName("Adéla");
        guest1.setLastName("Malíková");
        guest1.setDateOfBirth(LocalDate.of(1993, 3,13));


        guest2.setFirstName("Jan");
        guest2.setLastName("Dvořáček");
        guest2.setDateOfBirth(LocalDate.of(1995, 5,5));

        guest2.setDateOfBirth(LocalDate.of(1995, 4,5));

        System.out.println("Jméno a datum narození hosta: " + guest2.getFirstName() + " " + guest2.getLastName()
                + " " + "(" + guest2.getDateOfBirth() + ")");

        Room room1 = new Room(1, 101, true, true, new BigDecimal(1000));
        Room room2 = new Room(1, 102, true, true, new BigDecimal(1000));
        Room room3 = new Room(3, 103, false, true, new BigDecimal(2400));
   }
}