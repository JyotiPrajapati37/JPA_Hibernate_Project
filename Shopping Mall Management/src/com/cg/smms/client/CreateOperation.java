package com.cg.smms.client;

import java.time.LocalDate;
import java.util.*;

import com.cg.smms.entities.*;
import com.cg.smms.services.*;

@SuppressWarnings("unused")
public class CreateOperation {


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

		/* USER ----> MALL ADMIN ----> MALL */
		/* User */
		user = new User();
		user.setName("Prachi");
		user.setPassword("1234");
		user.setType("Mall Admin");
		/* uService.addNewUser(user); */// <---

		/* MallAdmin */
		mallAdmin = new MallAdmin();
		mallAdmin.setPhone("985246525");
		mallAdmin.setUser(user);// <---
		/* aService.addMallAdmin(mallAdmin); */// <---

		/* Mall */
		mall = new Mall();
		mall.setMallName("D mart");
		mall.setLocation("pune");
		mall.setCategories("All");
		mall.setMallAdmin(mallAdmin);

		aService.addMall(mall);// <---

		/* USER ----> SHOP OWNER ----> SHOP */
		user = new User();
		user.setName("Komal");
		user.setPassword("komal@109");
		user.setType("Shop Owner");

		shopOwner = new ShopOwner();
		shopOwner.setDob(LocalDate.of(2000, 11, 01));
		shopOwner.setAddress("karjat");
		shopOwner.setUser(user);// <---

		shop = new Shop();
		shop.setShopCategory("Naturals original");
		shop.setShopName("The Naturals");
		shop.setShopStatus("OPEN");
		shop.setLeaseStatus("Pending");
		shop.setMall(mall);// <---
		
//		shopOwner set shop 
		shopOwner.setShop(shop);// <---
		sService.addShopOwner(shopOwner);
		
		/* EMPLOYEE */
//	Employee details(1)
	employee = new Employee();
	employee.setName("Prachi");
	employee.setDob(LocalDate.of(1998, 10, 17));
	employee.setSalary(28000);
	employee.setAddress("Manglore");
	employee.setDesignation("Hr. Manager");

	shop = sService.searchShopById(1);
	employee.setShop(shop);// <---

//	Single Employee Added
	eService.addEmployee(employee);// <---

//	Employee details(2)
	employee = new Employee();
	employee.setName("Vikas");
	employee.setDob(LocalDate.of(1997, 11, 23));
	employee.setSalary(200);
	employee.setAddress("UP");
	employee.setDesignation("CA");

	shop = sService.searchShopById(1);
	employee.setShop(shop);// <---

	list1.add(employee);// <---

//	Employee details(3)
	employee = new Employee();
	employee.setName("Faraz");
	employee.setDob(LocalDate.of(1995, 1, 1));
	employee.setSalary(10000);
	employee.setAddress("Nashik");
	employee.setDesignation("Manager");

	shop = sService.searchShopById(1);
	employee.setShop(shop);// <---

	list1.add(employee);// <---

//	Multiple/ List of Employees are added to Shop
	sService.addEmployees(list1);// <---

	/* ITEM */

//			Item details (1)
	item = new Item();
	item.setCategory("Naturals Original");
	item.setManufacturing(LocalDate.of(2022, 03, 10));
	item.setExpiry(LocalDate.of(2022, 06, 15));
	item.setName("Choco-Vanilla");
	item.setPrice(250);

	shop = sService.searchShopById(1);
	item.setShop(shop);// <---

//			Single item added to Shop
	sService.addItem(item);// <---

//			Item details (2)
	item = new Item();
	item.setCategory("Naturals Original");
	item.setManufacturing(LocalDate.of(2022, 03, 25));
	item.setExpiry(LocalDate.of(2022, 05, 17));
	item.setName("Mango Original flavour");
	item.setPrice(299);

	shop = sService.searchShopById(1);
	item.setShop(shop);// <---

	list2.add(item);// <---

//			Item details (3)
	item = new Item();
	item.setCategory("Naturals Organic");
	item.setManufacturing(LocalDate.of(2022, 05, 21));
	item.setExpiry(LocalDate.of(2022, 11, 25));
	item.setName("Organic Mango Flavour");
	item.setPrice(479);

	shop = sService.searchShopById(1);
	item.setShop(shop);// <---

	list2.add(item);// <---

//			Multiple/ List of  Item added to Shop
	sService.addItems(list2);// <---

		/* USER ---> CUSTOMER ---> in SHOP */
	user = new User();
	user.setName("Chirag");
	user.setPassword("chirag#9763");
	user.setType("Customer");

	customer = new Customer();
	customer.setEmail("chirag@gmail.com");
	customer.setPhone("58682453");
	customer.setUser(user);// <---

	shop = sService.searchShopById(1);
	customer.setShop(shop);// <---

	uService.addCustomer(customer);// <---

		/* ORDER ---> CUSTOMER ---> SHOP */
		/*
		 * because of insufficient information, I am not adding items to order Logic is
		 * Quatity of items: when add to order, delete from shop Payment
		 */
//		Order Details(1)
		order = new OrderDetails();
		order.setDateOfPurchase(LocalDate.of(2022, 03, 10));
		order.setPaymentMode("Amazon UPI");
		order.setTotal(5000);

		customer = uService.searchCustomer(1);
		order.setCustomer(customer);// <---

		shop = sService.searchShopById(1);
		order.setShop(shop);// <---

//		Single Order is added to Customer profile
		oService.addOrder(order);// <---

//		Order Details(2)
		order = new OrderDetails();
		order.setDateOfPurchase(LocalDate.of(2022, 02, 15));
		order.setPaymentMode("CASH Payment");
		order.setTotal(3000);
		
		customer = uService.searchCustomer(1);
		order.setCustomer(customer);// <---
		shop = sService.searchShopById(1);
		order.setShop(shop);// <---
		
		list3.add(order);// <---

//		Order Details(3)
		order = new OrderDetails();
		order.setDateOfPurchase(LocalDate.of(2022, 01, 17));
		order.setPaymentMode("CREDIT CARD");
		order.setTotal(2500);
		
		customer = uService.searchCustomer(1);
		order.setCustomer(customer);// <---
		shop = sService.searchShopById(1);
		order.setShop(shop);// <---
		
		list3.add(order);// <---

		customer = uService.searchCustomer(1);
		customer.setOrders(list3);// <---

//		Multiple/ List of Orders added to the Customer Profile
		uService.updateCustomer(customer);// <---

	}

}
