package ram.ds.algo.problems.hard.number;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SmallestPositiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list= new ArrayList<Integer>();
		list.add(2);
		list.add(-3);
		list.add(-4);
		list.add(0);
		list.add(0);
		list.add(1);
		list.add(1);
		list.add(9);
		
		System.out.println(smallestPostiveNumber(list));
		
		

	}
		public static int smallestPostiveNumber(List<Integer> input)
		{
			
			//int[] hello = {2,3,4,5};
			
		//List<Integer> list = Arrays.stream(hello).boxed().collect(Collectors.toList());
		Set<Integer> hashSet=	input.stream().filter(x-> x>-1).collect(Collectors.toSet());
		int count=0;
		while(true)
		{	
			if(!hashSet.contains(count))
			{
				return count;
			}
			
			count++;
		}
		}
}
