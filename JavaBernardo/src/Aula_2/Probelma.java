package Aula_2;
import java.util.Scanner;

public class Probelma {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner resposta = new Scanner( System.in );  
		
		boolean vendedor = true;
		
		while( vendedor ){
			
			System.out.print("Quantos itens vendidos ? ");
			
			int itens = resposta.nextInt();
			double valorBruto = 0;
			double valorPagar = 0;
						
			if( itens > 0 ){
				
				for( int a = 1; a <= itens; a++ ){
					
					System.out.print("valor item: " );
					double v = resposta.nextDouble();
					valorBruto = valorBruto + v;
					
				}
				
				valorPagar = 200 + ( valorBruto * 0.09 );
				
			}
			
			System.out.println("---------------------------------------");
			System.out.println("total itens.:" + itens);
			System.out.println("total vendas:" + valorBruto );
			System.out.println("comissão....:" + valorPagar );
			System.out.println("---------------------------------------");
						
			System.out.print("Pagar outro vendedor (S/N)");
			
			String r = resposta.next();
			
			if( r.toUpperCase().equals("N") )
				vendedor = false;
			
		}		

	}
}
