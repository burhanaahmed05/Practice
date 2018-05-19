
public class Factorial {
public static void main(String[] args) {
	Factorial fact = new Factorial();
	fact.Fac(10);
}
public static int Fac(int n ) {
	int result;
	if(n<=1)
		return 1;
	result = Fac(n-1)*n;
	return result;
}
}
