package bank;

public class MainOffice extends Department{

    protected int workersNumber;
    public MainOffice(String name, int customerNumber, int workersNumber) {
        super(name, customerNumber);
        this.workersNumber = workersNumber;
    }
}
