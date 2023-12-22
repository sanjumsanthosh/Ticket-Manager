package com.sanjay.TicketMaster;

import java.util.ArrayList;

public class Screen implements IScreen {

    // show and allSeat init
    Show show;

    Seat[] allSeats;


    Screen(int seatTotalCount){
        allSeats = new Seat[seatTotalCount];
    }



    // registerShow(show) -> this.show = show
    // registerASeat(seat) -> allSeats appends seat

    public void registerShow(Show show){
        this.show = show;
    }

    public void registerASeat(Seat seat) {
        allSeats[seat.seatNo-1] = seat;
    }

    @Override
    public void whatShowRunning() {

        // show details - JW4 running
        show.printShowName();


        // get me each seat "eachSeat" from "allSeats"
        for (Seat eachSeat : allSeats) { //
            eachSeat.printDetails();
        }

    }

}
