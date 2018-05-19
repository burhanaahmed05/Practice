
public class PrimeNumberOrNot {

	public static boolean PrimeNumber(int number) {
		for(int i=2; i<=number/2; i++) {
			System.out.println(number/2);
			System.out.println(i);
			System.out.println(number%i);
			if(number%i==0) {
				return false;
			}
			
		}
		return true;
	}
public static void main(String[] args) {
	System.out.println("17 is a  prime number"+PrimeNumber(17));
}
}


