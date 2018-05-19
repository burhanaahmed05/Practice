import java.util.Scanner;

public class Summing_N {
	  static final Long modulus = (long) 1000000007;
	    public static void main(String args[] ) throws Exception {
	       System.out.println("Please enter the number");
	        Scanner scan = new Scanner(System.in);
	      //  int n = scan.nextInt();
	      //  for(int i =0; i <T; i++){
	          
	        int n = (int) scan.nextLong();
	            //int n = 0;
	             long T;
	            int s = (n*n) - (n-1)*(n-1);
	            System.out.println(solve(n));
		        solve(5);
 
	        //}
	      //  scan.close();
	    }
	    static Long solve(long n){
	        n=modulus;
	       // long T = (n*n) - (n-1)*(n-1);
			return modulus;
	         
	    }
	}

