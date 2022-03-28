/**
 * @author Lucas Cardozo
 *
 */
import java.util.Scanner;

public class Ex004 {

	/**
	 * @param args
	 */
	
	/*Descri��o do exerc�cio:
  * Escrever um algoritmo que l�: 
	- a porcentagem do IPI a ser acrescido no valor das pe�as 
	- o c�digo da pe�a 1, valor unit�rio da pe�a 1, quantidade de pe�as 1 
	- o c�digo da pe�a 2, valor unit�rio da pe�a 2, quantidade de pe�as 2 
	O algoritmo deve calcular o valor total a ser pago e apresentar o resultado. 
	F�rmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1) 
	*/
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite a porecentagem do IPI: ");
		float ipi = ler.nextInt();
		
		System.out.println();
		
		System.out.print("Digite o c�digo da 1� pe�a: ");
		int codePeca1 = ler.nextInt();
		System.out.print("Digite o valor da 1� pe�a: R$");
		float valorPeca1 = ler.nextFloat();
		System.out.print("Digite a quantidade da 1� pe�a: ");
		int quantPeca1 = ler.nextInt();
		
		System.out.println();
		
		System.out.print("Digite o c�digo da 2� pe�a: ");
		int codePeca2 = ler.nextInt();
		System.out.print("Digite o valor da 2� pe�a: R$");
		float valorPeca2 = ler.nextFloat();
		System.out.print("Digite a quantidade da 2� pe�a: ");
		int quantPeca2 = ler.nextInt();
		
		System.out.println();
		
		float valorTotal = ((valorPeca1*quantPeca1+valorPeca2*quantPeca2)*
				(ipi/100+1));
		
		System.out.println("O valor total a ser pago � R$"+valorTotal);
	}

}
