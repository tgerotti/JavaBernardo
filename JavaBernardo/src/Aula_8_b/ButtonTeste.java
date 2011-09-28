package Aula_8_b;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ButtonTeste {

	public static void main(String[] args) {
	
		ButtonFrame app = new ButtonFrame();
		app.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		app.setVisible( true );

	}

}

class ButtonFrame extends JFrame{
	
	public static final int DEFAULT_WIDTH = 300;
	public static final int DEFAULT_HEIGHT = 200;
	
	public ButtonFrame(){
		
		setTitle("ButtonTeste");
		setSize( DEFAULT_WIDTH, DEFAULT_HEIGHT );
		
		ButtonPanel painel = new ButtonPanel();
		
		add(painel);
		
	}
	
}

class ButtonPanel extends JPanel{
	
	public ButtonPanel(){
	
		JButton amareloButton = new JButton("Amarelo");
		JButton azulButton = new JButton("Azul");
		JButton vermelhoButton = new JButton("Vermelho");
		
		add(amareloButton);
		add(azulButton);
		add(vermelhoButton);
		
		CorAction amareloAction = new CorAction( Color.YELLOW );
		CorAction azulAction = new CorAction( Color.BLUE );
		CorAction vermelhoAction = new CorAction( Color.RED );
		
		amareloButton.addActionListener(amareloAction);
		
		azulButton.addActionListener(azulAction);
		
		vermelhoButton.addActionListener( new ActionListener(){
			public void actionPerformed(ActionEvent e) {
			
				JOptionPane.showMessageDialog(null, "Classe Anônima");
				
			}
			
		});
		
	}
	
	private class CorAction implements ActionListener {

		private Color fundo;
		
		public CorAction( Color c ){
			
			fundo = c;
			
		}
		
		public void actionPerformed(ActionEvent arg0) {
		
			setBackground(fundo);
			
		}
		
	}
	
}
