package person;

public class Teller  extends Worker{

    protected int bankBranch;
    public Teller(String name, int id, int seniority, int bankBranch) {
        super(name, id, seniority);
        this.bankBranch = bankBranch;
    }
}
