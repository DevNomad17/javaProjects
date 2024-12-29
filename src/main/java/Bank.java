import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        branches = new ArrayList<>();
    }

    private Branch findBranch(String name) {
        for (Branch c : branches) {
            if (c.getName().equalsIgnoreCase(name))
                return c;
        }
        return null;
    }

    public boolean addBranch(String name) {
        if (findBranch(name) == null) {
            branches.add(new Branch(name));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initTransaction) {
        Branch b = findBranch(branchName);
        if (b != null) {
            if (b.newCustomer(customerName,initTransaction))
                return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch b = findBranch(branchName);
        if (b != null) {
            if (b.addCustomerTransaction(customerName,transaction))
                return true;
        }
        return false;
    }


    public boolean listCustomers(String name, boolean printTransactions) {
        Branch b = findBranch(name);
        if (b == null)
            return false;
        if (printTransactions) {
            System.out.println("Customer details for branch " + b.getName());
            int i = 0;
            for (Customer c : b.getCustomers()) {
                i++;
                System.out.printf("Customer: %s[%d]%nTransactions %n",c.getName(),i);
                int j = 0;
                for (double d : c.getTransactions()) {
                    j++;
                    System.out.printf("[%d]%tAmount %.2f%n",j,d);
                }
            }
        }
        return true;
    }

}
