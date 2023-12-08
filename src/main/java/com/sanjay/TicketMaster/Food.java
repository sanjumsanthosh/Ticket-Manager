package com.sanjay.TicketMaster;

public class Food implements IFood{

    String[] foods;

    @Override
    public String[] getAllFood() {
        return foods;
    }

    @Override
    public void bookAFoodToSeat(String food, ISeat seat) {
        seat.bookFood(food);
    }
}
