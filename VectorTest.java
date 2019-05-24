package com.mac.java;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Vector<Integer> data = new Vector<>();
		data.add(101);
		data.add(102);
		data.add(103);
		data.add(104);
		data.add(105);
		data.add(106);
		data.add(107);
		data.add(108);
		data.add(109);
		Enumeration<Integer> dataEnumeration = data.elements();
		while (dataEnumeration.hasMoreElements()) {
			System.out.println(dataEnumeration.nextElement());
		}
	}

}
