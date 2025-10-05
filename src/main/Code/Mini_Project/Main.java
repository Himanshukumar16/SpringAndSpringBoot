package Mini_Project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

// mini project for practice -> Contact book.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(Contacts.class)
                .addAnnotatedClass(Number.class)
                .configure()
                .buildSessionFactory();

        Session s = sf.openSession();

        Transaction t = s.beginTransaction();

        while(true) {

            System.out.println("Enter the Choice : ");
            System.out.println("1) for Searching any number");
            System.out.println("2) for Adding any number");
            System.out.println("3) for Deleting any number");
            System.out.println("4) Exit");
            int n = sc.nextInt();
            if(n == 1) {
                System.out.println("Enter Name of Person : ");
                String name = sc.next();

            }
            if(n == 2){
                Contacts c = new Contacts();
                System.out.println("Enter Name of Person : ");
                String name = sc.next();
                c.setName(name);
                System.out.println("Enter number of person : ");
                String num = sc.next();
                c.setNum(num);
                s.persist(c);
            }
            if(n == 3) {}
            if(n == 4) break;
            t.commit();
            if(n < 1 || n > 4) System.out.println("Wrong input !");
        }
        s.close();
        sf.close();
    }
}
