package com.sanjay.TicketMaster;

public class Main {

    public static void main(String[] args) {

        // ticket booking
        Screen audi1 = new Screen(10);

        // Show
        Show johnwick4 = new Show("John Wick 4");


        audi1.registerShow(johnwick4);

        Seat seat1 = new Seat(1, "Balcony");
        Seat seat2 = new Seat(2, "VIP");
        Seat seat3 = new Seat(3, "Balcony");
        Seat seat4 = new Seat(4, "Balcony");
        Seat seat5 = new Seat(5, "VIP");
        Seat seat6 = new Seat(6, "Balcony");
        Seat seat7 = new Seat(7, "Balcony");
        Seat seat8 = new Seat(8, "VIP");
        Seat seat9 = new Seat(9, "Balcony");
        Seat seat10 = new Seat(10, "Balcony");

        audi1.registerASeat(seat1);
        audi1.registerASeat(seat2);
        audi1.registerASeat(seat3);
        audi1.registerASeat(seat4);
        audi1.registerASeat(seat5);
        audi1.registerASeat(seat6);
        audi1.registerASeat(seat7);
        audi1.registerASeat(seat8);
        audi1.registerASeat(seat9);
        audi1.registerASeat(seat10);



        //////---------------------------------------------------------------
        ////// CUSTOMER FLOW -----------------------------

        TicketCounter ticketCounter = new TicketCounter(audi1);
        ticketCounter.anyShowsAvailable();
//
//
//        User sanjay = new User("Sanjay M Santhosh", "Adult");
//        User athulya = new User("Athulya", "Adult");
//        User aadthiya = new User("Aadhitya", "Adult");
//        User sanjana = new User("Sanjana M Santhosh", "Adult");
//
//        ticketCounter.bookSeat(sanjay);
//        ticketCounter.bookSeat(athulya);
//        ticketCounter.bookSeat(aadthiya);
//        ticketCounter.bookSeat(sanjana);
//
//
//        ticketCounter.whatAreAvailableFoods();
//        ticketCounter.bookFood("Pizza", sanjay);
//        ticketCounter.bookFood("Pizza", sanjana);
//        ticketCounter.bookFood("Pop-corn", athulya);
//        ticketCounter.bookFood("Pop-corn", athulya);
    }

}
