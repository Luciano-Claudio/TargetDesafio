package Target;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite uma palavra: ");
		String palavra = Invert(input.nextLine());
		
		System.out.println(palavra);

	}
	
	public static String Invert(String palavra) {
		char[] palavraArray;
		palavraArray = palavra.toCharArray();
		char aux;
		int tam = palavraArray.length-1;

		for(int i=0;i<=tam/2;i++) {
			aux = palavraArray[i];
			palavraArray[i] = palavraArray[tam-i];
			palavraArray[tam-i] = aux;
		}
		palavra = new String(palavraArray);
		
		return palavra;
		
	}
}
