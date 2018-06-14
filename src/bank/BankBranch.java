package bank;

public class BankBranch extends Department {

    protected int managerId;
    public BankBranch(String name, int customerNumber, int managerId) {
        super(name, customerNumber);
        this.managerId = managerId;
    }
}
