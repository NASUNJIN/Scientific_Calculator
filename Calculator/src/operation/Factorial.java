package operation;

public class Factorial {
	public static double calculate(int a) {
		int b = 1;
		for(int i = 1; i <= a; i++) {
			b = b * i; 
		}
		return b;
	}
}
