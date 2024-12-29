public class OnionRings extends BurgerTopping {
    private int numberOfOnionRings;
    private static double pricePerPiece = 0.5;

    public OnionRings(int numberOfOnionRings) {
        super(numberOfOnionRings * pricePerPiece);
    }
}
