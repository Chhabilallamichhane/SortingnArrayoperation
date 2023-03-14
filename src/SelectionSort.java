
public class SelectionSort {

	public static void main(String[] args) {
		int [] arr = {10,6,11,8,9};
		int i=0, j=0;
		for(i = 0;i< arr.length; i++) {
			int min = i;
			for(j=i+1; j<arr.length; j++) {
				if(arr[j]< arr[min]) {
					min = j;
				}
				
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
			
		}
		System.out.println("The sorted Array after selection sort is: ");
		for(int e: arr) {
			System.out.println(e);
		}
		
	}

}
