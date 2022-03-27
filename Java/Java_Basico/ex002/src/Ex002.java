/**
 * 
 */

/**
 * @author Lucas Cardozo
 *
 */
import java.util.Scanner;

public class Ex002 {

	/**
	 * @param args
	 */
	
	/*Descrição do Exercício:
	 * 
	 * Fazer um programa que imprima a média aritmética de 4 notas 
	 * solicitadas. 
	 * 
	 * */
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite a 1° nota: ");
		float nota1 = ler.nextFloat();
		System.out.print("Digite a 2° nota: ");
		float nota2 = ler.nextFloat();
		System.out.print("Digite a 3° nota: ");
		float nota3 = ler.nextFloat();
		System.out.print("Digite a 4° nota: ");
		float nota4 = ler.nextFloat();
		System.out.println();
		
		float media = (nota1+nota2+nota3+nota4)/4;
		
		System.out.print("A média aritmética é "+media);
		
	}

}
