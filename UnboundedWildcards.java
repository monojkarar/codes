package com.mac.java.generics.types1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UnboundedWildcards {
	
	public static void print(List<?> data) {
		
//		data.add(100);
//		Iterator itr = data.iterator();
//		while(itr.hasNext()) {
//			String str = (String) data.get(0);
//		}
	}
	
	public static void main(String[] args) {
		List<Integer> data = new ArrayList<>();
		data.add(100);
		data.add(200);
		data.add(300);
		data.add(400);
		data.add(500);
		print(data);
	}
}
