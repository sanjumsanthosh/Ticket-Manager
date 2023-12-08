package com.sanjay.TicketMaster;

public interface ISeat {

    abstract public int getSeatNo();
    abstract public void book(IUser user);
    abstract public void bookFood(String food);
}
