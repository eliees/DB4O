package bank;

public class MainOffice extends Department{

    protected int workersNumber;
    public MainOffice(String name, String customerNumber, int workersNumber) {
        super(name, customerNumber);
        this.workersNumber = workersNumber;
    }
}
