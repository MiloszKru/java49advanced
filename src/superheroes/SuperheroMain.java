package superheroes;

public class SuperheroMain {
    public static void main(String[] args) {

        SuperHero hero1 = new SuperHero("Superman", "Fly");
        SuperHero hero2 = new SuperHero("Spiderman", "WallClimbing");
        SuperHero hero3 = new SuperHero("Hero3", "Invisibility");

        hero1 = hero2;
        hero1 = null;
        System.out.println(hero2 == null);

        hero1 = null;
        hero2 = hero1;
        hero1 = hero3;

        System.out.println(hero1 == null);
        System.out.println(hero2 == null);
        System.out.println(hero3 == null);

        String cat = new String("cat");
        String dog = new String("dog");

        System.out.println(cat.equals(dog));
        System.out.println(cat == dog);
    }

}
