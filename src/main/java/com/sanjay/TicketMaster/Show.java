package com.sanjay.TicketMaster;

public class Show implements IShow{

    String showName;

    Show(String showName){
        this.showName = showName;
    }

    @Override
    public void printShowName() {
        System.out.println("Film : "+showName);
    }
}
