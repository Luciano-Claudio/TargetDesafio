package Target;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int n = input.nextInt();
		
		
		String palavra = Fibonacci(n) ? "pertence":"não pertence";
		
		System.out.printf("O número %d %s à sequência fibonacci!", n, palavra);

	}

	public static boolean Fibonacci(int n) {
		int n1 = 0, n2 = 1;
		int number = n1 + n2;
		for(int i=3;i<=Integer.MAX_VALUE;i++) {
			n1 = n2;
			n2 = number;
			number = n1 + n2;
			

			if(number >= n) 
				return number == n ? true : false;
		}
		return false;
	}
}
