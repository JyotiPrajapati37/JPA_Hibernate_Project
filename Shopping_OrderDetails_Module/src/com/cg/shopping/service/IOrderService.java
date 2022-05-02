package com.cg.shopping.service;

import com.cg.shopping.entities.OrderDetails;

public interface IOrderService 
{
	public OrderDetails addOrder(OrderDetails order);//Create
	
	//public OrderDetails updateOrder(OrderDetails order);//Update
	
	public OrderDetails updateOrder(OrderDetails order);//update
	
	public OrderDetails searchOrderById(int id);   //read
	
	//public OrderDetails cancelMall(OrderDetails order);//create
	
	public OrderDetails addItem(OrderDetails order);//create

	public OrderDetails deleteOrder(OrderDetails order);
	
	

}
