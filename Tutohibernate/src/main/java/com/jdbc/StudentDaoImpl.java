package com.jdbc;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
public class StudentDaoImpl implements StudentDao{

	public void addStudent(Student s) {
		
		Session session=HibernateUtil.getSessionfactory().openSession();
		
		try{
			session.beginTransaction();
			session.save(s);
	    	session.beginTransaction().commit();

			
		}catch( Exception e){

			e.printStackTrace();
		}
		finally{
			session.close();
		}
		
	}

	public void deleteStudent(int id) {
      Session session=HibernateUtil.getSessionfactory().openSession();
   
      
      try {
    	  session.beginTransaction();
    	  Student thestudent=session.get(Student.class, id);
    	    session.delete(thestudent);
    	   session.beginTransaction().commit();
		
	} catch (Exception e) {
       e.printStackTrace();
	
	}finally{
		session.close();

	}
}

	public void update(int id) {
		Session session=HibernateUtil.getSessionfactory().openSession();
	      try {
	    	  session.beginTransaction();
	    	  Student thestudent=session.get(Student.class, id);
	    	   thestudent.setEmail("youssouf@gmail.com");
	    	   session.beginTransaction().commit();
			
		} catch (Exception e) {
	       e.printStackTrace();
		
		}finally{
			session.close();

		}
	
		
	}

	public Student getStudent(int id) {
		Session session=HibernateUtil.getSessionfactory().openSession();
		Student thestudent=null;
	      
	      try {
	    	  session.beginTransaction();
	    	  thestudent=session.get(Student.class, id);
	    	   
			
		} catch (Exception e) {
	       e.printStackTrace();
		
		}finally{
			session.close();

		}
	      
	      return thestudent;

	}

	@SuppressWarnings("unchecked")
	public List<Student> getStudents() {
     List<Student> students=new ArrayList<Student>();
     
     Session session=HibernateUtil.getSessionfactory().openSession();
    		 try{
    			 session.beginTransaction();
    			 students=session.createQuery("from Student").getResultList();
    			 
    		 }catch(Exception e){
    			e.printStackTrace();
    		 }
    		 finally{
    			 session.close();
    		 }
		return students;
	}

}
