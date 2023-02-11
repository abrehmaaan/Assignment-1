package Question03;

public class MinAndMaxInArray {
	public static int findMin(int[] arr) {
		int min = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	public static int findMax(int[] arr) {
		int max = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	private static void sortAsc(int[] arr) {  
		for (int i = 1; i < arr.length; i++) {  
			int j = i;  
			int a = arr[i];  
			while ((j > 0) && (arr[j-1] > a)) {  
				arr[j] = arr[j-1];  
				j--;  
			}  
			arr[j] = a;  
		}  
	}
	private static void sortDsc(int[] arr) {  
		for (int i = 1; i < arr.length; i++) {  
			int j = i;  
			int a = arr[i];  
			while ((j > 0) && (arr[j-1] < a)) {  
				arr[j] = arr[j-1];  
				j--;  
			}  
			arr[j] = a;  
		}  
	}
	public static void main(String[] args) {
		int[] arr = {-21, 22, 3, 0, -9, 44, 32, 5, -23, 40, 89};
		System.out.print("Array : ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");			
		}
		System.out.println();
		int min = findMin(arr);
		int max = findMax(arr);
		System.out.println("Min : "+min+"\tMax : "+max);
		sortAsc(arr);
		System.out.print("Sorted Array (ASC) : ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");			
		}
		System.out.println();
		sortDsc(arr);
		System.out.print("Sorted Array (DSC) : ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");			
		}
		System.out.println();
	}
}
