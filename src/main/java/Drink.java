public class Drink {
    private String type;
    private double price;
    private String size;
    private boolean ice;
    private String description;

    public Drink(String type, String size, boolean ice) {
        this.type = type;
        this.size = size;
        this.ice = ice;
        this.price = (size.toUpperCase().equals("MEDIUM")) ? 1.5 : 2;
        this.description = this.size + " " + this.type;
        this.description += (ice) ? " with ice" : " without ice";
    }

    public Drink() {
        this("coke", "Medium",true);
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
