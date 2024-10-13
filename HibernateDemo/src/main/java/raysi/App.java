package raysi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {

        Student student1 = new Student(101, "Preeti", 100);

        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();


//        ---------Data Insertion----------
//        try{
//            session.persist(student1);
//            transaction.commit();
//        } catch (Exception e) {
//            transaction.rollback();
//            System.out.println(e.getMessage());
//        }

//       ------------Data Retrivel---------
//        try{
//            Student student = session.get(Student.class, 116);
//            if (student != null){
//                System.out.println("SID: " + student.getSid());
//                System.out.println("NAME: " + student.getName());
//                System.out.println("GRADE: " + student.getGrade());
//            }
//
//        }catch (Exception e){
//            throw new RuntimeException(e);
//        }

        //       ------------Data Updation---------
//        try {
//            Student student = session.get(Student.class, 116);
//            student.setGrade(9.01);
//            transaction.commit();
//        } catch (Exception e) {
//            transaction.rollback();
//            throw new RuntimeException(e);
//        }
//
//        //       ------------Data Deletion---------
        try {
            Student student = new Student();
            student.setSid(101);
            session.remove(student);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw new RuntimeException(e);
        }
    }
}

