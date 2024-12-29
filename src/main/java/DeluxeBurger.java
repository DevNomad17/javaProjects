public class DeluxeBurger extends Hamburger{

//    For the second class, DeluxeBurger, there are no additional member variables, and the constructor accepts no parameters. Instead,
//    the constructor creates a deluxe burger with all the fixings and chips and a drink for a base price of $19.10. The constructor
//    can be configured in any way, as long as chips and drink are added for the total price just mentioned.
//    In this class, the four(4) methods defined in the Hamburger class for including additional toppings
//    must each be overridden so that a message is printed stating that no additional items can be added to a deluxe burger.

    public DeluxeBurger() {
        super("DeluxeBurger", "Beyond meat", 19.10, "Wholegrain");
    }

    @Override
    public void addHamburgerAddition1(String addition, double price) {
        System.out.println("No additional items can be added to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String addition, double price) {
        System.out.println("No additional items can be added to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String addition, double price) {
        System.out.println("No additional items can be added to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String addition, double price) {
        System.out.println("No additional items can be added to a deluxe burger");
    }
}
