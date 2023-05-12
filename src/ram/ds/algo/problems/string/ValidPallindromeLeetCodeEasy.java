package ram.ds.algo.problems.string;

public class ValidPallindromeLeetCodeEasy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "A man, a plan, a canal: Panama";
		String s2 = "race a car";
		String s3 = "abc cba";
		System.out.println(isPalindrome(s));
		System.out.println(isPalindrome(s2));
		System.out.println(isPalindrome(s3));

	}

	public static boolean isPalindrome(String s) {

		s = s.toLowerCase();
		if (s.isEmpty()) {
			return true;
		}
		String fixed = "";

		for (char c : s.toCharArray()) {
			if (Character.isDigit(c) || Character.isLetter(c)) {
				fixed += c;
			}

		}
		int a = 0;
		int b = fixed.length() - 1;

		while (a < b) {
			if (fixed.charAt(a) != fixed.charAt(b)) {
				return false;
			}
			a++;
			b--;
		}

		return true;

	}

}
