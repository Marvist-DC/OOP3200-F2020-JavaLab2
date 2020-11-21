/*
    Author: Domenic Catalano & Duy Tan Vu
    Date: Sunday, November 19, 2020
    Program Name: OOP 3200 Java Lab 2
 */

package ca.durhamcollege;

import java.time.LocalDate;

public class WorkTicket {
    // PRIVATE INSTANCE VARIABLES
    final int MINIMUM_YEAR = 2000;
    final int MAXIMUM_YEAR = 2099;
    private int myTicketNumber;
    private String myClientID;
    private java.time.LocalDate myDate;
    private String myDescription;

    // PUBLIC PROPERTIES
    public int getMyTicketNumber() {
        return myTicketNumber;
    }

    public void setMyTicketNumber(int myTicketNumber) {
        if (myTicketNumber <= 0) {
            throw new IllegalArgumentException("Work ticket number must be greater than 0.");
        } else {
            this.myTicketNumber = myTicketNumber;
        }
    }

    public String getMyClientID() {
        return myClientID;
    }

    public void setMyClientID(String myClientID) {
        if (myClientID.length() < 1) {
            throw new IllegalArgumentException("Client ID and issue description must be at least 1 in length");
        } else {
            this.myClientID = myClientID;
        }
    }

    public LocalDate getMyDate() {
        return myDate;
    }

    public void setMyDate(LocalDate myDate) {
        int year = myDate.getYear();
        if (year < MINIMUM_YEAR || year > MAXIMUM_YEAR) {
            throw new IllegalArgumentException("Year must be in the range 2000-2099 inclusive");
        } else {
            this.myDate = myDate;
        }
    }

    public String getMyDescription() {
        return myDescription;
    }

    public void setMyDescription(String myDescription) {
        if (myDescription.length() < 1) {
            throw new IllegalArgumentException("Client ID and issue description must be at least 1 in length");
        } else {
            this.myDescription = myDescription;
        }
    }

    // CONSTRUCTORS
    WorkTicket() {
        myTicketNumber = 0;
        myClientID = null;
        myDate = null;
        myDescription = null;
    }

    WorkTicket(int myTicketNumber, String myClientID, LocalDate myDate, String myDescription) {
        int year = myDate.getYear();
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
    public boolean setWorkTicket(int myTicketNumber, String myClientID, LocalDate myDate, String myDescription) {
        boolean isValid = true;


        if (myTicketNumber <= 0 || myDate.getYear() < MINIMUM_YEAR || myDate.getYear() > MAXIMUM_YEAR) {
            isValid = false;
        } else if (myClientID.length() < 1 || myDescription.length() < 1) {
            isValid = false;
        }

        if (isValid) {
            setMyTicketNumber(myTicketNumber);
            setMyClientID(myClientID);
            setMyDate(myDate);
            setMyDescription(myDescription);
        }

        return isValid;
    }

    @Override
    public String toString() {
        return "\nWork Ticket #: " + myTicketNumber +
                "\nClient ID    : " + myClientID +
                "\nDate         : " + myDate +
                "\nIssue        : " + myDescription;
    }
}
