/*
    Author: Domenic Catalano & Duy Tan Vu
    Date: Sunday, November 19, 2020
    Program Name: OOP 3200 Java Lab 2
 */

package ca.durhamcollege;

import java.time.LocalDate;

public class WorkTicket {

    // PRIVATE INSTANCE VARIABLES
    final int MINIMUM_YEAR = 2000;          // Minimum allowable year entry
    final int MAXIMUM_YEAR = 2099;          // Maximum allowable year entry
    private int myTicketNumber;             // Holds users ticket number
    private String myClientID;              // Holds users client ID
    private java.time.LocalDate myDate;     // Holds date ticket was issued
    private String myDescription;           // Describes the problem the user is facing

    // PUBLIC PROPERTIES

    // Retrieves the ticket number
    public int getMyTicketNumber() {
        return myTicketNumber;
    }

    // Validates the ticket number prior to setting it
    public void setMyTicketNumber(int myTicketNumber) {
        if (myTicketNumber <= 0) {
            throw new IllegalArgumentException("Work ticket number must be greater than 0.");
        } else {
            this.myTicketNumber = myTicketNumber;
        }
    }

    // Retrieves the client ID
    public String getMyClientID() {
        return myClientID;
    }

    // Validates the client ID prior to setting it
    public void setMyClientID(String myClientID) {
        if (myClientID.length() < 1) {
            throw new IllegalArgumentException("Client ID and issue description must be at least 1 in length");
        } else {
            this.myClientID = myClientID;
        }
    }

    // Retrieves the date
    public LocalDate getMyDate() {
        return myDate;
    }

    // Validates the year prior to setting the date
    public void setMyDate(LocalDate myDate) {
        int year = myDate.getYear();
        if (year < MINIMUM_YEAR || year > MAXIMUM_YEAR) {
            throw new IllegalArgumentException("Year must be in the range 2000-2099 inclusive");
        } else {
            this.myDate = myDate;
        }
    }

    // Retrieves the description of the ticket
    public String getMyDescription() {
        return myDescription;
    }

    // Sets the description of the ticket upon passiong validation
    public void setMyDescription(String myDescription) {
        if (myDescription.length() < 1) {
            throw new IllegalArgumentException("Client ID and issue description must be at least 1 in length");
        } else {
            this.myDescription = myDescription;
        }
    }

    // CONSTRUCTORS

    // Default Constructor
    WorkTicket() {
        myTicketNumber = 0;
        myClientID = null;
        myDate = null;
        myDescription = null;
    }

    // Parameterized Constructor
    WorkTicket(int myTicketNumber, String myClientID, LocalDate myDate, String myDescription) {
        int year = myDate.getYear();

        // If statement ensure valid year was entered, otherwise an appropriate exception will be thrown
        if (year < MINIMUM_YEAR || year > MAXIMUM_YEAR) {
            throw new IllegalArgumentException("Year must be in the range 2000-2099 inclusive");
        } else if (myTicketNumber <= 0) {
            throw new IllegalArgumentException("Work ticket number must be greater than 0.");
        } else if (myClientID.length() < 1 || myDescription.length() < 1) {
            throw new IllegalArgumentException("Client ID and issue description must be at least 1 in length");
        } else {
            setMyTicketNumber(myTicketNumber);
            setMyClientID(myClientID);
            setMyDate(myDate);
            setMyDescription(myDescription);
        }
    }


    // PUBLIC METHODS

    // Method to set a work ticket. Will also ensure the year is valid before creation
    public boolean setWorkTicket(int myTicketNumber, String myClientID, LocalDate myDate, String myDescription) {
        boolean isValid = true;


        if (myTicketNumber <= 0 || myDate.getYear() < MINIMUM_YEAR || myDate.getYear() > MAXIMUM_YEAR) {
            isValid = false;
        } else if (myClientID.length() < 1 || myDescription.length() < 1) {
            isValid = false;
        }

        // If the year passes validation, then set the work tickets attributes
        if (isValid) {
            setMyTicketNumber(myTicketNumber);
            setMyClientID(myClientID);
            setMyDate(myDate);
            setMyDescription(myDescription);
        }

        return isValid;
    }

    // Simple overrid of the toString() method
    @Override
    public String toString() {
        return "\nWork Ticket #: " + myTicketNumber +
                "\nClient ID    : " + myClientID +
                "\nDate         : " + myDate +
                "\nIssue        : " + myDescription;
    }
}
