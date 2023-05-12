package ram.ds.algo.problems.queue;

public class QueueArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BasicQueue<Integer> queue = new BasicQueue<Integer>(5);
		queue.enQueue(10);
		queue.enQueue(10);
		queue.enQueue(10);
		queue.enQueue(10);
		queue.enQueue(10);
		queue.enQueue(10);
		queue.enQueue(10);
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		

	}

}
