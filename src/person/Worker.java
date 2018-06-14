package person;

public class Worker implements Person {

    protected String name;
    protected int Id,seniority;

    public Worker(String name, int id, int seniority) {

        this.name = name;
        Id = id;
        this.seniority = seniority;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getId() {
        return this.Id;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", Id=" + Id +
                ", seniority=" + seniority +
                '}';
    }
}
