
public class ArraySubset {

	public static void main(String[] args) {
		int [] a = {1,2,3,4,5};
		int [] b = {1,2,3,4,5,6};
		int l1 = a.length;
		int l2= b.length;
		int count = 0;
		for(int i = 0;i<l1; i++) {
			for(int j = 0;j<l2;j++) {
				if(a[i]== b[j]) {
					count = count + 1;
				}
			}
		}
if(l1>l2 && l2==count) {
	System.out.println("Array b is subset of array a");
}
else if(l1==count) {
	System.out.println("Array a is subset of array b");
}
else {
	System.out.println("no array is subset of another array");
}
	}

}
