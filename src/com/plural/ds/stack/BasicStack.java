package com.plural.ds.stack;

public class BasicStack<X> {

	X[] data;
	int size;
	int stcakPointer;

	public BasicStack(int intialCapicty) {
		this.data = (X[]) new Object[intialCapicty];
		this.size = intialCapicty;
		this.stcakPointer = 0;
	}

	public boolean isFull() {
		return stcakPointer == size;
	}

	public void push(X item) {
		if (isFull()) {
			System.out.println("Stack is full");
			return;
		}

		data[stcakPointer++] = item;
	}

	public X pop() {
		if (stcakPointer == 0) {
			return null;
		}
		return data[--stcakPointer];

	}

	public boolean contains(X item) {
		boolean found = false;
		for (int i = 0; i < stcakPointer; i++) {
			if (item.equals(data[stcakPointer])) {
				found = true;
				break;
			}
		}
		return found;
	}

}
