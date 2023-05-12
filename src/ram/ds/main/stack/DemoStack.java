package ram.ds.main.stack;

public class DemoStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BasicStack<Integer> stack = new BasicStack<Integer>(5);
		stack.push(0);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		System.out.println(stack.pop());
		
		

	}

}
