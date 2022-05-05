package com.cg.smms.client;

import java.time.LocalDate;
import java.util.*;

import com.cg.smms.entities.*;
import com.cg.smms.services.*;

@SuppressWarnings("unused")
public class Entry {

	public static void main(String[] args) {

		/* Entity Object Creation */
		User user;
		MallAdmin mallAdmin;
		Mall mall;
		ShopOwner shopOwner;
		Shop shop;
		Employee employee;
		List<Employee> list1 = new ArrayList<Employee>();
		Item item;
		List<Item> list2 = new ArrayList<Item>();
		Customer customer;
		OrderDetails order;
		List<OrderDetails> list3 = new ArrayList<OrderDetails>();

		/* Service Object Creation */
		IUserService uService = new UserServiceImpl();
		IAdminService aService = new AdminServiceImpl();
		IShopService sService = new ShopServiceImpl();
		IEmployeeService eService = new EmployeeServiceImpl();
		ICustomerService cService = new CustomerServiceImpl();
		IOrderService oService = new OrderServiceImpl();

		/* Login */
		user = new User();
		user.setUserId(1);
		user.setPassword("1234");
		uService.login(user);

		/* Logout */
		aService.logOut();

//		1.
		/* USER ----> MALL ADMIN */
//		user = new User();
//		user.setName("Prachi");
//		user.setPassword("85674pr");
//		user.setType("Mall Admin");
//		uService.addNewUser(user);

//		mallAdmin = new MallAdmin();
//		mallAdmin.setPhone("86592562");
//		mallAdmin.setUser(user);// <---
//
//		aService.addMallAdmin(mallAdmin);// <---

////		2.
//		/* MALL */
//		mall = new Mall();
//		mall.setMallName("R Mall");
//		mall.setLocation("Mulund");
//		mall.setCategories("All");
//
////		mallAdmin add the mall
//		mallAdmin.setMall(mall);// <---

////		3.
//		/* USER ----> SHOP OWNER ----> SHOP */
//		user = new User();
//		user.setName("Faraz");
//		user.setPassword("Faraz@023");
//		user.setType("Shop Owner");
//
//		shopOwner = new ShopOwner();
//		shopOwner.setDob(LocalDate.of(2000, 1, 1));
//		shopOwner.setAddress("Pune");
//		shopOwner.setUser(user);// <---
//
//		shop = new Shop();
//		shop.setShopCategory("Naturals Original");
//		shop.setShopName("The Naturals");
//		shop.setShopStatus("OPEN");
//		shop.setLeaseStatus("Pending");
//
////		shopOwner set shop 
//		shopOwner.setShop(shop);// <---

////		4.
//		/* EMPLOYEE */
////		Employee details(1)
//		employee = new Employee();
//		employee.setName("Chirag");
//		employee.setDob(LocalDate.of(1997, 12, 15));
//		employee.setSalary(1000);
//		employee.setAddress("Karjat");
//		employee.setDesignation("Worker");
//
//		shop = sService.searchShopById(1);
//		employee.setShop(shop);// <---
//
////		Single Employee Added
//		eService.addEmployee(employee);// <---
//
////		Employee details(2)
//		employee = new Employee();
//		employee.setName("Jyoti");
//		employee.setDob(LocalDate.of(1999, 10, 11));
//		employee.setSalary(8000);
//		employee.setAddress("DELHI");
//		employee.setDesignation("Worker");
//
//		shop = sService.searchShopById(1);
//		employee.setShop(shop);// <---
//
//		list1.add(employee);// <---
//
////		Employee details(3)
//		employee = new Employee();
//		employee.setName("Vikas");
//		employee.setDob(LocalDate.of(1997, 1, 1));
//		employee.setSalary(10000);
//		employee.setAddress("Pune");
//		employee.setDesignation("Manager");
//
//		shop = sService.searchShopById(1);
//		employee.setShop(shop);// <---
//
//		list1.add(employee);// <---
//
////		Multiple/ List of Employees are added to Shop
//		sService.addEmployees(list1);// <---

////		4.
//		/* ITEM */
//
////		Item details (1)
//		item = new Item();
//		item.setCategory("Naturals chocolate");
//		item.setManufacturing(LocalDate.of(2022, 01, 01));
//		item.setExpiry(LocalDate.of(2022, 1, 5));
//		item.setName("Choco-Chocolate");
//		item.setPrice(329);
//
//		shop = sService.searchShopById(1);
//		item.setShop(shop);// <---
//
////		Single item added to Shop
//		sService.addItem(item);// <---
//
////		Item details (2)
//		item = new Item();
//		item.setCategory("Naturals chocolate");
//		item.setManufacturing(LocalDate.of(2022, 01, 01));
//		item.setExpiry(LocalDate.of(2022, 01, 05));
//		item.setName("Dark Chocolate");
//		item.setPrice(329);
//
//		shop = sService.searchShopById(1);
//		item.setShop(shop);// <---
//
//		list2.add(item);// <---
//
////		Item details (3)
//		item = new Item();
//		item.setCategory("MallaiPista");
//		item.setManufacturing(LocalDate.of(2022, 01, 11));
//		item.setExpiry(LocalDate.of(2022, 02, 05));
//		item.setName("Organic MallaiPista");
//		item.setPrice(359);
//
//		shop = sService.searchShopById(1);
//		item.setShop(shop);// <---
//
//		list2.add(item);// <---
//
////		Multiple/ List of  Item added to Shop
//		sService.addItems(list2);// <---

////		5.
//		/* USER ---> CUSTOMER ---> in SHOP */
//		user = new User();
//		user.setName("Vikas");
//		user.setPassword("vikas3#123");
//		user.setType("Customer");
//
//		customer = new Customer();
//		customer.setEmail("vikas@gmail.com");
//		customer.setPhone("8564932585");
//		customer.setUser(user);// <---
//
//		shop = sService.searchShopById(1);
//		customer.setShop(shop);// <---
//
//		uService.addCustomer(customer);// <---

////		6.
//		/* ORDER ---> CUSTOMER ---> SHOP */
//		/*
//		 * because of insufficient information, I am not adding items to order Logic is
//		 * Quatity of items: when add to order, delete from shop Payment
//		 */
////		Order Details(1)
//		order = new OrderDetails();
//		order.setDateOfPurchase(LocalDate.of(2022, 3, 15));
//		order.setPaymentMode("PAY UPI");
//		order.setTotal(1000);
//
//		customer = uService.searchCustomer(1);
//		order.setCustomer(customer);// <---
//
//		shop = sService.searchShopById(1);
//		order.setShop(shop);// <---
//
////		Single Order is added to Customer profile
//		oService.addOrder(order);// <---
//
////		Order Details(2)
//		order = new OrderDetails();
//		order.setDateOfPurchase(LocalDate.of(2022, 2, 21));
//		order.setPaymentMode("CREDIT CARD");
//		order.setTotal(1000);
//
//		list3.add(order);// <---
//
////		Order Details(3)
//		order = new OrderDetails();
//		order.setDateOfPurchase(LocalDate.of(2022, 1, 12));
//		order.setPaymentMode("CASH Payment");
//		order.setTotal(1000);
//
//		list3.add(order);// <---
//
//		customer = uService.searchCustomer(1);
//		customer.setOrders(list3);// <---
//
////		Multiple/ List of Orders added to the Customer Profile
//		uService.updateCustomer(customer);// <---

		/* CRUD OPERATIONS */

	}

}
