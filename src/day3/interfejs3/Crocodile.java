package day3.interfejs3;

public class Crocodile implements Eating {

    @Override
    public void eat(Food food) {
        if(food.getFoodType().equals(FoodType.MIĘSO)) {
            System.out.println("I'm eating meat!");
        } else {
            System.out.println("I can't eat it :(");
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
