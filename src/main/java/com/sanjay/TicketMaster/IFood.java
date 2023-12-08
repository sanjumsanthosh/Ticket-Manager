package com.sanjay.TicketMaster;

public interface IFood {

    abstract public String[] getAllFood();

    abstract public void bookAFoodToSeat(String food, ISeat seat);
}
