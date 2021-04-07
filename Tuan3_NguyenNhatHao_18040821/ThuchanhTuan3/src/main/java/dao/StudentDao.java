/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Student;
import model.StudentDTO;
import util.HibernateUtil;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.util.Base64;
import java.util.List;
import model.Student;
import org.apache.commons.io.IOUtils;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author TriPham
 */
public class StudentDao {
    public void saveStudent(Student user, InputStream inputStream) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            if(inputStream!=null)
            {
                byte[] bytes = IOUtils.toByteArray(inputStream);
                Blob blob = Hibernate.getLobCreator(session).createBlob(bytes);
                user.setImage(blob);
            }
           // image.setImage(blob);
            // save the student object
            session.save(user);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    /**
     * Update Customer
     * @param user
     */
    public void updateStudent(Student user, InputStream inputStream) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
             if(inputStream!=null)
            {
                byte[] bytes = IOUtils.toByteArray(inputStream);
                Blob blob = Hibernate.getLobCreator(session).createBlob(bytes);
                user.setImage(blob);
            }
            // save the student object 
            session.saveOrUpdate(user);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    /**
     * Delete Customer
     * @param id
     */
    public void deleteStudent(int id) {

        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();

            // Delete a user object
            Student user = session.get(Student.class, id);
            if (user != null) {
                session.delete(user);
                System.out.println("user is deleted");
            }

            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    /**
     * Get Customer By ID
     * @param id
     * @return
     */
    public Student getStudent(int id) {

        Transaction transaction = null;
        Student user = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // get an user object
            user = session.get(Student.class, id);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return user;
    }
public StudentDTO getStudentDTO(int id) {

        Transaction transaction = null;
        Student user = null;
        StudentDTO studentDTO=new StudentDTO();
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // get an user object
            user = session.get(Student.class, id);
            // commit transaction
            transaction.commit();
            studentDTO.setName(user.getName());
            studentDTO.setEmail(user.getEmail());
            studentDTO.setCountry(user.getCountry());
            Blob blob= user.getImage();
            if(blob!=null)
            {
            InputStream inputStream = blob.getBinaryStream();
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
             byte[] buffer = new byte[4096];
             int bytesRead = -1;
                 
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);                  
                }
                byte[] imageBytes = outputStream.toByteArray();
                String base64Image = Base64.getEncoder().encodeToString(imageBytes);
                studentDTO.setBase64Image(base64Image);
            }
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            
            e.printStackTrace();
        }
        }
        return studentDTO;
    }

    /**
     * Get all Customers
     * @return
     */
    @SuppressWarnings("unchecked")
    public List < Student > getAllStudent() {

        Transaction transaction = null;
        List < Student > listOfStudent = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // get an user object

            listOfStudent = session.createQuery("from Customer").getResultList();

            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return listOfStudent;
    }
}
