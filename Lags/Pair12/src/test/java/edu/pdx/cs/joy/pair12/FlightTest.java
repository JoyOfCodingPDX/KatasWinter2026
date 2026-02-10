package edu.pdx.cs.joy.pair12;

import org.junit.jupiter.api.Test;

public class FlightTest {

    @Test
    public void canCreateFlightWithAllArgs() {
        String name = "AF514";
        int startTime = 0;
        int duration = 5;
        int price = 10;

        Flight flight = new Flight(name, startTime, duration, price);
    }
}
