package ram.ds.main;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class MainClass {
	
	 int fun() {
	        return 20;
	    }

	public static void main(String[] args) {
		  //System.out.println(fun());
		

		String str = "mango";
		String str1 = new String("mango");
		System.out.println(str != str1); //true
		System.out.println(str == str1); //false
		System.out.println(str1.equals(str));//true
		
		int [] arr = {1,4,2,3};
		System.out.println( "Ice cream + parlour " + iceCreamParrlour( arr));
		
		
		//listEmp.stream().filter( x -> x.getAge()>35).map(x -> x.getName()).coleect(Collector.toList());


		System.out.println(parseInteger("A1234"));

		List<Integer> marks = new ArrayList<Integer>();
		marks.add(73);
		marks.add(67);
		marks.add(38);
		marks.add(33);
		Integer sum=marks.stream().collect(Collectors.summingInt(Integer::intValue));
		System.out.println(sum + "sum Luxoft");
		
		//marks.stream()

		List<Integer> marks2= marks.stream().map(x -> {
			if (x <= 37) {
				return x;
			}
			if (x > 37) {
				int i = x % 5;
				System.out.println("i" + i);
				if (i >= 3) {
					 x = x + (5-i);
				}
			}
			System.out.println(x);
			return x;

		}

		).collect(Collectors.toList());
		//marks2.forEach(System.out::println);
		System.exit(0);

		String s = "04:59:59AM";

		String[] split = s.split(":");
		String hour = split[0];
		String minute = split[1];
		String second = split[2].substring(0, 2);
		String timeFormat = split[2].substring(2, 4);

		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);
		System.out.println(timeFormat);

		String result = "";
		if (timeFormat.equals("AM") && hour.equals("12")) {
			hour = "00";
			result = hour + ":" + minute + ":" + second;
		}
		result = hour + ":" + minute + ":" + second;
		int hourInt = Integer.parseInt(hour);
		if (timeFormat.equals("PM") && Integer.parseInt(hour) < 12) {
			hourInt = hourInt + 12;
			result = hourInt + ":" + minute + ":" + second;
		}

		System.out.println(result);
		
		

	}

	private static List<List<Integer>> iceCreamParrlour(int [] nums) {
		List<Integer> l1 = new ArrayList<>();
		List<List<Integer>> result= new ArrayList<>();

		int target=5;
		for(int i=0;i<nums.length-1;i++)
		{

		for(int j=1+i;j<nums.length;j++)
		{
			int sum= nums[i]+nums[j];
			if(sum==target)
			{
			l1.add(i);
			l1.add(j);
			result.add(l1);	
			break;
			}
		}
		}

		return result;
	}
	
	
	
	

	public static Integer parseInteger(String text) {
		int sum = 0;
		int powerLevel = 0;
		for (int i = text.length() - 1; i >= 0; i--) {
			char c = text.charAt(i);

			sum += Math.pow(10, powerLevel) * ((int) c - (int) '0');
			powerLevel++;
		}

		return sum;
	}

}
