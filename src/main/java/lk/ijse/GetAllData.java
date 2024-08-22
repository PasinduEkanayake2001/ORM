package lk.ijse;

import lk.ijse.config.FactoryConfiguration;
import lk.ijse.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class GetAllData {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();
        List<Student> students = session.createQuery("FROM Student", Student.class).list();
        transaction.commit();
        session.close();

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
