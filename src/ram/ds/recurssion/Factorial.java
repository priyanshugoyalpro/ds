package ram.ds.recurssion;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(10));

		int input[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		//int input2[] = { 1, 2, 3 };

		System.out.println(plusOne(input).toString());

	}

	private static int fact(int i) {

		if (i == 1) {
			return 1;
		}

		return fact(i - 1) * i;

	}

	public static int[] plusOne(int[] digits) {
		long digit = 0;
		for (int i = 0; i < digits.length; i++) {
			int j = digits.length - 1 - i;
			
			digit = (long) (digit +  Math.pow(10, j) * digits[i]);
			System.out.println(digit);
		}

		digit = digit + 1;
		System.out.println(digit);

		String result = Long.toString(digit);
		char[] resultArr = result.toCharArray();
		int[] z = new int[resultArr.length];
		for (int i = 0; i < resultArr.length; i++) {
			z[i] = Character.getNumericValue(resultArr[i]);
		}

		return z;
	}

}
