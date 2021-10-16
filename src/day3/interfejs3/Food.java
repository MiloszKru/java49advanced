package day3.interfejs3;

public class Food {

    protected String name;
    protected String foodType;
    protected int weight;

    public Food(String name, String foodType, int weight) {
        this.name = name;
        this.foodType = foodType;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getFoodType() {
        return foodType;
    }
    public int getWeight() {
        return weight;
    }
}
