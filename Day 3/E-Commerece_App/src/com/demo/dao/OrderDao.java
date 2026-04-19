package com.demo.dao;

import com.demo.beans.OnlineOrder;
import com.demo.beans.StoreOrder;
import com.demo.exceptions.InvalidOrderException;

public interface OrderDao {

	boolean saveOnlineOrder(OnlineOrder order);

	boolean saveStoreOrder(StoreOrder order);

	boolean deleteOrder(int orderId) throws InvalidOrderException;

}
