package Question02;

import java.util.Scanner;

public class MultTable {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");        
        int num = scan.nextInt();
        for(int i = 0; i <= 10; i++){
            System.out.println(num + " X " + i + " = " + num * i);
        }
    }
}
