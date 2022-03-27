/**
 * 
 */

/**
 * @author Lucas Cardozo
 *
 */
import java.util.Scanner;

public class Ex003 {

	/**
	 * @param args
	 */
	
	/*Descrição do Exercício:
	 * 
	 * Informar um saldo e imprimir o saldo com reajuste de 1%. 
	 * 
	 * */
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o salário: R$");
		float salario = ler.nextFloat();
		
		float salario_reajuste = salario+(salario*1/100);
		
		System.out.println("O salário com o reajuste de %1 é R$"+
		salario_reajuste);

	}

}
