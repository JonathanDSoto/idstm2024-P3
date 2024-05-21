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
import models.AuthModel;

public class AuthView {
	
	private JFrame frame;
	private Auth controller;
	private AuthModel auth;
	
	public AuthView() {
		
		frame = new JFrame();
		frame.setVisible(false);
		frame.setBounds(100, 100, 391, 492);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));

		auth = new AuthModel();
		
	}
	
	public void login() {
		
		JPanel panel = new JPanel(); 
		
		panel.setBackground(new Color(245, 148, 255)); 
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bienvenido");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
        lblNewLabel.setBounds(104, 59, 178, 42);
        panel.add(lblNewLabel);
        
        JTextField textField = new JTextField();
        textField.setBounds(71, 154, 273, 34);
        panel.add(textField);
        textField.setColumns(10);
        
        JTextField textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(71, 226, 273, 34);
        panel.add(textField_1);
        
        JLabel lblNewLabel_1 = new JLabel("Correo electrónico");
        lblNewLabel_1.setBounds(71, 137, 136, 16);
        panel.add(lblNewLabel_1);
        
        JLabel lblNewLabel_1_1 = new JLabel("Contraseña");
        lblNewLabel_1_1.setBounds(71, 212, 136, 16);
        panel.add(lblNewLabel_1_1);
        
        JButton btnNewButton = new JButton("Acceder");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		 
        		auth.login(textField.getText(),textField_1.getText());
        		 
        	}
        });
        btnNewButton.setBounds(71, 300, 267, 41);
        panel.add(btnNewButton);
        
        JLabel lblNewLabel_1_1_1_1 = new JLabel("¿Olvidó su contraseña?");
        lblNewLabel_1_1_1_1.setBounds(71, 341, 273, 16);
        panel.add(lblNewLabel_1_1_1_1);
        
        JButton btnNewButton_1 = new JButton("¿Aún no tienes cuenta?");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		controller = new Auth(); 
        		frame.removeAll();
        		frame.setVisible(false); 
        		controller.register();
        		
        	}
        });
        btnNewButton_1.setBounds(71, 384, 267, 29);
        panel.add(btnNewButton_1);
        
        frame.add(panel);
		
		frame.setVisible(true);
		frame.repaint();
		frame.revalidate();
	}
	
	public void register() {
		
		JPanel panel = new JPanel(); 
		
		panel.setBackground(new Color(245, 148, 255)); 
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Crear cuenta");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
        lblNewLabel.setBounds(104, 59, 178, 42);
        panel.add(lblNewLabel);
        
        JTextField textField = new JTextField();
        textField.setBounds(71, 154, 273, 34);
        panel.add(textField);
        textField.setColumns(10);
        
        JTextField textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(71, 226, 273, 34);
        panel.add(textField_1);
        
        JLabel lblNewLabel_1 = new JLabel("Correo electrónico");
        lblNewLabel_1.setBounds(71, 137, 136, 16);
        panel.add(lblNewLabel_1);
        
        JLabel lblNewLabel_1_1 = new JLabel("Contraseña");
        lblNewLabel_1_1.setBounds(71, 212, 136, 16);
        panel.add(lblNewLabel_1_1);
        
        JButton btnNewButton = new JButton("Acceder");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		 
        		 
        	}
        });
        btnNewButton.setBounds(71, 300, 267, 41);
        panel.add(btnNewButton);
        
        JLabel lblNewLabel_1_1_1_1 = new JLabel("¿Olvidó su contraseña?");
        lblNewLabel_1_1_1_1.setBounds(71, 341, 273, 16);
        panel.add(lblNewLabel_1_1_1_1);
        
        JButton btnNewButton_1 = new JButton("¿Aún no tienes cuenta?");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		frame.remove(panel);
       		 	login(); 
        		
        	}
        });
        btnNewButton_1.setBounds(71, 384, 267, 29);
        panel.add(btnNewButton_1);
        
        frame.add(panel);
		
		frame.setVisible(true);
		frame.repaint();
		frame.revalidate();
	}
}
