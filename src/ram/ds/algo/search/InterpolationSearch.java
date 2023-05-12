package ram.ds.algo.search;

public class InterpolationSearch {

	int[] data;
	int numberOfRetries;

	public InterpolationSearch(int size) {
		data = new int[size];
		for (int i = 1; i <= size; i++) {
			data[i - 1] = i;
			numberOfRetries = 0;
		}
	}

	public static void main(String[] args) {

		InterpolationSearch binarySearch = new InterpolationSearch(100000);
		
		int search = 9999;
		
		boolean isFound=false; 
		int mid=0 ;
		int low = 0;
		int high = binarySearch.data.length-1;
		while (!isFound) {
			if(low>high)
			{
				System.out.println("Numver is not found no of tries " + binarySearch.numberOfRetries++);
				break;
			}
			mid = low + ((high - low) / (binarySearch.data[high] -
					binarySearch.data[low]))*( search -binarySearch.data[low]);
			binarySearch.numberOfRetries++;
			if (binarySearch.data[mid] == search) {
				isFound=true;
				System.out.println("Number found after " + binarySearch.numberOfRetries);
				break;
			}
			if (binarySearch.data[mid] <search ) {
				low = mid+1;
			}
			if (binarySearch.data[mid] > search ) {
				high = mid-1;
			} 	
		}
		

	}
}
