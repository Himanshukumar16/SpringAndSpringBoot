package Hibernate_Revisit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        Aliens a1 = new Aliens();
//        a1.setAid(102);
//        a1.setAname("Anurag");
//        a1.setAtech("Java");
//
//        Aliens a = new Aliens();
//        a.setAid(101);
//        a.setAname("Himanshu");
//        a.setAtech("Java");
//
//        Laptop l1 = new Laptop();
//        l1.setLname("Dell");
//        l1.setLram(32);
//        l1.setLmodel("Dell-123");
//        l1.setLid(1);
//
//        Laptop l2 = new Laptop();
//        l2.setLname("Apple");
//        l2.setLram(64);
//        l2.setLmodel("Mackbook-Air m1");
//        l2.setLid(2);
//
//        Laptop l3 = new Laptop();
//        l3.setLname("Apple");
//        l3.setLram(8);
//        l3.setLmodel("I-pad");
//        l3.setLid(3);

//        l3.setAlien(Arrays.asList(a,a2));
//        l1.setAlien(Arrays.asList(a,a1));
//        l2.setAlien(Arrays.asList(a,a1,a2));

//        a.setLaptop(Arrays.asList(l1,l2));
//        a1.setLaptop(Arrays.asList(l3));

        SessionFactory sf = new Configuration()
//                .addAnnotatedClass(Aliens.class)
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
//        s.persist(a);
//        s.persist(a1);
//        s.persist(l1);
//        s.persist(l2);
//        s.persist(l3);

        t.commit();

//        u3 = s.find(University.class,4); // for reading
//        System.out.println(u3);

        Laptop p = s.get(Laptop.class,1);

        System.out.println(p);

        s.close();

        Session ses = sf.openSession();
        Laptop per = ses.get(Laptop.class,1);

        System.out.println(per);

        ses.close();
        sf.close();
    }
}
