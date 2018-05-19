// find smallest number in given array of integer.
public class Smallest {

	public static int findSmallest(int [] arr) {
		int min = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(min >arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}
public static void main(String[] args) {
	int[] arr = {10,23,45,64};
	int minimum = findSmallest(arr);
	System.out.println("this is the smallest array"+minimum);
}	
}

