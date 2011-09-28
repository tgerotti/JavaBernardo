package Trabalho_Aula_9;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;  
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Form extends JFrame implements ActionListener{
	
	private JButton btnSair, btnAnterior, btnProximo, btnAlterar, btnExcluir, btnIncluir, btnCarregar;
	private JTextField textFieldnome, textFieldrg, textFieldorigem, textFieldvisitado, textFielddata, textFieldcod;

	private VisitantesDAO visitantesDAO = new VisitantesDAO();
	private ResultSet result = visitantesDAO.select(); 
	private Visitantes visitante = new Visitantes();
	
	
		public void CriaFrame(){
			
			this.setTitle("Visitantes");
			this.setSize(400, 450);
			btnCarregar = new JButton("Carregar dados");
			btnIncluir = new JButton("Incluir");
			btnExcluir = new JButton("Excluir");
			btnAlterar = new JButton("Alterar");
			btnProximo = new JButton("Proximo");
			btnAnterior = new JButton("Anterior");
			btnSair = new JButton("Sair");
			textFieldnome = new JTextField(35);
			textFieldrg = new JTextField(10);
			textFieldorigem = new JTextField(20);
			textFieldvisitado = new JTextField(35);
			textFielddata = new JTextField(10);
			textFieldcod = new JTextField(10);
			JLabel labelNome = new JLabel("Nome");
			JLabel labelRg = new JLabel("RG");
			JLabel labelOrigem = new JLabel("Origem");
			JLabel labelVisitado = new JLabel("Visitado");
			JLabel labelCod = new JLabel("Cod");
			JLabel labelData = new JLabel("Data");
			
			JPanel btnNavPainel = new JPanel();
			JPanel btnAcaoPainel = new JPanel();
			JPanel textFieldPainel = new JPanel(); 
			
			btnNavPainel.add(btnProximo);
			btnNavPainel.add(btnAnterior);
			btnNavPainel.add(btnSair);
			
			btnAcaoPainel.add(btnCarregar);
			btnAcaoPainel.add(btnIncluir);
			btnAcaoPainel.add(btnExcluir);
			btnAcaoPainel.add(btnAlterar);
			
			textFieldPainel.add(labelCod);
			textFieldPainel.add(textFieldcod);
			textFieldcod.setEnabled(false);
			textFieldPainel.add(labelNome);
			textFieldPainel.add(textFieldnome);
			textFieldPainel.add(labelRg);
			textFieldPainel.add(textFieldrg);
			textFieldPainel.add(labelData);
			textFieldPainel.add(textFielddata);
			textFieldPainel.add(labelOrigem);
			textFieldPainel.add(textFieldorigem);
			textFieldPainel.add(labelVisitado);
			textFieldPainel.add(textFieldvisitado);
												
			add(btnNavPainel, BorderLayout.NORTH );
			add(btnAcaoPainel, BorderLayout.SOUTH );
			add(textFieldPainel, BorderLayout.CENTER );
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	        pack();  
	        setVisible(true); 
	        
	        btnSair.addMouseListener(new MouseAdapter(){  
	            public void mouseClicked(MouseEvent e) {  
	            	System.exit(0); 
	        	}
	         });  
	        btnCarregar.addMouseListener(new MouseAdapter(){  
	            public void mouseClicked(MouseEvent e) { 
	            	           	
	            	try {
	            		result = visitantesDAO.select();
	            		result.first();
						textFieldcod.setText(result.getString(1));
	            		textFieldnome.setText(result.getString(2));
	            		textFieldvisitado.setText(result.getString(6));
	            		textFielddata.setText(result.getString(4));
	            		textFieldorigem.setText(result.getString(5));
	            		textFieldrg.setText(result.getString(3));
						
					} catch (SQLException e1) {
						e1.printStackTrace();
					}	            	
	        	}
	         });
	        
	        btnProximo.addMouseListener(new MouseAdapter(){  
	            public void mouseClicked(MouseEvent e) { 
	            	          	
	            	try {
	            		result.next();
						textFieldcod.setText(result.getString(1));
	            		textFieldnome.setText(result.getString(2));
	            		textFieldvisitado.setText(result.getString(6));
	            		textFielddata.setText(result.getString(4));
	            		textFieldorigem.setText(result.getString(5));
	            		textFieldrg.setText(result.getString(3));
						
					} catch (SQLException e1) {
						e1.printStackTrace();
						JOptionPane.showMessageDialog(null,"NAo Existem mais Registros");
						try {
							result.previous();
						} catch (SQLException e2) {
							// TODO Auto-generated catch block
							e2.printStackTrace();
						}
					}	            	
	        	}
	         });
	        btnAnterior.addMouseListener(new MouseAdapter(){  
	            public void mouseClicked(MouseEvent e) { 
	            	          	
	            	try {
	            		result.previous();
						textFieldcod.setText(result.getString(1));
	            		textFieldnome.setText(result.getString(2));
	            		textFieldvisitado.setText(result.getString(6));
	            		textFielddata.setText(result.getString(4));
	            		textFieldorigem.setText(result.getString(5));
	            		textFieldrg.setText(result.getString(3));
						
					} catch (SQLException e1) {
						e1.printStackTrace();
						JOptionPane.showMessageDialog(null,"NAo Existem mais Registros");
						try {
							result.next();
						} catch (SQLException e2) {
							// TODO Auto-generated catch block
							e2.printStackTrace();
						}
					}	            	
	        	}
	         });
	        btnAlterar.addMouseListener(new MouseAdapter(){  
	            public void mouseClicked(MouseEvent e) { 
	            	Date data = null;
	            	
	            	DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	            										            	
	            	try {
	            		data = (Date)df.parse(textFielddata.getText());
	            		
	            		visitante.setCodVisitante(Integer.parseInt(textFieldcod.getText()));
	    				visitante.setNome(textFieldnome.getText());
	    				visitante.setVisitado(textFieldvisitado.getText());
	    				visitante.setData(data);
	    				visitante.setOrigem(textFieldorigem.getText());
	    				visitante.setRg(textFieldrg.getText());
	            		     
	            		visitantesDAO.alterar(visitante);
	            		
	            		JOptionPane.showMessageDialog(null,"Para visualizar as alteracoes click em Carregar Dados");
	            								
					} catch (ParseException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}             	
	        	}
	         });
	        
	        btnExcluir.addMouseListener(new MouseAdapter(){  
	            public void mouseClicked(MouseEvent e) { 
	            		            										            	
	            	visitante.setCodVisitante(Integer.parseInt(textFieldcod.getText()));
					visitantesDAO.excluir(visitante);
					
					JOptionPane.showMessageDialog(null,"Para visualizar as alteracoes click em Carregar Dados");
	        	}
	         });
	        btnIncluir.addMouseListener(new MouseAdapter(){  
	            public void mouseClicked(MouseEvent e) { 
	            
	            	visitante.setNome(JOptionPane.showInputDialog("Entre com o Nome do Visitante"));
    				visitante.setRg(JOptionPane.showInputDialog("Entre com o RG, RE ou RS do Visitante"));
    				visitante.setOrigem(JOptionPane.showInputDialog("Entre com a unidade do Visitane"));
    				visitante.setVisitado(JOptionPane.showInputDialog("Entre com o Nome da Pessoa a ser visitada"));
    				
    				visitantesDAO.incluir(visitante);
    				
    				JOptionPane.showMessageDialog(null,"Para visualizar as alteracoes click em Carregar Dados");
	            	             	
	        	}
	         });
		}
		
		
		public static void main(String args[])  
	    {  
			Form formulario = new Form();  
			formulario.CriaFrame();
			
	    }

		@Override
		public void actionPerformed(ActionEvent evt) {
				
		}
	}

