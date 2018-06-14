package bank;

public class BankBranch extends Department {

    protected String managerId;
    public BankBranch(String name, String customerNumber, String managerId) {
        super(name, customerNumber);
        this.managerId = managerId;
    }
}
