package bank;

public abstract class Department {
    protected String name;
    protected String customerNumber;

    public Department(String name, String customerNumber) {
        this.name = name;
        this.customerNumber = customerNumber;
    }
}
