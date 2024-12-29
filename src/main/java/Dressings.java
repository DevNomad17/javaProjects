public class Dressings extends BurgerTopping{
    private int numberOfDressings;
    private static double pricePerDressing = 1.2;

    public Dressings(int numberOfDressings) {
        super(numberOfDressings * pricePerDressing);
    }
}
