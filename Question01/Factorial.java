package Question01;

public class Factorial {
	public static int findFactorial(int number) {
		int factorial = 1;
		while ( number > 0 ) {  
			factorial *= number;
			--number;
		}
		return factorial;

	}
	public static void main(String[] args) {
		int num = 5;
		int fact = findFactorial(num);
		System.out.print("Number = "+num+"\tFactorial = "+fact);
	}

}
