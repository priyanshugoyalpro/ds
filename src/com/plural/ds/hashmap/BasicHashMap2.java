package com.plural.ds.hashmap;

public class BasicHashMap2<X, Y> {

	private HashEntry[] data;
	private int capacity;
	private int size;

	public BasicHashMap2(int capacity) {
		this.capacity = capacity;
		this.data = new HashEntry[capacity];
		this.size = 0;
	}
	
	private int calulateHash(X key) {
		int hash = (key.hashCode() % this.capacity);
		//this is necesaary to deal with collision
		while(data[hash]!=null && !data[hash].getKey().equals(key))
		{
			hash = (hash+1) % this.capacity;
		}
		return hash;

	}

	private class HashEntry<X, Y> {
		X key;
		Y value;

		public HashEntry(X key, Y value) {
			this.key = key;
			this.value = value;
		}

		public X getKey() {
			return key;
		}

		public void setKey(X key) {
			this.key = key;
		}

		public Y getValue() {
			return value;
		}

		public void setValue(Y value) {
			this.value = value;
		}

	}

}
