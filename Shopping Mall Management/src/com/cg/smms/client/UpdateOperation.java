package com.cg.smms.client;

import java.util.*;
import com.cg.smms.entities.*;
import com.cg.smms.services.*;

@SuppressWarnings("unused")
public class UpdateOperation {

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

		/* User */
		user = uService.searchUser(1);
		user.setName("kapil");
		uService.updateUser(user);

		/* Mall Admin */
		mallAdmin = uService.searchMallAdmin(1);
		mallAdmin.setPhone("865935862");
		aService.updateMallAdmin(mallAdmin);

		/* Mall */
		mall = aService.searchMall(1);
		mall.setLocation("Mumbai");
		aService.updateMall(mall);
		
		/* Mall Name*/
		mall = aService.searchMall(1);
		mall.setMallName("Viviana Mall");
		aService.updateMall(mall);


		/* Shop Owner */
		shopOwner = uService.searchShopOwner(1);
		shopOwner.setAddress("Delhi");
		sService.updateShopOwner(shopOwner);

		/* Shop */
		shop = sService.searchShopById(1);
		shop.setShopStatus("Close");
		sService.updateShop(shop);

		/* Employee */
		employee = eService.searchEmployee(1);
		employee.setName("Worker");
		eService.updateEmployee(employee);

		/* Item */
		item = cService.searchItem(1);
		item.setPrice(589);
		sService.updateItem(item);

		/* Customer */
		customer = uService.searchCustomer(1);
		customer.setEmail("kapil@8642.com");
		uService.updateCustomer(customer);
		
		/* Order */
		order = oService.searchOrder(2);
		order.setPaymentMode("CREDIT CARD");
		oService.updateOrder(order);
	}
}
