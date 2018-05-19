//2c
public class CommonElementInArray {

	public static void main(String[] args) {
		int[] arr1 = {1,3,4,5,67,78};
		int[] arr2 = {12,56,76,87,878,4,1};
		for(int i=0; i<arr1.length; i++) {
			for(int j =0; j<arr2.length; j++) {
				if(arr1[i]==arr2[j]) {
					System.out.println(arr1[i]);
				}
			}
		}
	}
}
