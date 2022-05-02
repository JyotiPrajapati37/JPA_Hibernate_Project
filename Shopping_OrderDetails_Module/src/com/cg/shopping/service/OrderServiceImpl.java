package com.cg.shopping.service;

//import javax.persistence.EntityManager;

import com.cg.shopping.entities.OrderDetails;
import com.cg.shopping.repository.IOrderRepository;
import com.cg.shopping.repository.OrderRepositoryImpl;

public class OrderServiceImpl implements IOrderService
{
	//Step 1: establishment connection between Service and repository
	private IOrderRepository dao;//creating object to connect with the service
	
	public OrderServiceImpl() 
	{
		dao = new OrderRepositoryImpl();
	}

	//Step 2: Service calls to perform CRUD Operation
	
	@Override
	public OrderDetails addOrder(OrderDetails order) {
		dao.beginTransaction();
		dao.addOrder(order);
		dao.commitTransaction();
		return order;
	}

	@Override
	public OrderDetails updateOrder(OrderDetails Order) {
		dao.beginTransaction();
		dao.updateOrder(Order);
		dao.commitTransaction();
		return Order;
	}

	@Override
	public OrderDetails searchOrderById(int id)
	{
		OrderDetails order = dao.searchOrderById(id);
		return order;
	}

//	@Override
//	public OrderDetails cancelMall(OrderDetails order) {
//		dao.beginTransaction();
//		dao.remove(order);
//		dao.commitTransaction();
//		return order;
//		
//	}

	@Override
	public OrderDetails addItem(OrderDetails order) 
	{
		dao.beginTransaction();
		dao.addItem(order);
		dao.commitTransaction();
		return order;
	}

	@Override
	public OrderDetails deleteOrder(OrderDetails order) {

		dao.beginTransaction();
		dao.deleteOrder(order);
		dao.commitTransaction();
		return order;
	}


	
	
	}
	


