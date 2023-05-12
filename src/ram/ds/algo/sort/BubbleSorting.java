package ram.ds.algo.sort;

public class BubbleSorting {

	static void bubbleSort(int[] arr) {
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n - i; j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}

	}

	public static void main(String[] args) {
		int arr[] = new int[5];
		arr[0] = 9;
		arr[1] = 4;
		arr[2] = 7;
		arr[3] = 5;
		arr[4] = 1;
		bubbleSort2(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i] );
		}
		System.out.println("\n");
		int arr2[] = { 10, 29, 29, 6, 1, 0, -1, 9, 0, -2 };
		bubbleSort2(arr2);
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(" " + arr2[i] );
		}
	}

	static void bubbleSort2(int[] arr) {
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n -i; j++) {
				if(arr[j-1]>arr[j])
				{
					temp= arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}

		}

	}

}
