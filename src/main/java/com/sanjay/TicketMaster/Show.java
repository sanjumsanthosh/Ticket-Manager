package com.sanjay.TicketMaster;

public class Show implements IShow {

    String showName;

    @Override
    public String whatIsTheShow() {
        return showName;
    }
}
