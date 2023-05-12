package ram.ds.algo.problems.queue;

public class BasicQueue<X> {

	X[] data;
	int size;
	int front;
	int end;

	public BasicQueue(int size) {
		this.size = size;
		this.data = (X[]) new Object[size];
		front = -1;
		end = -1;
	}

	public boolean isFull() {
		return end == size-1;
	}

	public boolean isEmpty() {
		return (front == -1 || front > end);
	}

	public void enQueue(X item) {
		if (isFull()) {
			System.out.println("Can not add as queue is full");
			return;
			
		}
			end = end + 1;
			data[end] = item;
			if (front == -1) {
				front = 0;
	}}

	public X dequeue() {
		if (isEmpty()) {
			System.out.println("Nothing to dequeue");
			return null;
		}

		X objec = data[front];
		front++;
		return objec;

	}
}
