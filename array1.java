package in.co.rays;

public class array1 {
	public static void main(String[] args) {
		
		int[] arr = {100, 10, 20, 50, 90, 110};
		
		int a = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] > a) {
				
				a = arr[i];
				
			}
			
		}
		
		System.out.println(a);
	}
}
