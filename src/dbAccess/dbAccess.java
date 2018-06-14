package dbAccess;

import bank.BankBranch;
import bank.MainOffice;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import person.Customer;
import person.Director;
import person.Manager;
import person.Worker;

import java.util.Vector;

public class dbAccess {
    public dbAccess() {
        ObjectContainer db=Db4o.openFile("dbo4File");

        try {
            // do something with db4o

            /* dodawanie obiektow do  bazy danych*/
            Customer customer1 =new Customer("Davidek Stefansky",1);
            Director dir1=new Director("Arkadiusz Mik",1,1, 3000);

            BankBranch bb1=new BankBranch("Ambergold",10000,1);
            MainOffice mo1 = new MainOffice("W1-Warszawa", 41,3);
            db.store(customer1);
            db.store(dir1);
            db.store(bb1);
            db.store(mo1);
            Vector<String> area =new Vector<String>();
            area.add("Warszawa");
            area.add("Legionowo");
        Manager man1=new Manager("Lukasz Kac",1,3,area );
            db.store(man1);

            {
                /* wypisywanie obiektow 'Worker' */
                ObjectSet result = db.queryByExample(Worker.class);
                ListResult(result);
            }

        }
        finally {
            db.close();
        }
    }

    public static void ListResult(ObjectSet result)
    {
        for (Object object : result)
        {
            System.out.println(object);
        }
    }

}
