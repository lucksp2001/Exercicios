/**
 * @author Lucas Cardozo
 *
 */
import java.util.Scanner;

public class Ex005 {

	/**
	 * @param args
	 */
	
	/*Crie um algoritmo que leia o valor do salário mínimo e o valor do salário 
	 * de um usuário, calcule a quantidade de salários mínimos esse usuário
	 * ganha e imprima o resultado. (1SM=R$1045,00)
	 * */
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite seu salário: R$");
		float salario = ler.nextFloat();
		
		System.out.println();
		
		float salarioMinimo = salario/1045;
		
		System.out.printf("Seu salário corresponde a %.0f salário(s) mínimo",
				salarioMinimo);

	}

}
