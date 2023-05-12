package ram.ds.algo.sort;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = new int[5];
		arr[0] = 9;
		arr[1] = 4;
		arr[2] = 7;
		arr[3] = 5;
		arr[4] = 1;
		selectionSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] );
		}
		System.out.println("\n");
		int arr2[] = { 10, 1, 29, 6, 1, 0, -1, 9, 0, -2 };
		selectionSort(arr2);
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(" " + arr2[i] );
		}
	}

	private static void selectionSort(int[] arr) {
		
		// 9,4,7,5,1;
		int n = arr.length;
		for (int i = 0; i < n-1; i++) {
			int index=i;
			for(int j=i+1; j<n;j++)
			{
				if(arr[j]<arr[index])
				{
					index=j;
				}
				if(index!=i)
				{
					int temp=arr[index];
					arr[index]= arr[i];
					arr[i]= temp;
					
				}
			}

		}

	}

}
