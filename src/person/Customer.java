package person;

public class Customer implements Person{

    protected String name;
    protected int Id;

    public Customer(String name, int id) {
        this.name = name;
        Id = id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getId() {
        return this.Id;
    }
}
