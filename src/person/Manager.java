package person;

import java.util.Vector;

public class Manager extends Worker{

    protected Vector<String> area;
    public Manager(String name, int id, int seniority, Vector<String> area) {
        super(name, id, seniority);
        this.area = area;
    }


}
