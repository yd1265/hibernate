package com.jdbc;

import org.hibernate.Session;

public class Hibernatedemo {
public static void main(String []args){
	
   Session session=HibernateUtil.getSessionfactory().openSession();

    session.beginTransaction();
    
    /*  Instantiation of object  
     */
    
    Instructor the1=new Instructor();
    Instructor the2= new Instructor();
    the1.setFirstName("Youssouf");
    the1.setFirstName("Diallo");
    the1.setEmail("yd12@nyu.edu");
    the2.setFirstName("ismatou");
    the2.setLastname("conde");
    the2.setEmail("condeismatou@yahoo.fr");
    
    
    
      InstructorDetails details=new InstructorDetails();
      details.setHobby("udemy");
      details.setYoutubeChannel("https://www.udemy.com/spring-hibernate-tutorial/learn/v4/t/lecture/8058272?start=0");
      InstructorDetails detail=new InstructorDetails();
      detail.setHobby("Java");
      detail.setYoutubeChannel("http://www.espacefmguinee.info/gg-du-lun-12032018/");
     
      the1.setInstructorDetails(details);
      the2.setInstructorDetails(detail);
      Student st1=new Student();
      Student st2=new Student();
      
       st1.setFirstName("Al");
       st1.setLastName("bayo");
       st1.setEmail("al@nyu.edu");
       
       st2.setFirstName("Obama");
       st2.setLastName("Barack");
       st2.setEmail("obama@columbia.edu");
       
        Course cours1=new Course();
        cours1.setTitle("Java");
        Course cours2=new Course();
        cours2.setTitle("hibernate");
        the1.add(cours2);
        the2.add(cours1);
        cours1.add(st1);
        cours2.add(st1);
        cours1.add(st2);
         
      
      session.save(the1);
      session.save(the2);
      session.save(st1);
      session.save(st2);
      session.save(cours1);
      session.save(cours2);

      session.getTransaction().commit();
		  session.close();
	  
}
}
