import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        Students s1 = new Students();


        SessionFactory sf = new Configuration()
                .addAnnotatedClass(Students.class)
                .configure()
                .buildSessionFactory();

        Session s = sf.openSession();

        Transaction tr = s.beginTransaction();

        tr.commit();

        s.close();
        sf.close();
    }
}