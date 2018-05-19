import java.util.Scanner;

public class SwapWith3rdValue {

	public static void main(String[] args) {
		int a,b;
		System.out.println("Enter the number a and b");
		Scanner scan = new Scanner(System.in);
		a=scan.nextInt();
		b=scan.nextInt();
		System.out.println("Before swaping a:"+a+":b"+b);
		
		a = a-b;
		a=a+b;
		b=b-a;
		System.out.println("After swaping a:"+a+"b:"+b);
		

	}

}
