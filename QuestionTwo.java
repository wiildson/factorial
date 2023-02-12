
/*
 Crie um algoritmo que solicite um número inteiro positivo ao usuário e na sequência, calcule e exiba o número
do fatorial.
 */

package exerciseList;

import java.util.Locale;
import java.util.Scanner;

public class QuestionTwo {

	public static int number;
	public static int j = 1; 
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("CALCULADORA DE FATORIAL");
		
		System.out.println("Digite um número:");
		number = sc.nextInt();

		
		for(int i = 1; i <= number; i++) {
			j *= i;	
		}
		
		System.out.println(j);
	}

}
