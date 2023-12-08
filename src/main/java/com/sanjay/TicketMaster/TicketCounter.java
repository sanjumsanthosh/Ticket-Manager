package com.sanjay.TicketMaster;

public class TicketCounter implements ITicketCounter{

    IScreen screen;
    IFood food;



    @Override
    public void getShows() {
        IShow show = screen.getMeDetailsOfShow();
        System.out.println(show.whatIsTheShow());
    }

    @Override
    public void bookASeat(int seatNo, IUser user) {
        screen.bookASeat(seatNo, user);
    }

    @Override
    public void getAllFoodItems() {
        String[] foodItems = food.getAllFood();
        for (String foodItem : foodItems) {
            System.out.println(foodItem);
        }
    }

    @Override
    public void bookAFood(String food, ISeat seat) {
        this.food.bookAFoodToSeat(food, seat);
    }
}
