package com.cg.shopping.client;
//import java.sql.Date;
//import java.time.LocalDate;
//import java.time.LocalDateTime;



import com.cg.shopping.entities.OrderDetails;
import com.cg.shopping.service.IOrderService;
import com.cg.shopping.service.OrderServiceImpl;

public class client {

	public static void main(String[] args) 
	{
		//CRUD operation calling activity
		
		OrderDetails order = new OrderDetails();

		IOrderService service = new OrderServiceImpl();
		
		//CRUD1
		
		//Create
		//order1.
//		order.setId(1);
//		order.setDateOfPurchase(null);
//		order.setTotal(10);
//		order.setCustomerId(1);
//		order.setPaymentMode("UPI");
//		order.setShopId(101);
		//order2.
		order.setId(2);
		order.setDateOfPurchase(null);
		order.setTotal(20);
		order.setCustomerId(2);
		order.setPaymentMode("cash delivery");
		order.setShopId(102);	
		service.addOrder(order);
		
		//Retrieve
		/*
		order=service.searchOrderById(1);
		System.out.println("ID is: "+order.getId());
		System.out.println("customerId is: "+order.getCustomerId());
		System.out.println("shopId is: "+order.getShopId());*/
		
		/*
		//Update
		order=service.searchOrderById(1);
		order.setPaymentMode("google pay");
		service.updateOrder(order);
		System.out.println("Update is Successfully");*/
		
		//Delete
		/*
		order = service.searchOrderById(2);
		service.deleteOrder(order);
		System.out.println("Delete is sucessful");*/
		
		
	
	}

}
