public class SalariedEmployee extends Employee{

    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = false;
    }

    public void retire() {
        super.terminate("01/01/2023");
        isRetired = true;
    }

    @Override
    public double collectPay() {
        return annualSalary*(Integer.parseInt(this.endDate.substring(6))-Integer.parseInt(this.getHireDate().substring(6)));
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                "} " + super.toString();
    }
}
