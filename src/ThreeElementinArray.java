public class ThreeElementinArray {

	public void Repeating(int arr[], int size) {
		int i,j;
		System.out.println("repeating elements are:");
		for(i=0; i< arr.length; i++) {
			for(j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j])
					System.out.println(arr[i]+"");
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = {1,2,2,2,3,4};
		int arr_size = arr.length;
			
	}
	}

