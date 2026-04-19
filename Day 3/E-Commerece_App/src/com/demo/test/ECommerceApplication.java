package com.demo.test;

import java.util.ArrayList;
import java.util.Scanner;

import com.demo.beans.OnlineOrder;
import com.demo.exceptions.InvalidOrderException;
import com.demo.service.OrderService;
import com.demo.service.OrderServiceImpl;

public class ECommerceApplication {

	public static void main(String[] args) throws InvalidOrderException {

		OrderService oService = new OrderServiceImpl();
		System.out.println("Welcome to E-Commerce Application!");

		Scanner sc = new Scanner(System.in);
		int choice;

		do {
			System.out.println("1. Place Online Order");
			System.out.println("2. Place Store Order");
			System.out.println("3. Cancel Order");
			System.out.println("4. Show Online Orders");
			System.out.println("5. Show Store Orders");
			System.out.println("6. Exit");
			System.out.println(" Enter your choice:");
			choice = sc.nextInt();

			switch (choice) {
			case 1 -> {
				boolean status = oService.placeOnlineOrder();
				if (status) {
					System.out.println("Online order placed successfully!");
				} else {
					System.out.println("Failed to place online order.");
				}

			}
			case 2 -> {
				boolean status = oService.placeStoreOrder();
				if (status) {
					System.out.println("Store order placed successfully!");
				} else {
					System.out.println("Failed to place store order.");
				}
			}
			case 3 -> {
				System.out.println("Enter Order ID to cancel:");
				int orderId = sc.nextInt();
				boolean status = oService.cancelOrder(orderId);
				if (status) {
					System.out.println("Order cancelled successfully!");
				} else {
					System.out.println("Failed to cancel order. Order ID may not exist.");
				}
			}
			case 4 -> {
				System.out.println("Showing all online orders:");
				// Code to display online orders can be added here
			//public ArrayList<OnlineOrder> onlineOrders = OrderService.getOnlineOrders();
			}
			case 5 -> {

				System.out.println("Showing all store orders:");
				// Code to display store orders can be added here
			}
			case 6 -> {
				System.out.println("Exiting the application. Thank you for using our service!");
				sc.close();

			}
			}

		} while (choice != 6);

	}

}
