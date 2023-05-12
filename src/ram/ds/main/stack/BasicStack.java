package ram.ds.main.stack;

public class BasicStack<X> {

	public int size;
	public X[] data;
	public int stackPointer;

	public BasicStack(int size) {
		this.size = size;
		this.data = (X[]) new Object[size];
		stackPointer = 0;
	}

	public boolean isFull() {
		return (stackPointer == size );
	}

	public int size() {
		return stackPointer;
	}

	public void push(X item) {
		if (isFull()) {
			System.out.println("Stack is full");
			return;
		}
		data[stackPointer++] = item;
	}

	public X pop() {
		if (stackPointer == 0) {
			throw new IllegalStateException("Stack is empty");
		}
		return data[--stackPointer];
	}

	public boolean contain(X item) {
		boolean found = false;
		if (stackPointer == 0) {
			return false;
		}
		for (int i = 0; i < stackPointer; i++) {
			if (data[i].equals(item)) {
				return true;
			}
		}
		return false;
	}

	public X access(X item) {
		while (stackPointer > 0) {
			X temp = pop();
			if (item.equals(temp)) {
				return temp;
			}
		}
		throw new IllegalArgumentException("Not isn the bucket");
	}
}
