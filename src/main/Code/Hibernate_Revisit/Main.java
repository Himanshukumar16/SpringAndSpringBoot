package Hibernate_Revisit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Aliens a = new Aliens();

        a.setAid(101);
        a.setAname("Himanshu");
        a.setAtech("Java");

        SessionFactory sf = new Configuration()
                            .addAnnotatedClass(Aliens.class)
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

        t.commit();

//        u3 = s.find(University.class,4); // for reading
//        System.out.println(u3);

        s.close();
        sf.close();

    }
}
