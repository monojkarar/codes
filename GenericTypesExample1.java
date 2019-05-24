package com.mac.java.generics.types1;

class Store<T> {

	private T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "Store [item = " + item + "]";
	}

}

public class GenericTypesExample1 {

	public static void main(String[] args) {

		Store<String> store = new Store<>();
		store.setItem("Monoj Karar");
		String data = store.getItem();
		System.out.println(data);

	}

}
