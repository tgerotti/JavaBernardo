package Aula_7;

import java.util.ArrayList;

public class TestaCarro {

	public static void main(String[] args) {
		ArrayList<Carro> carros = new ArrayList<Carro>();
		Pessoa pessoa1, pessoa2;
				
		pessoa1 = new Pessoa();
		pessoa2 = new Pessoa("Antonio Silva & Silva", 
				"45.344.333-4", "044.445.921-13", "(18)-4545.6745");
		Carro carro1 = new Carro("CDH-7175", 2005, "Fiat", "Punto", 1.8f, "Carlos Antonio Silva", 
				"27.359.887-4", "237.885.998-94", "(11)-6585.6644");
		Carro carro2 = new Carro("",0,"","",0.0f,pessoa2);
		Carro carro3 = new Carro("CDH-7175", 2005, "Fiat", "Punto", 1.8f, pessoa1);
		
		carros.add(carro1);
		carros.add(carro2);
		carros.add(carro3);
		
		for(Carro e : carros){
			System.out.print(e+"\n\n");
		}
		
		System.out.println("Quantidade de Carros: " + Carro.conatador + "\n");
		System.out.println("Descricao(): " + carro1.descricao());
		System.out.println("Detalhes(): " + carro1.detalhes());
	}

}
