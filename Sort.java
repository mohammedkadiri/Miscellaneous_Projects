import java.util.Arrays;

public class Sort {
	public static void main(String[] args){
		int a[] = {32, 35, 3, 5, 83, 1, 9};
		bubblesort(a);
	}
	
	public static void bubblesort(int a[]) {
		System.out.println("unsorted array " + Arrays.toString(a));
		int temp = 0;
		int n = a.length;
		//Outer loop to iterate to n-1 to sort  n elements
		for(int i = 0; i < n-1; i++) {
			
			//Inner loop to compare the adjacent element
			//After each iteration one index from the last is sorted
			for(int j = 1; j < n-i; j++){
				
				//If current number is greater then swap with adjacent element
				if(a[j-1] > a[j]){
				   temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("sorted array " + Arrays.toString(a));
	}
}
