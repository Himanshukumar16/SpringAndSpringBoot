package Hibernate_Revisit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Aliens a = new Aliens();
        Laptop l1 = new Laptop();
        l1.setLname("Dell");
        l1.setLram(32);
        l1.setLmodel("Dell-123");
        l1.setLid(1);

        a.setAid(101);
        a.setAname("Himanshu");
        a.setAtech("Java");
        a.setLaptop(l1);

        SessionFactory sf = new Configuration()
                            .addAnnotatedClass(Aliens.class)
                            .addAnnotatedClass(Laptop.class)
                            .configure()
                            .buildSessionFactory();

        Session s = sf.openSession();

        Transaction t = s.beginTransaction(); // for writing ,update use transaction.
//        s.persist(u2); // for writing.
//        s.merge(u3); // for updating and writing also.

        // to delete :
//        u2 = s.find(University.class,5);// find in database.
//        s.remove(u2);//delete.
        s.persist(a);
        s.persist(l1);

        t.commit();

//        u3 = s.find(University.class,4); // for reading
//        System.out.println(u3);

        s.close();
        sf.close();

    }
}
