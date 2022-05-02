package com.cg.shopping.repository;

import javax.persistence.EntityManager;

import com.cg.shopping.entities.OrderDetails;

public class OrderRepositoryImpl implements IOrderRepository
{
	//Step1:Start JPA LifeCycle
	private EntityManager entityManager;
	
//Create Constructor for connection class to entityManager and JPAUtil
	
	public OrderRepositoryImpl()
	{
		entityManager = JPAUtil.getEntityManager();
	}
	

	//Create Operation-Repository/DAO	
	@Override
	public OrderDetails addOrder(OrderDetails order) 
	{
		entityManager.persist(order);
		return order;
	}

	@Override
	public OrderDetails updateOrder(OrderDetails order) 
	{
		entityManager.merge(order);
		return order;
	}

	@Override
	public OrderDetails searchOrderById(int id)
	{
		OrderDetails order =entityManager.find(OrderDetails.class, id);
		return order;
	}

	//@Override
//	public OrderDetails deleteOrder(OrderDetails order)
//	{
//		OrderDetails order =entityManager.find(OrderDetails.class, id);//first find by id and remove it 
//		entityManager.remove(order);
//		return order;
//	}


	@Override
	public void beginTransaction() 
	{
		entityManager.getTransaction().begin();		
	}


	@Override
	public void commitTransaction()
	{
		entityManager.getTransaction().commit();
		
	}


//	@Override
//	public OrderDetails cancelMall(OrderDetails order) {
//		OrderDetails order =entityManager.find(OrderDetails.class, id);//first find by id and remove it 
//		entityManager.remove(order);
//		return order;
//	}


	@Override
	public OrderDetails addItem(OrderDetails order) {
		entityManager.persist(order);
		return order;
	}


@Override
public OrderDetails deleteOrder(OrderDetails order) {
	entityManager.remove(order);
	
	return order;
}

	
}
