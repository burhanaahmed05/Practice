import java.util.Scanner;

public class DiceGame {

	public static String Username;
	public static String password;
	public static int betMoney;
	public static int Money;
	
	public static void main(String[] args) {
		System.out.println("Pleas Enter your credential");
		Scanner scan = new Scanner(System.in);
		
		Username = scan.nextLine();
		Username = "Burhan";
		if(Username == "Burhan") {
			System.out.println("Please enter the password");
			password = scan.nextLine();
			password = "ahmed";
			if(password=="ahmed") {
				System.out.println("Successfully Login");
			}
		}
		else {
			System.out.println("Wronge credential");
		}
		RollDice();
				}
	public static void RollDice() {
		Scanner sc = new Scanner(System.in);
		betMoney = sc.nextInt();
	System.out.println("Please enter the money"+betMoney);
	if(betMoney==2) {
		Money = betMoney*7;
		System.out.println("you win "+Money);
	}
	else if(betMoney ==1) {
		Money = betMoney*100;
		System.out.println("you win "+Money);
	}
	else if(betMoney ==10) {
		Money = betMoney *0;
		System.out.println("Sorry,you lose"+betMoney);
	}
	}
		
	}
	
	

