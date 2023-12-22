package com.sanjay.TicketMaster;

public class Seat implements ISeat{

    int seatNo;
    String seatType;

    Seat(int seatNo, String seatType){
        this.seatNo = seatNo;
        this.seatType = seatType;
    }

    @Override
    public void printDetails() {
        // Seat 1 - Regular seat
        System.out.println("Seat "+seatNo+" - "+seatType);
    }
}
