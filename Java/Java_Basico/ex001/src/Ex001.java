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
