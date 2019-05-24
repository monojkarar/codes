package com.mac.java.generics.types1;

class HashTable<K, V> {

	private K key;
	private V value;

	public HashTable(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "HashTable [key = " + key + ", value = " + value + "]";
	}

}

public class GenericTypesExample2 {

	public static void main(String[] args) {
		HashTable<String, Integer> hashTable = new HashTable<>("Monoj", 100);
		System.out.println(hashTable);
	}

}
