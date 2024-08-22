package lk.ijse;

import lk.ijse.config.FactoryConfiguration;
import lk.ijse.embed.FullName;
import lk.ijse.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AddData {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Student student = new Student(1,new FullName("pasindu","nimantha"),"kandy");

        Transaction transaction = session.beginTransaction();
      //  session.save(student);
        session.update(student);
        transaction.commit();
        session.close();
    }
}