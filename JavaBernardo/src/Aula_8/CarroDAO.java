package Aula_8;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class CarroDAO implements DAO<Carro> {

	private Connection conexao;
  	private PreparedStatement pstmt;
  	  	
  	private Conexao poolMySQL;
  	
  	public CarroDAO() {
        
  		poolMySQL = new Conexao("localhost","AULAJAVA","root","138138");//windows
  		//poolMySQL = new Conexao("localhost","AULAJAVA","root","bio138");//linux
  		 		   
    }
  	
  	public int incluir( Carro carro ){
  	
  		int resultado = 0;
		
		try {
						
			conexao = poolMySQL.connect();
			
			String sql = "INSERT INTO CARRO (datacreate,modelo,marca,cor,ano) VALUES (?,?,?,?,?)";
	  		
	  		pstmt = conexao.prepareStatement(sql);
	  		
	  		GregorianCalendar calendario = new GregorianCalendar();
	  		
	        java.sql.Date sqlDate = new java.sql.Date( calendario.getTime().getTime() );
	  		
	        pstmt.setDate( 1, sqlDate );
	        pstmt.setString( 2, carro.getModelo() );
	  	    pstmt.setString( 3, carro.getMarca() );
	  	    pstmt.setString( 4, carro.getCor() );
	  		pstmt.setInt( 5, carro.getAno() );
	  			  		
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
	public int alterar(Carro carro) {
		int resultado = 0;
		
		try {
			
			conexao = poolMySQL.connect();
			
			String sql = "UPDATE CARRO SET datacreate = ?,  modelo = ?, marca = ?, cor = ?, ano = ? WHERE codcarro = ?";
	  		
	  		pstmt = conexao.prepareStatement(sql);
	  		
	  		Date data = null;
	  		SimpleDateFormat formata = new SimpleDateFormat("yyyy-MM-dd");
	  		
	  		try {
				data = formata.parse(carro.getDatacreate());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	  		
	  		java.sql.Date sqlDate = new java.sql.Date(data.getTime()); 
	  		
	        pstmt.setDate( 1, sqlDate );
	        pstmt.setString( 2, carro.getModelo() );
	  	    pstmt.setString( 3, carro.getMarca() );
	  	    pstmt.setString( 4, carro.getCor() );
	  		pstmt.setInt( 5, carro.getAno() );
	  		pstmt.setInt(6, carro.getCodcarro());
	  			  		
	        resultado = pstmt.executeUpdate();
			  	   
	  	    conexao.close();	
	  	  
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}

	@Override
	public int excluir(Carro carro) {
		return 0;
	}
	
	public ResultSet select() {
		
		conexao = poolMySQL.connect();
		
		String query = "SELECT * FROM CARRO";
		
		ResultSet result = null;
  		
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
