package ram.ds.algo.problems.string;

import java.util.Arrays;

public class SimilarWordProblem {

	public static void main(String[] args) {

		String word1 = "LOOP";
		String word2 = "OOPL";

		SimilarWordProblem similar = new SimilarWordProblem();
		System.out.println("Is Similar Word  " + similar.isSimilarWord(word1, word2));

	}

	private boolean isSimilarWord(String word1, String word2) {

		boolean isSimilar = false;

		if (word1.length() != word2.length()) {
			return isSimilar;
		}
		char[] arr1 = word1.toCharArray();
		char[] arr2 = word2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				isSimilar = false;
				return isSimilar;

			}
		}

		return true;
	}

}
