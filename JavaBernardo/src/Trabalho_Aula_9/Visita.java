package Trabalho_Aula_9;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Visita {

	public static void main(String[] args) {
		//testes ok
		Visitantes visitante1 = new Visitantes("Carlos Alberto", "28.452.785-8", "Santana", "Dr. Alves");
		Visitantes visitante2 = new Visitantes("Alberto Roberto", "20.455.788-3", "Carandiru", "Dr. Olicio");
		Visitantes visitante3 = new Visitantes("Carlos Alberto", "24.442.733-3", "Santos", "Dr. Carlos");
		
		VisitantesDAO visitantesDAO = new VisitantesDAO();
		
		visitantesDAO.incluir(visitante1);
		visitantesDAO.incluir(visitante2);
		visitantesDAO.incluir(visitante3);
		
		
		ResultSet select = visitantesDAO.select();
		Visita.imprime(select);
		
	}
	
	
	
	
	public static void imprime(ResultSet result){
		Visitantes visitante = new Visitantes();
		try {
			while( result.next()){
					
				visitante.setCodVisitante(result.getInt(1));
				visitante.setNome(result.getString(2));
				visitante.setVisitado(result.getString(3));
				visitante.setData(result.getDate(4));
				visitante.setOrigem(result.getString(5));
				visitante.setRg(result.getString(6));
						
				System.out.println(visitante + "\n");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
