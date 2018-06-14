package bank;

public abstract class Department {
    protected String name;
    protected int customerNumber;

    public Department(String name, int customerNumber) {
        this.name = name;
        this.customerNumber = customerNumber;
    }
}
