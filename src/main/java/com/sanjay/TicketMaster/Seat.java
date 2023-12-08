package com.sanjay.TicketMaster;

public class Seat implements ISeat{

    int seatNo;
    IUser user;

    String food;


    @Override
    public int getSeatNo() {
        return seatNo;
    }

    @Override
    public void book(IUser user) {
        this.user = user;
    }

    @Override
    public void bookFood(String food) {
        this.food = food;
    }
}
