import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transactions;

    public String getName() {
        return name;
    }

    public Customer(String name, double initialTransaction) {
        this.name = name;
        transactions = new ArrayList<>();
        transactions.add(initialTransaction);
    }

    public boolean addTransaction(double sum) {
        try {
            transactions.add(sum);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

}
