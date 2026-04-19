package com.demo.dao;

import java.util.ArrayList;

import com.demo.beans.OnlineOrder;
import com.demo.beans.StoreOrder;
import com.demo.exceptions.InvalidOrderException;

public class OdrerDaoImpl implements OrderDao {

	static ArrayList<OnlineOrder> o1 = new ArrayList<>();
	static ArrayList<StoreOrder> o2 = new ArrayList<>();
	
	@Override
	public boolean saveOnlineOrder(OnlineOrder order) {
		o1.add(order);
		return true;
	}

	@Override
	public boolean saveStoreOrder(StoreOrder order) {
		o2.add(order);
		return true;
	}

	@Override
	public boolean deleteOrder(int orderId) throws InvalidOrderException {
		 for (OnlineOrder order : o1) {
	            if (order.getOrderId() == orderId) {
	                o1.remove(order);
	                return true;
	            }
	            else throw new InvalidOrderException("Order with ID " + orderId + " not found.");
	        }
	        for (StoreOrder order : o2) {
	            if (order.getOrderId() == orderId) {
	                o2.remove(order);
	                return true;
	            }
	        }
		return false;
	}
	
	
}
