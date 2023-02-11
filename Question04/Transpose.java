package Question04;

public class Transpose {
	public static int[][] findTranspose(int arr[][]){
		int transpose[][] = new int[arr[0].length][arr.length];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				transpose[j][i] = arr[i][j];
			}
		}
		return transpose;
	}
	public static void main(String[] args) {
		int arr[][] = {{1,2,3,4},{5,6,7,8},{9,8,7,6},{5,4,3,2},{1,2,3,4}};
		System.out.println("Actual Array:");  
		for( int i = 0; i < arr.length; i++){    
			for(int j = 0; j < arr[0].length; j++){    
				System.out.print(arr[i][j]+" ");    
			}    
			System.out.println();    
		}
		int transpose[][] = findTranspose(arr);
		System.out.println("Transpose Array:");  
		for( int i = 0; i < transpose.length; i++){    
			for(int j = 0; j < transpose[0].length; j++){    
				System.out.print(transpose[i][j]+" ");    
			}    
			System.out.println();    
		}
	}
}
