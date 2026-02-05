package edu.pdx.cs.joy.pair12;

public class Flight {
    private final String name;
    private final int startTime;
    private final int endTime;
    private final int price;

    public Flight(String name, int startTime, int duration, int price) {
        this.name = name;
        this.startTime = startTime;
        this.endTime = duration;
        this.price = price;
    }
}
