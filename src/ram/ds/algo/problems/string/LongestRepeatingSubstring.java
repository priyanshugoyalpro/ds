package ram.ds.algo.problems.string;

import java.io.ObjectInputStream.GetField;
import java.util.HashMap;

public class LongestRepeatingSubstring {
	//Longest Substring Without Repating Characters
	public static void main(String[] args) {
		
		String repeateble1="abcdefabcdefghia";//8
		String repeateble2="abcd"; //4
		System.out.println("Longest Sunstring without Repating Characters " + longestNonRepatingCharacters(repeateble1));		
		char [] ch ={'h','e','l','l','o'};
		System.out.println(reverseString(ch));
	}

	private static int longestNonRepatingCharacters(String repeateble1) {
		// TODO Auto-generated method stub
		
		HashMap<Character,Integer> hm = new HashMap<Character, Integer>();
		int maxLenght=Integer.MIN_VALUE;
		for(int i=0;i<repeateble1.length();i++)
		{
			char c= repeateble1.charAt(i);
			int index= hm.getOrDefault(c, -1);
			if(index!=-1) 
			{
			int lenght= i-index;	
			maxLenght = Math.max(maxLenght, lenght);
			}
			hm.put(c, i);
			
		}	
		return maxLenght;
	}
	
	 public static char[]  reverseString(char[] s) {   
	        
	        char [] r= new char[s.length];
	        r=s;
	        s= new char[r.length];
	        int j=0;
	        for(int i=r.length-1;i>=0;i--)
	        {
	        	System.out.println("i "+i+"j "+j);
	            s[j] = r[i];
	                j++;
	        }
	        return s;
	 }
	        

}
