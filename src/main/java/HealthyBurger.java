public class HealthyBurger extends Hamburger{

//    And for the third class, HealthyBurger, there will be four(4) additional member variables called healthyExtra1Name,
//    healthyExtra1Price, healthyExtra2Name, and healthyExtra2Price. The names are type String and the prices are type double.
//    The constructor for this class accepts two(2) parameters for meat and price. Those are set in the constructor
//    along with an appropriate name for the type of burger.
//
//    Two methods, addHealthyAddition1 and addHealthyAddition2 should be created that each accept a name and price for the addition,
//    allowing for up to two(2) addons to the basic healthy burger. And finally the itemizeHamburger method created in the Hamburger
//    class should be overridden to generate a message appropriate to the type of burger along with any addons.
//    The method also returns the total price of the healthy burger of type double.

    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String name, double price) {
        super(name, "Fazulejo", price, "Lowcarb");
    }

    public void addHealthyAddition1(String addition, double price) {
        healthyExtra1Name = addition;
        healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String addition, double price) {
        healthyExtra2Name = addition;
        healthyExtra2Price = price;
    }

    @Override
    public double itemizehamburger() {
        return super.itemizehamburger()+healthyExtra1Price+healthyExtra2Price;
    }
}
