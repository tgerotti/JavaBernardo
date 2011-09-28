package Trabalho_Aula_9;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.GregorianCalendar;

import Aula_8.Conexao;

public class VisitantesDAO implements DAO<Visitantes>{
	private Connection conexao;
  	private PreparedStatement pstmt;
  	private Conexao poolMySQL;
  	
public VisitantesDAO() {
        
  		//poolMySQL = new Conexao("localhost","AULAJAVA","root","138138");//windows
  		poolMySQL = new Conexao("localhost","AULAJAVA","root","bio138");//linux
  		 		   
    }

	@Override
	public int incluir(Visitantes visitante) {
		int resultado = 0;
		
		try {
						
			String sql = "INSERT INTO VISITANTES (nome, rg, data, origem, visitado) VALUES (?,?,?,?,?)";
			conexao = poolMySQL.connect();
			pstmt = conexao.prepareStatement(sql);
	  		
	  		//seta data do sistema ao incluir o visitante 
	  		GregorianCalendar calendario = new GregorianCalendar();
	  		java.sql.Date sqlDate = new java.sql.Date( calendario.getTime().getTime() );
	  		
	        pstmt.setString( 1,visitante.getNome()  );
	  	    pstmt.setString( 2,visitante.getRg() );
	  	    pstmt.setDate( 3, sqlDate);
	  		pstmt.setString( 4, visitante.getOrigem());
	  		pstmt.setString( 5, visitante.getVisitado());
	  		
	  		resultado = pstmt.executeUpdate();
			conexao.close();	
	  	} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
	    	
			try {
	    		if( pstmt != null )
	    			pstmt.close();
	    	}catch (SQLException se) {
	            System.out.print("Erro Statement SQLException que ocorreu: \n" + se );
	        }
	    	
	    	try {
	    		if( conexao != null )
	    			conexao.close();
	    	}catch (SQLException se) {
	            System.out.print("Erro Connection SQLException que ocorreu: \n" + se );
	        }
	    	
	    }
		return resultado;
	}

	@Override
	public int alterar(Visitantes visitante) {
		int resultado = 0;
		
		try {
						
			String sql = "UPDATE VISITANTES SET nome = ?, rg = ?, data = ?, origem = ?, visitado = ? WHERE cod_visitante="
				+visitante.getCodVisitante();
			conexao = poolMySQL.connect();
			pstmt = conexao.prepareStatement(sql);
	  		
	  		//seta data do sistema ao incluir o visitante 
	  		//GregorianCalendar calendario = new GregorianCalendar();
			//converte uma date em dataSql(longDate)
	  		java.sql.Date sqlDate = new java.sql.Date( visitante.getData().getTime());
	  		
	        pstmt.setString( 1,visitante.getNome()  );
	  	    pstmt.setString( 2,visitante.getRg() );
	  	    pstmt.setDate( 3, sqlDate);
	  		pstmt.setString( 4, visitante.getOrigem());
	  		pstmt.setString( 5, visitante.getVisitado());
	  		
	  		resultado = pstmt.executeUpdate();
			conexao.close();	
	  	} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
	    	
			try {
	    		if( pstmt != null )
	    			pstmt.close();
	    	}catch (SQLException se) {
	            System.out.print("Erro Statement SQLException que ocorreu: \n" + se );
	        }
	    	
	    	try {
	    		if( conexao != null )
	    			conexao.close();
	    	}catch (SQLException se) {
	            System.out.print("Erro Connection SQLException que ocorreu: \n" + se );
	        }
	    	
	    }
	
		return resultado;
	}

	@Override
	public int excluir(Visitantes visitante) {
		int result = 0;
		
		conexao = poolMySQL.connect();
		String query = "DELETE FROM VISITANTES WHERE cod_visitante="+visitante.getCodVisitante();
		
		try {
			
  			pstmt = conexao.prepareStatement(query);
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	public ResultSet select () {
		
		ResultSet result = null;
		conexao = poolMySQL.connect();
		String query = "SELECT * FROM VISITANTES";
		
		try {
			
  			pstmt = conexao.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE);
			result = pstmt.executeQuery(query);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return result;
	}
	public ResultSet select (Visitantes visitante) {
		
		ResultSet result = null;
		conexao = poolMySQL.connect();
		String query = "SELECT * FROM VISITANTES WHERE cod_visitante="+visitante.getCodVisitante();
		
		try {
			pstmt = conexao.prepareStatement(query);
			result = pstmt.executeQuery(query);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}
