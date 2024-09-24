package com.flight.dao;

import com.flight.bean.Flight;

public class FlightDAO {
    public String createComputeId(Flight flight) throws Exception {
        String flightName = flight.getFlightName();
        String flightID = flight.getFlightID();

        // Check if flightName and flightID are at least 4 characters long
        if (flightName.length() < 4 || flightID.length() < 4) {
            throw new Exception("Flight name and flight ID must be at least 4 characters long.");
        }

        // Create Client ID
        String clientId = flightName.substring(0, 4).toUpperCase() + flightID.substring(flightID.length() - 4);
        return clientId;
    }
}
