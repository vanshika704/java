// Prog9: Create a class Flight in the package com.flight.bean with flightID,
// flightName, source, destination, economySeats, businessSeats, firstClassSeats, flightType 
//as the attributes. Define the getter and setter methods for the attributes in the class. 
//Create a class FlightDAO in the package com.flight.dao. Create a method createComputeId()
// which will return the Clientid which is a combination of first four characters of flightName in
// uppercase followed by last four digits of flightId. If the flightname or flight id is of length less then
// 4, it will throw an exception. Create a main method in the flightservice class created in a package com.flight
//.service to store all the details of the flight (clientid, client name, flightid, flightname etc. ) in the file “flightdata.txt”.

package com.flight.bean;

public class Flight {
    private String flightID;
    private String flightName;
    private String source;
    private String destination;
    private int economySeats;
    private int businessSeats;
    private int firstClassSeats;
    private String flightType;

    // Getters and Setters
    public String getFlightID() {
        return flightID;
    }

    public void setFlightID(String flightID) {
        this.flightID = flightID;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getEconomySeats() {
        return economySeats;
    }

    public void setEconomySeats(int economySeats) {
        this.economySeats = economySeats;
    }

    public int getBusinessSeats() {
        return businessSeats;
    }

    public void setBusinessSeats(int businessSeats) {
        this.businessSeats = businessSeats;
    }

    public int getFirstClassSeats() {
        return firstClassSeats;
    }

    public void setFirstClassSeats(int firstClassSeats) {
        this.firstClassSeats = firstClassSeats;
    }

    public String getFlightType() {
        return flightType;
    }

    public void setFlightType(String flightType) {
        this.flightType = flightType;
    }
}

