/**
 * @author Lucas Cardozo
 *
 */
import java.util.Scanner;

public class Ex005 {

	/**
	 * @param args
	 */
	
	/*Crie um algoritmo que leia o valor do sal�rio m�nimo e o valor do sal�rio 
	 * de um usu�rio, calcule a quantidade de sal�rios m�nimos esse usu�rio
	 * ganha e imprima o resultado. (1SM=R$1045,00)
	 * */
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite seu sal�rio: R$");
		float salario = ler.nextFloat();
		
		System.out.println();
		
		float salarioMinimo = salario/1045;
		
		System.out.printf("Seu sal�rio corresponde a %.0f sal�rio(s) m�nimo",
				salarioMinimo);

	}

}
