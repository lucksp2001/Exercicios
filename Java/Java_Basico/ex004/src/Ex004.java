/**
 * @author Lucas Cardozo
 *
 */
import java.util.Scanner;

public class Ex004 {

	/**
	 * @param args
	 */
	
	/*Descrição do exercício:
  * Escrever um algoritmo que lê: 
	- a porcentagem do IPI a ser acrescido no valor das peças 
	- o código da peça 1, valor unitário da peça 1, quantidade de peças 1 
	- o código da peça 2, valor unitário da peça 2, quantidade de peças 2 
	O algoritmo deve calcular o valor total a ser pago e apresentar o resultado. 
	Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1) 
	*/
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite a porecentagem do IPI: ");
		float ipi = ler.nextInt();
		
		System.out.println();
		
		System.out.print("Digite o código da 1° peça: ");
		int codePeca1 = ler.nextInt();
		System.out.print("Digite o valor da 1° peça: R$");
		float valorPeca1 = ler.nextFloat();
		System.out.print("Digite a quantidade da 1° peça: ");
		int quantPeca1 = ler.nextInt();
		
		System.out.println();
		
		System.out.print("Digite o código da 2° peça: ");
		int codePeca2 = ler.nextInt();
		System.out.print("Digite o valor da 2° peça: R$");
		float valorPeca2 = ler.nextFloat();
		System.out.print("Digite a quantidade da 2° peça: ");
		int quantPeca2 = ler.nextInt();
		
		System.out.println();
		
		float valorTotal = ((valorPeca1*quantPeca1+valorPeca2*quantPeca2)*
				(ipi/100+1));
		
		System.out.println("O valor total a ser pago é R$"+valorTotal);
	}

}
