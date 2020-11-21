/*
    Author: Domenic Catalano & Duy Tan Vu
    Date: Sunday, November 19, 2020
    Program Name: OOP 3200 Java Lab 2
 */

package ca.durhamcollege;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        try {

            WorkTicket firstWorkTicket = new WorkTicket();
            WorkTicket secondWorkTicket = new WorkTicket(2, "abc", LocalDate.of(2000, 12, 12), "something");
            System.out.println(firstWorkTicket.toString());
            System.out.println(secondWorkTicket.toString());

            if (firstWorkTicket.setWorkTicket(1, "abc", LocalDate.of(2020, 10, 10), "dhasufh"))
                System.out.println("\nErrors! No changes to the ticket made.");

            if (secondWorkTicket.setWorkTicket(1, "abc", LocalDate.of(2020, 10, 10), "dhasufh"))
                System.out.println("\nErrors! No changes to the ticket made.");
        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println(illegalArgumentException);
        }

    }
}
