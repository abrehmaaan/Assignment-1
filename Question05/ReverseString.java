package Question05;

public class ReverseString {
	public static String reverseIterative(String str) {
		String reverse = "";
		for(int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		return reverse;
	}
	public static String reverseRecursive(String str) {
		if(str.length() == 1) {
			return str;
		}
		return str.charAt(str.length() - 1) + reverseRecursive(str.substring(0, str.length() - 1));
	}
	public static void main(String[] args) {
		String str = "NET CENTRIC PROGRAMMING";
		System.out.println("String = "+str);
		System.out.println("Reverse (Iterative) = "+reverseIterative(str));
		System.out.println("Reverse (Recursive) = "+reverseRecursive(str));
	}

}
