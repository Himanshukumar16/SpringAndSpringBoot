import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.sql.Array;
import java.sql.ResultSet;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        SessionFactory sf = new Configuration()
                .addAnnotatedClass(Students.class)
                .configure()
                .buildSessionFactory();

        Session s = sf.openSession();

        Transaction tr = s.beginTransaction();

//        System.out.println("Enter number of input you want to enter !");
//        int n = sc.nextInt();

//        int sid = 0;
//        String sname = null;
//        double sgpa = 0.0;

//        for (int i = 0; i < n; i++) {
//
//            System.out.println("Enter id of student (MANDATORY)");
//            sid = sc.nextInt();
//            s1.setSid(sid);
//            s.merge(s1);
//            System.out.println("Enter CGPA of student !");
//            sgpa = sc.nextDouble();
//            s1.setSgpa(sgpa);
//            s.merge(s1);
//            System.out.println("Enter name of student !");
//            sname = sc.next();
//            s1.setSname(sname);
//            s.merge(s1);
//        }

//        TypedQuery<Students> query = s.createQuery("FROM Students ORDER BY sgpa DESC", Students.class);
//        List<Students> list = query.getResultList();
//
//        for(Students std : list){
//            System.out.println(std.toString());
//        }
//

        tr.commit();

        s.close();
        sf.close();
    }
}