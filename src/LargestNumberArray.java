
public class LargestNumberArray {

	public static void main(String[] args) {
		int numbers[]  =new int[] {11,34,33,46,55,6,76,96};
		int largest = numbers[0];
		for(int i=1; i<numbers.length; i++) {
			if(numbers[i]>largest) {
				largest = numbers[i];
			}
		}
		
		System.out.println("Largest number is :"+largest);
	}
}
