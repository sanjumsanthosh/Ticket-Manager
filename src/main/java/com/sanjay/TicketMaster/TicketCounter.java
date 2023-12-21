package com.sanjay.TicketMaster;

public class TicketCounter implements ITicketCounter {

    Screen screen;

    TicketCounter(Screen screen){
        this.screen = screen;
    }

    @Override
    public void anyShowsAvailable() {
        screen.whatShowRunning();
    }
}
