package ram.ds.algo.problems.string;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class MostCommonWordProblem {

	public static void main(String[] args) {

		String word1 = "Bob hit a ball the hit ball flew far after it was hit";
		String word2 = "loveworklater ";
		MostCommonWordProblem similar = new MostCommonWordProblem();
		System.out.println("Most Common Word  " + similar.mostCommonWord(word1));
		System.out.println("Most Common alfabate  is " + similar.mostCommonCharacter(word2));
		System.out.println("First Unique Character " + similar.firstUniqueCharacter(word2));
		

	}

	private String mostCommonWord(String word1) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		String[] result = word1.split(" ");
		for (String str : result) {

			int count = hashMap.getOrDefault(str, 0);
			count++;
			hashMap.put(str, count);
		}
		int maxValue = Integer.MIN_VALUE;
		String maxWord = "";
		for (String str : hashMap.keySet()) {
			int count = hashMap.get(str);
			if (count > maxValue) {
				maxValue = count;
				maxWord = str;
			}
		}
		return maxWord;
	}

	private char mostCommonCharacter(String word2) {
		char[] characters = word2.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (char c : characters) {
			int count = hm.getOrDefault(c, 0);
			count++;
			hm.put(c, count);
		}
		int maxCount = 0;
		char maxChar = Character.MIN_VALUE;
		for (Character key : hm.keySet()) {
			int count = hm.get(key);
			if (maxCount < count) {
				maxCount = count;
				maxChar = key;
			}
		}

		return maxChar;
	}

	private char firstUniqueCharacter(String word3) {
		LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<Character, Integer>();
		char[] result = word3.toCharArray();
		for (Character c : result) {
			int count = lhm.getOrDefault(c, 0);
			count++;
			lhm.put(c, count);

		}
		char found = Character.MIN_VALUE;
		System.out.println("Char /" + found + "/");
		for (Character c : lhm.keySet()) {

			if (lhm.get(c) == 1) {
				found = c;
				break;
			}
		}
		return found;

	}

}
