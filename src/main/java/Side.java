public class Side {
    private String type;
    private double price;
    private String size;
    private String description;

    public Side(String type, String size) {
        this.type = type;
        this.size = size;

        this.price = (this.type.toUpperCase().contains("FRIES")) ? 2 : 2.5;
        this.price += (this.size.equalsIgnoreCase("MEDIUM")) ? 0 : 1;

        this.description = this.size + " sized " + this.type;
    }

    public Side() {
        this("salty fries","Medium");
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
