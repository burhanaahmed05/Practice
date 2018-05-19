import java.util.Random;
import java.util.Scanner;

public class Lotterygame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		System.out.println("Please enter your lotter number");
		int number = scan.nextInt();
		int randomNumber= 1+random.nextInt();
		if(randomNumber==number) {
			System.out.println("You win");
		}
			else {
				System.out.println("Wish you best of luck for the next time");
				
			}
			
		}
	}
	

