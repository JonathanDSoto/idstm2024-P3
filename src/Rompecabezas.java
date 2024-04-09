import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Rompecabezas {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rompecabezas window = new Rompecabezas();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Rompecabezas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() { 
		
		frame = new JFrame();
		frame.setBackground(new Color(255, 173, 172));
		frame.getContentPane().setBackground(new Color(255, 173, 172));
		frame.setBounds(100, 100, 450, 459);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		List<Integer> values = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,0);
	    //Collections.shuffle(values);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(234, 166, 255));
		frame.getContentPane().add(panel_1, BorderLayout.EAST);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel = new JLabel("New label");
		panel_1.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Reiniciar");
		
		
		JButton btnNewButton_1 = new JButton("New button");
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		panel_1.add(btnNewButton_2);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 173, 172));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(4, 4, 0, 0));
		
		
		ArrayList<JButton> botones = new ArrayList<JButton> ();
		
		for (int i = 0; i < 16; i++) {
			 
			botones.add(new JButton(""+values.get(i)));
			
			panel.add( botones.get(i) ); 
			
			botones.get(i).addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub 
					
					String tmp = ((JButton) e.getSource()).getText();  
					int pos= 0;
					
					for (int j = 0; j < values.size(); j++) {  
						if(tmp.equals(values.get(j).toString())) { 
							pos = j;
						} 
					}
					
					if( pos+1 < 16 && values.get(pos+1) == 0 ) { 
						values.set(pos+1, values.get(pos));
						values.set(pos,0);
					}
					if( pos-4 >= 0 && values.get(pos-4) == 0 ) { 
						values.set(pos-4, values.get(pos));
						values.set(pos,0);
					}
					if( pos+4 < 16 && values.get(pos+4) == 0 ) { 
						values.set(pos+4, values.get(pos));
						values.set(pos,0);
					}
					if( pos-1 >= 0 && values.get(pos-1) == 0 ) { 
						values.set(pos-1, values.get(pos));
						values.set(pos,0);
					}
					
					for (int i = 0; i < 16; i++) { 
						
						 botones.get(i).setText(""+values.get(i));
					
					 }
					
					boolean flag = true;
					int menor = values.get(0);
					for (int i = 0; i < 15; i++) {  
						
						if(menor <= values.get(i) ) {
							menor = values.get(i);
						}else {
							flag = false;
							break;
						} 
					}
					if(flag) {
						
						JOptionPane.showMessageDialog(null,
								null,
							    "Gano",
							    JOptionPane.WARNING_MESSAGE);
						
					}
					 
				}
				
			});
		} 
		 
        
        btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 Collections.shuffle(values);
				 
				 for (int i = 0; i < 16; i++) { 
						
					 botones.get(i).setText(""+values.get(i));
				
				 }
				 
				  
			}
		});
		panel_1.add(btnNewButton);
	}

}
