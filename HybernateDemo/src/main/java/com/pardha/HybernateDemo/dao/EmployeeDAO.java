package com.pardha.HybernateDemo.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.pardha.HybernateDemo.entity.Employee;

public class EmployeeDAO
{
	SessionFactory factory = null;
	public EmployeeDAO(SessionFactory factory)
	{
		this.factory=factory;
		
	}
	public void deleteEmployee(Employee employee)
	{
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		try
		{
			session.delete(employee);
			trans.commit();
		}
		catch(Exception e)
		{
			trans.rollback();
			e.printStackTrace();
		}
	}
	public void insertEmployee(Employee employee)
	{
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		try
		{
			session.save(employee);
			trans.commit();
		}
		catch(Exception e)
		{
			trans.rollback();
			e.printStackTrace();
		}
	}
	public void modifyEmployee(Employee employee)
	{
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		try
		{
			session.update(employee);
			trans.commit();
		}
		catch(Exception e)
		{
			trans.rollback();
			e.printStackTrace();
		}
	}
	public Employee getEmployee(int empid)
	{
		Session session = factory.openSession();
		return session.get(Employee.class, empid);
	}
}
