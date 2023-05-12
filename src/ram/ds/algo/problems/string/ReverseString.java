package ram.ds.algo.problems.string;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] s = {'h','e','l' ,'l','o'};
		reverseString(s);
		System.out.println(s);

	}
	
	
	public static void  reverseString(char[] s) {
		
			int right=s.length-1;
			int left=0;
			while(left<right)
			{
				char temp=s[left];
				s[left++] =s[right];
				s[right--] = temp;
			}
	
	       
	        System.out.println(s);
	            
	    }
    

}
