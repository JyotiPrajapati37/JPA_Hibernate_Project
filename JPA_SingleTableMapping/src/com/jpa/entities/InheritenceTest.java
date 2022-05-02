package com.jpa.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InheritenceTest {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em =factory.createEntityManager();

		em.getTransaction().begin();
//		create one employee
		Employee employee= new  Manager();// Employee CLASS OBJECT
		employee.setName("Avantika Tiwari");
		employee.setSalary(6000);
		em.persist(employee);

//		create one manager
		Manager manager =new Manager();//Manager CLASS OBJECT
		manager.setName("Vikas V");
		manager.setSalary(10000);
		manager.setDepartmentName("HR");
		em.persist(manager);
		
		em.getTransaction().commit();
		
//		We can add employee using userDefine...Scanner/BufferReader
		System.out.println("Added one employee and manager to database.");
		em.close();
		factory.close();

	}

}
