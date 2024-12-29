public class MealOrder {
    private Burger burger;
    private Drink drink;
    private Side side;

    public MealOrder(String burgerType, String burgerBan, Boolean burgerDouble, String drinkType, String drinkSize, Boolean drinkIce, String sideType, String sideSize) {

        this.burger = new Burger(burgerBan, burgerType, burgerDouble);
        this.drink = new Drink(drinkType, drinkSize, drinkIce);
        this.side = new Side(sideType, sideSize);
    }

    public MealOrder() {
        this.burger = new Burger();
        this.drink = new Drink();
        this.side = new Side();
    }

    public void addBurgerTopping(String toppingType, int numberOfPieces) {
        burger.addTopping(toppingType, numberOfPieces);
    }

    public void printReceipt() {
        System.out.println();
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.printf("%-75s %.2f%n", burger.getDescription(), burger.getPrice());
        System.out.printf("%-75s %.2f%n", drink.getDescription(), drink.getPrice());
        System.out.printf("%-75s %.2f%n", side.getDescription(), side.getPrice());
        System.out.printf("%n%-75s %.2f%n", "Total: ", burger.getPrice()+ drink.getPrice()+ side.getPrice());
    }
}
