public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        if (balance < 0)
            System.out.println("Balance must be positive");
        else
            this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double sum) {
        if (sum <= 0)
            System.out.println("Deposit must be greater than zero");
        else {
            this.balance += sum;
            System.out.format("Deposit successful. New balance is: %.2f%n", this.balance);
        }
    }

    public void withdrawal(double sum) {
        if (sum <= 0 || sum >= this.balance)
            System.out.println("Withdrawal must be greater than zero and smaller than current balance");
        else {
            this.balance -= sum;
            System.out.format("Withdrawal successful. New balance is: %.2f%n", this.balance);
        }
    }
}
