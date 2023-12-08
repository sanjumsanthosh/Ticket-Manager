package com.sanjay.TicketMaster;

public interface IScreen {

    abstract public IShow getMeDetailsOfShow();
    abstract public ISeat[] getMeDetailsOfSeats();
    abstract public void bookASeat(int seatNo, IUser user);

}
