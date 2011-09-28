package Aula_8_b;

import javax.swing.JButton;
import javax.swing.JFrame;


public class AcaoFrame extends JFrame {

	private JButton button;
	
	public AcaoFrame(){
		
		setTitle("AcaoFrame");
		
		setSize(200,200);
				
		button = new JButton("ação");
										
		button.addActionListener( new Acao() );
		
		add(button);		
		
	}
	
}
