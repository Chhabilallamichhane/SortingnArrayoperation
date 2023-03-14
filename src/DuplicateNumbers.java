
public class DuplicateNumbers {

	public static void main(String[] args) {
		int [] a = {1,10,5,10,5,6,6};
		System.out.println("Duplicate Number in array are as follows: ");
		for(int i = 0; i<a.length; i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
				}
			}
		}
		

	}

}
