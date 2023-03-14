
public class QuickSortAlgo {
	
	 static void quickSort(int [] a, int low,int high) {
		
		 int pivot_index = 0 , i = 0, j =0;
		 
		if(low<high) {
			
			  pivot_index = low;
		      i = low;
			  j = high;
			
		while(i < j) {
			while(a[i]<= a[pivot_index] && i<high)
				i++;
			while(a[j]>= a[pivot_index] && j > low)
				j--;
			if(i<j) {
				int temp = a[i];
				a[i]= a[j];
				a[j] = temp;
			}
		}
	 
			int temp = a[pivot_index];
			a[pivot_index] = a[j];
			a[j] = temp;
			quickSort(a, low, j-1);
			quickSort(a, j+1, high);
			
		}
	 }

		
	public static void main(String[] args) {
		int [] a = {6,2,8,4,9,3,7,0,5};
		int low = 0;
		int high = a.length -1;
		quickSort(a, low, high);
		
		for(int e: a) {
			System.out.println(e);
		}
}
}