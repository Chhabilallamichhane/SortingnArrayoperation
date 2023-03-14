
public class BubbleSort {

	public static void main(String[] args) {
		int i = 0,j =1;
		int [] a = {4,2,6,3,9,8};
		while(i< a.length) {
			while(j<a.length) {
				if(a[j]<a[j-1]) {
					int temp = a[j];
					a[j]= a[j-1];
					a[j-1] = temp;
				}
				j++;
			}
			i++;
		}
		System.out.println("The sorted element of array are as follows: ");
		for(int e: a) {
			System.out.println(e);
		}

	}

	

}
