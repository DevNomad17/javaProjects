public class Cheeses extends BurgerTopping{
    private int numberOfCheeses;
    private static double pricePerCheese = 0.8;

    public Cheeses(int numberOfCheeses) {
        super(numberOfCheeses * pricePerCheese);
    }
}
