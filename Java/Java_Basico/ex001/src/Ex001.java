/**
 * 
 */

/**
 * @author Lucas Cardozo
 * 
 * 
 *
 */
import java.util.Scanner;

public class Ex001 {

	/**
	 * @param args

	 */
	
	/*Descri��o do Exerc�cio:
	 * 
	 * 1. Fa�a um algoritmo que leia a idade de uma pessoa expressa em anos, 
	 * meses e dias e mostre-a expressa em dias. Leve em considera��o o ano 
	 * com 365 dias e o m�s com 30. 
	 * (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.) 
	 * 
	 * */
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite sua idade em dias: ");
		int idade  = ler.nextInt();
		System.out.println();
		
		int anos = idade/365;
		int meses = (idade%365)/30;
		int dias = (idade%365)%30;
		
		System.out.println("Sua idade em dias corresponde a: ");
		System.out.printf("%d anos, %d meses e %d dias",anos, meses, dias);
		
		
	}

}
