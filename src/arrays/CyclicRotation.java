package arrays;

public class CyclicRotation {
	
	public static void main(String[] args) {
		int shifts=5;
		int[] arr = new int[5];
		
		for(int i=1;i<5;i++) {
			arr[i]=i;
		}
		rotate(arr,shifts);
	}

	private static void rotate(int[] arr, int shifts) {
		int arrSize = arr.length;
		
		for(int i=0; i<shifts+1%arrSize; i++) {
			int lastElement = arr[arrSize-1];	
			int a = arr[0];
			for(int j=0;j<arrSize-1;j++) {
				int b=arr[j+1];
				arr[j+1]=a;
				a=b;
			}
			arr[0]=lastElement;
			
		}
		
		
		
		//displaying elements
		for(int j=0;j<arrSize;j++) {
			System.out.println(arr[j]);
		}
	}
}
