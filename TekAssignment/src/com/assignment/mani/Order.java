package com.assginment.mani;

import java.util.ArrayList;
import java.util.List;

import com.assginment.mani.OrderLine;

public class Order {

	private List<OrderLine> orderLines = new ArrayList<OrderLine>();    /** List interface is implemented by ArrayList*/

	public void add(OrderLine o) throws Exception {
		if (o == null) {
			System.err.println("ERROR - Order is NULL");
			throw new IllegalArgumentException("Order is NULL");
		}
		orderLines.add(o);
	}

	public int size() {
		return orderLines.size();
	}

	public OrderLine get(int i) {
		return orderLines.get(i);
	}

	public void clear() {
		this.orderLines.clear();

	}
	
	
}
