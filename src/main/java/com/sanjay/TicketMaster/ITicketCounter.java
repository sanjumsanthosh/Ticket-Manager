package com.sanjay.TicketMaster;

public interface ITicketCounter {

    abstract public void getShows();
    abstract public void bookASeat(int seatNo, IUser user);

    abstract public void getAllFoodItems();

    abstract public void bookAFood(String food, ISeat seat);
}
