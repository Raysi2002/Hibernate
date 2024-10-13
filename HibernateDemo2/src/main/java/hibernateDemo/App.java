package hibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

//        ------Multiple Data Insertion at same time --------
        Scanner sc = new Scanner(System.in);

        System.out.println("----------Please Enter data---------- ");
        String str = "";

        try{
            while (!str.equalsIgnoreCase("n")){
                System.out.print("eid: ");
                int eid = sc.nextInt();
                System.out.print("name: ");
                String name = sc.next();
                System.out.print("designation: ");
                String designation = sc.next();
                System.out.print("sex: ");
                char sex = sc.next().charAt(0);
                System.out.print("salary: ");
                int salary = sc.nextInt();
                Employee employee = new Employee(eid, name, designation, sex, salary);
                session.persist(employee);
                System.out.print("Do you want to add more data ?(Y/N): ");
                str = sc.next();
            }
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            System.out.println(e.getMessage());
        }


    }
}
