package com.pardha.HybernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.pardha.HybernateDemo.dao.EmployeeDAO;
import com.pardha.HybernateDemo.entity.Address;
import com.pardha.HybernateDemo.entity.Employee;
import com.pardha.HybernateDemo.entity.Person;
import com.pardha.HybernateDemo.util.HibernateUtil;

public class App 
{
    public static void main( String[] args )
    {
       SessionFactory factory = HibernateUtil.buildSessionFactory();
      Session session = factory.openSession();
      Person e = session.get(Person.class, 101);
      if(e!=null)
      {	   System.out.println(e.getPersonname()+"   "+e.getPersonage()+"    "+e.getGender());
      System.out.println(e.getAddress().getAddresId()+"   "+e.getAddress().getHno()+"    "+e.getAddress().getStateName());
      System.out.println(e.getAddress().getCityName()+"    "+e.getAddress().getStateName());
      }
      
      Address a = session.get(Address.class, 7001);
      if(e!=null)
      {	   System.out.println(a.getAddresId()+"   "+a.getHno()+"    "+a.getStateName());
      System.out.println(a.getCityName()+"   "+a.getStateName());
      System.out.println(a.getPerson().getPersonname()+"  "+a.getPerson().getPersonage());
      }
       HibernateUtil.shutdown();
    }
}
//for calling data through the key

//SessionFactory factory = HibernateUtil.buildSessionFactory();
//Session session = factory.openSession();
//Employee e = session.get(Employee.class,10);
//if(e!=null)
//	   
//	   System.out.println(e.getEmpid()+"    "+e.getEmpname()+"    "+e.getSalary()+"   "+e.getDeptno());
//else
//	   System.out.println("not found");
//session.close();
//HibernateUtil.shutdown();

//SessionFactory factory = HibernateUtil.buildSessionFactory();
//Session session = factory.openSession();
//Transaction trans = session.beginTransaction();
//Employee e = new  Employee(102,"Rahul",1400,20);       
//session.saveOrUpdate(e);
//trans.commit();
//session.close();
//HibernateUtil.shutdown();



//
//if(e!=null)
//{
//	   e.setEmpname("Rahul");
//	   System.out.println("is sessin dirty"+ session.isDirty());
//}
//	   else
//		System.out.println("is sesion dirty"+session.isDirty());