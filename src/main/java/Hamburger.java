public class Hamburger {
    private String name;
    private String meat;
    private String breadRollType;
    private double price;

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;


    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
    }

    public void addHamburgerAddition1(String addition, double price) {
        addition1Name = addition;
        addition1Price = price;
    }

    public void addHamburgerAddition2(String addition, double price) {
        addition1Name = addition;
        addition1Price = price;
    }
    public void addHamburgerAddition3(String addition, double price) {
        addition1Name = addition;
        addition1Price = price;
    }
    public void addHamburgerAddition4(String addition, double price) {
        addition1Name = addition;
        addition1Price = price;
    }

    public double itemizehamburger(){
        return price+addition1Price+addition2Price+addition3Price+addition4Price;
    }

}
