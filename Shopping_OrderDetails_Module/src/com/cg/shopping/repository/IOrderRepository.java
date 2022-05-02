package com.cg.shopping.repository;

import com.cg.shopping.entities.OrderDetails;

public interface IOrderRepository {

	public OrderDetails addOrder(OrderDetails order);
	public OrderDetails updateOrder(OrderDetails order);
	public OrderDetails searchOrderById(int id);
	public OrderDetails deleteOrder(OrderDetails order);
	//public OrderDetails cancelMall(OrderDetails order);
	public OrderDetails addItem(OrderDetails order);
	
	public abstract void beginTransaction();
	public abstract void commitTransaction();
}
