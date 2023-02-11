package Question01;

public class WhileLoopExamples {

	public static void main(String[] args) {
		int children = 10, cookies = 1;
		System.out.println("Children : " + children);
		System.out.println("Cookies : " + cookies);
		while ( children > 0 ) {  
				children = children - 1 ;  
				cookies = cookies * 2 ;
		}
		System.out.println("Children : " + children);
		System.out.println("Cookies : " + cookies);
	}

}
