package Aula_8;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CarroTeste {
	
	public static void main(String[] args) {
	
		System.out.println("Testando conexão com o banco de dados");
		
		//Carro c = new Carro("10-08-2011", "Ferrari", "F-300", "vermelho", 2010 );
		//Carro c1 = new Carro("08-08-2011", "fiat", "palio", "azul", 2010 );
		//Carro c2 = new Carro("08-08-2011", "toyota", "hillux", "vermelho", 2011 );
				
		CarroDAO carroDAO = new CarroDAO();
		Carro c1 = new Carro();
		
		System.out.println("Gravando dados no banco de dados");
		
		//carroDAO.incluir(c);
		//carroDAO.incluir(c1);
		//carroDAO.incluir(c2);
		
		ResultSet select = carroDAO.select();
		
		imprime(select, c1);
		
		c1.setAno(5000);
		
		carroDAO.alterar(c1);
		
		select = carroDAO.select();
		
		imprime(select, c1);
		
		System.out.println("\n\nTeste concluido !");
		
				
	}
	public static Carro imprime(ResultSet result, Carro carro){
		try {
			while( result.next()){
				carro.setCodcarro(result.getInt(1));
				carro.setDatacreate(result.getString(2));
				carro.setModelo(result.getString(3));
				carro.setMarca(result.getString(4));
				carro.setCor(result.getString(5));
				carro.setAno(result.getInt(6));
				
				System.out.println(carro + "\n");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return carro;
	}

}
