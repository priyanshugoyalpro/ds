package ram.ds.algo.problems.number;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueNumberInArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 8, 9, 10 };

		new UniqueNumberInArray().getUniqueArrayUdamey(arr).forEach(System.out::println);
	}

	private ArrayList<Integer> getUniqueArrayUdamey(int[] arr) {

		HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			int count = hs.getOrDefault(arr[i], 0);
			count++;
			hs.put(arr[i], count);
		}
		ArrayList<Integer> lsit = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (hs.get(arr[i]) == 1) {
				lsit.add(arr[i]);
			}
		}
		return lsit;

	}
}
