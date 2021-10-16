package day3.interfejs3;

public class Vegan implements Eating {

    @Override
    public void eat(Food food) {
        if(food.getFoodType().equals(FoodType.OWOCE)) {
            System.out.println("I'm eating fruits!");
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
