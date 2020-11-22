/*
    Author: Domenic Catalano & Duy Tan Vu
    Date: Sunday, November 19, 2020
    Program Name: OOP 3200 Java Lab 2
 */

package ca.durhamcollege;

import java.time.LocalDate;

// Main program
public class Main {
    public static void main(String[] args) {
        // Try-catch block
        try {
            // Set first work ticket with default parameter
            WorkTicket firstWorkTicket = new WorkTicket();

            // Set second work ticket with parameterized work ticket
            WorkTicket secondWorkTicket = new WorkTicket(1, "abc", LocalDate.of(2000, 12, 12), "something");

            // Print two ticket attributes using overridden toString() method
            System.out.println(firstWorkTicket.toString());
            System.out.println(secondWorkTicket.toString());

            // setWorkTicket method will return false if any of the input param is invalid
            if (!firstWorkTicket.setWorkTicket(1, "abc", LocalDate.of(2020, 10, 10), "dhasufh"))
                System.out.println("\nErrors! No changes to the first ticket.");
            else
                System.out.println("\nFirst work ticket are set with new attributes.");

            if (!secondWorkTicket.setWorkTicket(1, "abc", LocalDate.of(2000, 10, 10), "dhasufh"))
                System.out.println("\nErrors! No changes to the second ticket.");
            else
                System.out.println("\nSecond work ticket are set with new attributes.");

        } catch (IllegalArgumentException illegalArgumentException) {
            // Catch and print any IllegalArgumentException
            System.out.println(illegalArgumentException);
        }
    }
}
