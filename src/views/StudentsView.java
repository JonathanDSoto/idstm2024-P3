package views;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import controllers.HomeController;

public class StudentsView {
	
	private JFrame frame;
	
	public StudentsView() {
		
		frame = new JFrame();
		frame.setVisible(false);
		frame.setBounds(100, 100, 391, 492);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
	}
	
	public void home(List<List> students) {
		
		JPanel panel = new JPanel(); 
		
		panel.setBackground(new Color(245, 148, 255)); 
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Estudiantes");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
        lblNewLabel.setBounds(104, 59, 178, 42);
        panel.add(lblNewLabel); 
        
        int y = 120;
        for (Iterator iterator = students.iterator(); iterator.hasNext();) {
			List list = (List) iterator.next(); 
			
			JLabel studiante = new JLabel(list.get(0)+" "+list.get(1)+"  "+list.get(2));
			studiante.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
			studiante.setBounds(104, 59, 178, y);
	        panel.add(studiante); 
			
	        y+=80;
		}
        
        //data.add("Juanito", "1234", "asd");
        //mandar tal y tal dato para crear un nuevo estudiante
        
        frame.add(panel);
		
		frame.setVisible(true);
		frame.repaint();
		frame.revalidate(); 
		
	}
	
}
