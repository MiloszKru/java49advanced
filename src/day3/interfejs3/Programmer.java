package day3.interfejs3;

public class Programmer implements Eating {

    @Override
    public void eat(Food food) {
        if(food.getFoodType().equals(FoodType.MIĘSO)) {
            System.out.println("I'm eating meat!");
        } else if (food.getFoodType().equals(FoodType.NABIAL)) {
            System.out.println("I'm eating dairy!");
        } else if (food.getFoodType().equals(FoodType.OWOCE)) {
            System.out.println("I'm eating fruits!");
        } else {
            System.out.println("I cant eat it :(");
        }

    }

    @Override
    public int howManyMealsEaten() {
        return 0;
    }

    @Override
    public int howManyGramsEaten() {
        return 0;
    }
}
