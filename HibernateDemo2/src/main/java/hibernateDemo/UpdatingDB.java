package hibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class UpdatingDB {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Scanner sc = new Scanner(System.in);
        System.out.println("----------Welcome to DB handling----------");
        String str = "";
        try{
            while (!str.equalsIgnoreCase("n")){
                System.out.print("Enter eid for update: ");
                int iEid = sc.nextInt();
                Employee employee = session.get(Employee.class, iEid);
                System.out.print("Choose option which you want to update:\n1.Eid\n2.Name\n3.Designation\n4.Salary\n5.Sex\n: ");
                int choice = sc.nextInt();
                switch (choice){
                    case 1:
                        System.out.print("Enter new eid: ");
                        int newEid = sc.nextInt();
                        employee.setEid(newEid);
                        break;
                    case 2:
                        System.out.print("Enter new name: ");
                        String newName = sc.next();
                        employee.setName(newName);
                        break;
                    case 3:
                        System.out.print("Enter new designation: ");
                        String newDesignation = sc.next();
                        employee.setDesignation(newDesignation);
                        break;
                    case 4:
                        System.out.print("Enter new salary: ");
                        int newSalary = sc.nextInt();
                        employee.setSalary(newSalary);
                        break;
                    case 5:
                        System.out.print("Enter new sex: ");
                        char newSex = sc.next().charAt(0);
                        employee.setSex(newSex);
                        break;
                    default:
                        System.out.print("Please enter valid option");
                }
                System.out.print("Do you want to update more ? (Y/N): ");
                str = sc.next();
            }
            transaction.commit();
        }catch (Exception e){
            transaction.rollback();
            System.out.println(e.getMessage());
        }
    }
}
