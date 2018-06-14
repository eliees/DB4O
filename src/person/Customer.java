package person;

public class Customer implements Person{

    protected String name;
    protected int Id;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getId() {
        return this.Id;
    }
}
