import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(Students.class)
                .configure()
                .buildSessionFactory();

        Session s = sf.openSession();

        Students detail = s.get(Students.class,4);
        s.close();
        sf.close();

        System.out.println(detail.getSname()+" : "+detail.getSgpa());
    }
}