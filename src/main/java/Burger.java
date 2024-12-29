public class Burger {
    private String bun;
    private String type;
    private boolean makeItDouble;
    private Double price;
    private String description;

    private BurgerTopping bt1;
    private BurgerTopping bt2;
    private BurgerTopping bt3;

    private int numberOfToppings;

    public Burger(String bun, String type, boolean makeItDouble) {
        this.bun = bun;
        this.type = type;
        this.makeItDouble = makeItDouble;

        switch (type.toUpperCase()) {
            case "ANGUS" -> this.price = 10.9;
            case "HALLOUMI" -> this.price = 9.9;
            case "BEYOND" -> this.price = 11.9;
            default -> this.price = 9.95;
        }

        if (makeItDouble)
            price+=3;
        this.numberOfToppings = 0;
        this.description = makeItDouble ? "Double " : "Single ";
        this.description += type + " burger on " + bun + " bun";
    }

    public Burger() {
        this("wholewheat","beyond",false);
    }

    public void addTopping (String toppingType, int numberOfPieces) {
        switch(numberOfToppings) {
            case 0 -> {
                bt1 = createTopping(toppingType,numberOfPieces);
                numberOfToppings++;
                this.price += bt1.price;
                this.description += " with " + numberOfPieces + " " + bt1.getClass().getSimpleName();
            }
            case 1 -> {
                bt2 = createTopping(toppingType,numberOfPieces);
                numberOfToppings++;
                this.price += bt2.price;
                this.description += " and with " + numberOfPieces + " " + bt2.getClass().getSimpleName();
            }
            case 2 -> {
                bt3 = createTopping(toppingType,numberOfPieces);
                numberOfToppings++;
                this.price += bt3.price;
                this.description += "and with " + numberOfPieces + " " + bt3.getClass().getSimpleName();
            }
            default -> System.out.println("Maximum number of toppings reached!");
        }
    }

    public static BurgerTopping createTopping (String toppingType, int numberOfPieces) {
        return switch (toppingType) {
            case "onionRings" -> new OnionRings(numberOfPieces);
            case "cheeses" -> new Cheeses(numberOfPieces);
            case "dressings" -> new Dressings(numberOfPieces);
            default -> new BurgerTopping();
        };
    }

    public Double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
