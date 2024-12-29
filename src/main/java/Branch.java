import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    private Customer findCustomer(String name) {
        for (Customer c : customers) {
            if (c.getName().equalsIgnoreCase(name))
                return c;
        }
        return null;
    }

    public boolean newCustomer(String name, double initTransaction) {
        if (findCustomer(name) == null) {
            customers.add(new Customer(name, initTransaction));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String name, double sum) {
        Customer c = findCustomer(name);
        if (c != null) {
            c.addTransaction(sum);
            return true;
        } else {
            return false;
        }
    }
}
