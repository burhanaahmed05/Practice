import java.util.Scanner;

public class sum {
	static final int MODULUS = 1000000007;

		public static void main(String[] args) {
			System.out.println("Please enter your number");
			Scanner sc = new Scanner(System.in);

			int T = sc.nextInt();
			for (int tc = 0; tc < T; tc++) {
				long n = sc.nextLong();
				System.out.println(solve(n));
				solve(MODULUS);
			}

			sc.close();
		}

		static int solve(long n) {
			int T = 0;
			if(T<MODULUS);
			return (int) (n * n -(n-1)*(n-1));
		}
	}


