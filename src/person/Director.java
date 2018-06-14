package person;

public class Director extends Worker {
    protected int wage;

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public Director(String name, int id, int seniority , int wage) {
        super(name, id, seniority);
        this.wage = wage;
    }
}
