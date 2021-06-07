package com.gzcc.sp01.service;

import com.gzcc.sp01.pojo.Order;

public interface OrderService {

	Order getOrder(String orderId);
	void addOrder(Order order);

}
