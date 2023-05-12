package ram.ds.algo.search;

public class LinearSearch {

	int data[];
	int numberOfTries;

	public LinearSearch(int size) {
		// TODO Auto-generated constructor stub
		data = new int[size];
		for (int i = 1; i <= size; i++) {
			data[i - 1] = i;
			numberOfTries = 0;
		}

	}

	public static void main(String[] args) {

		LinearSearch linear = new LinearSearch(100000);
		int search = 10000;
		boolean isFound = false;
		for (int i = 0; i < linear.data.length; i++) {

			linear.numberOfTries++;
			if (linear.data[i] == search) {
				System.out.println("Elememts is found " +linear.numberOfTries);
				isFound = true;
				break;
			}
		}
		if(!isFound)
		System.out.println("Elememst not found " + isFound);
	}

}
