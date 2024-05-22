package views;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controllers.Auth;
import controllers.HomeController;
import controllers.StudentsController;
import models.AuthModel;

public class HomeView {
	
	private JFrame frame;
	private HomeController controller; 
	private StudentsController studensts ;

	public HomeView() {
		
		frame = new JFrame();
		frame.setVisible(false);
		frame.setBounds(100, 100, 391, 492);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
	}
	
	public void dashboard() {
		
		JPanel panel = new JPanel(); 
		
		panel.setBackground(new Color(245, 148, 255)); 
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bienvenido");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
        lblNewLabel.setBounds(104, 59, 178, 42);
        panel.add(lblNewLabel); 
        
        JButton btnNewButton = new JButton("Estudiantes");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		frame.dispose();
        		
        		studensts = new StudentsController();
        		studensts.home();
        		//auth.login(textField.getText(),textField_1.getText());
        		 
        	}
        });
        btnNewButton.setBounds(71, 150, 267, 41);
        panel.add(btnNewButton);
        
         
        
        JButton btnNewButton_1 = new JButton("Proyectos");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		//controller = new Auth(); 
        		frame.dispose();
        		//frame.setVisible(false); 
        		//controller.register();
        		
        	}
        });
        btnNewButton_1.setBounds(71, 200, 267, 29);
        panel.add(btnNewButton_1);
        
        frame.add(panel);
		
		frame.setVisible(true);
		frame.repaint();
		frame.revalidate();
	}

}
