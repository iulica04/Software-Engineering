// Decompiled by DJ v3.10.10.93 Copyright 2007 Atanas Neshkov  Date: 20.03.2024 19:03:10
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   Ride.java

import java.time.LocalTime;
import java.util.Vector;

public class Ride
{

    public Ride()
    {
    }

    private Location startLocation;
    private Location endLocation;
    private LocalTime startTime;
    private LocalTime endTime;
    private String status;
    private Passenger passenger;
    private Driver driver;
    public Driver myDriver;
    public Vector myLocation;
    public Passenger myPassenger;
}