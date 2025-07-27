import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        Students s1 = new Students();

        s1.setSname("Sibu");
        s1.setSgpa(7.6);
        s1.setSid(7);

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(Students.class)
                .configure()
                .buildSessionFactory();

        Session s = sf.openSession();
        Students detail = null;

        Transaction tr = s.beginTransaction();
        s.merge(s1);
        tr.commit();

        for(int i = 1; i <= 7; i++){

            detail = s.get(Students.class,i);
            System.out.println(detail.getSname()+" : "+detail.getSgpa());
        }

        s.close();
        sf.close();
    }
}