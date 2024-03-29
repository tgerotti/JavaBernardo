package Trabalho_Aula_9;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import Trabalho_Aula_9.Visitantes;
import Trabalho_Aula_9.VisitantesDAO;

/**
 *
 * @author Thomas
 */
@SuppressWarnings("serial")
public class FramePrincipal extends javax.swing.JFrame {

    public FramePrincipal() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {

        jLabelCod = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnProximo = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnCarregaDados = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jTextFieldCod = new javax.swing.JTextField(5);
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldRG = new javax.swing.JTextField();
        jTextFieldUnidade = new javax.swing.JTextField();
        jTextFieldData = new javax.swing.JTextField();
        jTextFieldVisitado = new javax.swing.JTextField();
        jTextFieldCod.setEnabled(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelCod.setText("Cod");

        jLabel2.setText("Nome");

        btnProximo.setText("Proximo");

        btnAnterior.setText("Anterior");

        btnSair.setText("Sair");

        jLabel3.setText("RG");

        jLabel4.setText("Data");

        jLabel5.setText("Unidade");

        jLabel6.setText("Visitado");

        btnCarregaDados.setText("Carregar Dados");

        btnIncluir.setText("incluir");
       
        btnAlterar.setText("Alterar");

        btnExcluir.setText("Excluir");
        
        setTitle("Visitantes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnProximo)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabelCod)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(27, 27, 27)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAnterior))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                            .addComponent(jTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldRG, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldUnidade, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                            .addComponent(jTextFieldVisitado, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCarregaDados)
                        .addGap(71, 71, 71)
                        .addComponent(btnIncluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(btnExcluir)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProximo)
                    .addComponent(btnAnterior)
                    .addComponent(btnSair))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldVisitado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCarregaDados)
                    .addComponent(btnIncluir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
        
        //acoes
        btnSair.addMouseListener(new MouseAdapter(){  
            public void mouseClicked(MouseEvent e) {  
            	System.exit(0); 
        	}
         });  
        btnCarregaDados.addMouseListener(new MouseAdapter(){  
            public void mouseClicked(MouseEvent e) { 
            
            	carrega();
            	   	
        	}
         });
        
        btnProximo.addMouseListener(new MouseAdapter(){  
            public void mouseClicked(MouseEvent e) { 
            	          	
            	try {
            		result.next();
					jTextFieldCod.setText(result.getString(1));
            		jTextFieldNome.setText(result.getString(2));
            		jTextFieldVisitado.setText(result.getString(6));
            		jTextFieldData.setText(result.getString(4));
            		jTextFieldUnidade.setText(result.getString(5));
            		jTextFieldRG.setText(result.getString(3));
					
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
					jTextFieldCod.setText(result.getString(1));
            		jTextFieldNome.setText(result.getString(2));
            		jTextFieldVisitado.setText(result.getString(6));
            		jTextFieldData.setText(result.getString(4));
            		jTextFieldUnidade.setText(result.getString(5));
            		jTextFieldRG.setText(result.getString(3));
					
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
            		data = (Date)df.parse(jTextFieldData.getText());
            		
            		visitante.setCodVisitante(Integer.parseInt(jTextFieldCod.getText()));
    				visitante.setNome(jTextFieldNome.getText());
    				visitante.setVisitado(jTextFieldVisitado.getText());
    				visitante.setData(data);
    				visitante.setOrigem(jTextFieldUnidade.getText());
    				visitante.setRg(jTextFieldRG.getText());
            		     
            		visitantesDAO.alterar(visitante);
            		
            		JOptionPane.showMessageDialog(null,"Recarregando Dados");
            		carrega();	
            								
				} catch (ParseException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}             	
        	}
         });
        
        btnExcluir.addMouseListener(new MouseAdapter(){  
            public void mouseClicked(MouseEvent e) { 
            		            										            	
            	visitante.setCodVisitante(Integer.parseInt(jTextFieldCod.getText()));
				visitantesDAO.excluir(visitante);
				
				JOptionPane.showMessageDialog(null,"Recarregando Dados");
        		
				carrega();

        	}
         });
        btnIncluir.addMouseListener(new MouseAdapter(){  
            public void mouseClicked(MouseEvent e) { 
            
            	visitante.setNome(JOptionPane.showInputDialog("Entre com o Nome do Visitante"));
				visitante.setRg(JOptionPane.showInputDialog("Entre com o RG, RE ou RS do Visitante"));
				visitante.setOrigem(JOptionPane.showInputDialog("Entre com a unidade do Visitane"));
				visitante.setVisitado(JOptionPane.showInputDialog("Entre com o Nome da Pessoa a ser visitada"));
				
				visitantesDAO.incluir(visitante);
				
				carrega();
        	}
         });
        
        
        
        //fim acoes
        
    }// </editor-fold>
   
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnCarregaDados;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelCod;
    private javax.swing.JTextField jTextFieldCod;
    private javax.swing.JTextField jTextFieldData;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldRG;
    private javax.swing.JTextField jTextFieldUnidade;
    private javax.swing.JTextField jTextFieldVisitado;
    // End of variables declaration
    private VisitantesDAO visitantesDAO = new VisitantesDAO();
	private ResultSet result = visitantesDAO.select(); 
	private Visitantes visitante = new Visitantes();
    
	private void carrega(){
		try {
    		result = visitantesDAO.select();
    		result.first();
			jTextFieldCod.setText(result.getString(1));
    		jTextFieldNome.setText(result.getString(2));
    		jTextFieldVisitado.setText(result.getString(6));
    		jTextFieldData.setText(result.getString(4));
    		jTextFieldUnidade.setText(result.getString(5));
    		jTextFieldRG.setText(result.getString(3));
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}	         
	}

}
