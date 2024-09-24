package com.flight.service;

import com.flight.bean.Flight;
import com.flight.dao.FlightDAO;

import java.io.FileWriter;
import java.io.IOException;

public class FlightService {
    public static void main(String[] args) {
        Flight flight = new Flight();
        FlightDAO flightDAO = new FlightDAO();

        // Sample flight details
        flight.setFlightID("123456");
        flight.setFlightName("SuperJet");
        flight.setSource("New York");
        flight.setDestination("Los Angeles");
        flight.setEconomySeats(150);
        flight.setBusinessSeats(50);
        flight.setFirstClassSeats(20);
        flight.setFlightType("Commercial");

        try {
            String clientId = flightDAO.createComputeId(flight);

            // Write flight details to file
            try (FileWriter writer = new FileWriter("flightdata.txt", true)) {
                writer.write("Client ID: " + clientId + "\n");
                writer.write("Flight ID: " + flight.getFlightID() + "\n");
                writer.write("Flight Name: " + flight.getFlightName() + "\n");
                writer.write("Source: " + flight.getSource() + "\n");
                writer.write("Destination: " + flight.getDestination() + "\n");
                writer.write("Economy Seats: " + flight.getEconomySeats() + "\n");
                writer.write("Business Seats: " + flight.getBusinessSeats() + "\n");
                writer.write("First Class Seats: " + flight.getFirstClassSeats() + "\n");
                writer.write("Flight Type: " + flight.getFlightType() + "\n");
                writer.write("-------------------------\n");
            } catch (IOException e) {
                System.err.println("Error writing to file: " + e.getMessage());
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

