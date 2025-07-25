

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.setSid(4);
        s1.setSname("Chanchala");
        s1.setSgpa(8.70);

        Configuration con = new Configuration();
        con.addAnnotatedClass(Students.class);
        con.configure();
        SessionFactory sf = con.buildSessionFactory();
        Session s = sf.openSession();
        Transaction tr = s.beginTransaction();
        s.save(s1);
        tr.commit();
    }
}
