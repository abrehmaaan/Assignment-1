package Question06;

import java.util.HashMap;
import java.util.Scanner;

public class CountLetters {
	public static HashMap<Character, Integer> countLetters(String str){
		HashMap<Character, Integer> noOfLetters = new HashMap<Character, Integer>();
		for(int i = 0; i < str.length(); i++) {
			Integer count = noOfLetters.get(str.charAt(i));
		    int newCount = (count==null ? 1 : count + 1);
		    noOfLetters.put(str.charAt(i), newCount);
		}
		return noOfLetters;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = new String(scan.nextLine());
		HashMap<Character, Integer> noOfLetters = countLetters(str);
		for (Character ch: noOfLetters.keySet()) {
		    String count = noOfLetters.get(ch).toString();
		    System.out.println(ch + " : " + count);
		}
	}
}
