//Sorting Array
public class AsendingOrder2E {

	public static void main(String[] args) {
		int n, temp;
		int[] a1 = {
				1,8,3,
				5,9,
				11,15,18
				};
		for(int i = 0; i<a1.length; i++) {
			for(int j=i+1; j< a1.length; j++) {
				if(a1[i]>a1[j]) {
					temp = a1[i];
					a1[i] = a1[j];
					a1[j] = temp;
				}
			}
		}
		System.out.println("Asending order:");
		for(int i=0; i<a1.length-1; i++) {
			System.out.println(a1[i]+"");
		}
		System.out.println(a1[a1.length-1]);
		}
	}

