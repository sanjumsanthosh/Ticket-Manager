package com.sanjay.TicketMaster;

public class Screen implements IScreen{

    IShow show ;
    ISeat[] seats;

    @Override
    public IShow getMeDetailsOfShow() {
        return show;
    }

    @Override
    public ISeat[] getMeDetailsOfSeats() {
        return seats;
    }

    @Override
    public void bookASeat(int seatNo, IUser user) {
        // loop though all seats
        for(ISeat seat: seats){
            // check if seatno matches a seat
            if (seat.getSeatNo() == seatNo){
                // book the seat wiht the user
                seat.book(user);
            }
        }
    }
}
