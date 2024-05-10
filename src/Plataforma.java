import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.Font;
import javax.swing.SwingConstants;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.io.FileReader;
import java.io.IOException;

public class Plataforma {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Plataforma window = new Plataforma();
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
	public Plataforma() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 391, 492);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.login(frame);
		
		JMenuBar barra = new JMenuBar(); 
		barra.setOpaque(true);
		barra.setBackground(Color.pink);
		
		/* 
		 * CUENTA
		 * */
		JMenu cuenta = new JMenu("Cuenta"); 
		
		barra.add(cuenta);
		
		JMenuItem open_item = new JMenuItem("Login");
		open_item.setOpaque(true);
		open_item.setBackground(Color.red); 
		
		open_item.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				frame.getContentPane().removeAll(); 
				login(frame);
				frame.getContentPane().repaint();
				frame.getContentPane().revalidate();

				
			}
		});
		
		cuenta.add(open_item);
		
		JMenuItem create_item = new JMenuItem("Registro"); 
		cuenta.add(create_item);
		create_item.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				frame.getContentPane().removeAll(); 
				registro(frame);
				frame.getContentPane().repaint();
				frame.getContentPane().revalidate();

				
			}
		});
		
		JMenuItem recover = new JMenuItem("Recuperación de cuenta"); 
		cuenta.add(recover);
		recover.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				frame.getContentPane().removeAll(); 
				recover(frame);
				frame.getContentPane().repaint();
				frame.getContentPane().revalidate();

				
			}
		});
		
		/* 
		 * USUARIOS
		 * */
		
		JMenu usuarios = new JMenu("Usuarios"); 
		barra.add(usuarios);
		
		JMenuItem create_user = new JMenuItem("Alta"); 
		usuarios.add(create_user);
		
		JMenuItem delete_user = new JMenuItem("Baja"); 
		usuarios.add(delete_user);
		
		JMenuItem view_user = new JMenuItem("Consultar"); 
		usuarios.add(view_user);
		/* 
		 * AYUDA
		 * */
		
		JMenu help = new JMenu("Ayuda");  
		barra.add(help); 
		
		JMenuItem ques_1 = new JMenuItem("¿Cómo crear un usuario?"); 
		help.add(ques_1);
		
		JMenuItem ques_2 = new JMenuItem("¿Cómo acceder al sistema?"); 
		help.add(ques_2);
		
		JMenuItem ques_3 = new JMenuItem("¿Qué pasa si olvidé mi contraseña?"); 
		help.add(ques_3);
		
		
		frame.setJMenuBar(barra); 
		
	}
	
	private void login(JFrame frame) {
		
		frame.revalidate();
		frame.repaint(); 
		
		JPanel login_panel = new JPanel();
        login_panel.setBackground(new Color(245, 148, 255)); 
        login_panel.setLayout(null);
        //login_panel.setVisible(false);
        frame.getContentPane().add(login_panel, BorderLayout.CENTER);
        
        JLabel lblNewLabel = new JLabel("Bienvenido");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
        lblNewLabel.setBounds(104, 59, 178, 42);
        login_panel.add(lblNewLabel);
        
        textField = new JTextField();
        textField.setBounds(71, 154, 273, 34);
        login_panel.add(textField);
        textField.setColumns(10);
        
        JTextField textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(71, 226, 273, 34);
        login_panel.add(textField_1);
        
        JLabel lblNewLabel_1 = new JLabel("Correo electrónico");
        lblNewLabel_1.setBounds(71, 137, 136, 16);
        login_panel.add(lblNewLabel_1);
        
        JLabel lblNewLabel_1_1 = new JLabel("Contraseña");
        lblNewLabel_1_1.setBounds(71, 212, 136, 16);
        login_panel.add(lblNewLabel_1_1);
        
        JButton btnNewButton = new JButton("Acceder");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		System.out.println("Hola");
        		
        		JSONParser parser = new JSONParser();
        		/*
        		try {
					Object obj = parser.parse(new FileReader("users.json"));
				
        		
        		
        		
        		
        		} catch (IOException | ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
        		*/
        	}
        });
        btnNewButton.setBounds(71, 300, 267, 41);
        login_panel.add(btnNewButton);
        
        JLabel lblNewLabel_1_1_1_1 = new JLabel("¿Olvidó su contraseña?");
        lblNewLabel_1_1_1_1.setBounds(71, 341, 273, 16);
        login_panel.add(lblNewLabel_1_1_1_1);
        
        JButton btnNewButton_1 = new JButton("¿Aún no tienes cuenta?");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		frame.remove(login_panel);
        		registro(frame); 
        		frame.revalidate();
        		frame.repaint(); 
        		
        	}
        });
        btnNewButton_1.setBounds(71, 384, 267, 29);
        login_panel.add(btnNewButton_1);
	}

	private void registro(JFrame frame) {
		
		 
		
		JPanel registro_panel = new JPanel();
		registro_panel.setBackground(new Color(123, 255, 181));
		frame.getContentPane().add(registro_panel, BorderLayout.CENTER);
		registro_panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registro");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
        lblNewLabel.setBounds(104, 39, 178, 42);
        registro_panel.add(lblNewLabel);
        
        textField = new JTextField();
        textField.setBounds(71, 130, 273, 34);
        registro_panel.add(textField);
        textField.setColumns(10);
        
        JTextField textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(71, 190, 273, 34);
        registro_panel.add(textField_1);
        
        JLabel lblNewLabel_1 = new JLabel("Correo electrónico");
        lblNewLabel_1.setBounds(71, 113, 136, 16);
        registro_panel.add(lblNewLabel_1);
        
        JLabel lblNewLabel_1_1 = new JLabel("Nombre completo");
        lblNewLabel_1_1.setBounds(71, 176, 136, 16);
        registro_panel.add(lblNewLabel_1_1);
        
        JButton btnNewButton = new JButton("Registro");
        btnNewButton.setBounds(71, 300, 267, 41);
        registro_panel.add(btnNewButton);
        
        JLabel lblNewLabel_1_1_2 = new JLabel("Contraseña");
        lblNewLabel_1_1_2.setBounds(71, 246, 136, 16);
        registro_panel.add(lblNewLabel_1_1_2);
        
        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(71, 260, 273, 34);
        registro_panel.add(textField_2);
        
        JButton btnNewButton_2 = new JButton("Ya tienes cuenta?");
        btnNewButton_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		frame.remove(registro_panel);
        		login(frame); 
        		frame.revalidate();
        		frame.repaint(); 
        		
        	}
        });
        btnNewButton_2.setBounds(123, 375, 159, 29);
        registro_panel.add(btnNewButton_2);
		
	}
	
	private void recover(JFrame frame) {
		
		frame.revalidate();
		frame.repaint(); 
		
		JPanel login_panel = new JPanel();
        login_panel.setBackground(new Color(255, 141, 51)); 
        login_panel.setLayout(null);
        //login_panel.setVisible(false);
        frame.getContentPane().add(login_panel, BorderLayout.CENTER);
        
        JLabel lblNewLabel = new JLabel("Recuperar cuenta");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
        lblNewLabel.setBounds(77, 59, 243, 42);
        login_panel.add(lblNewLabel);
        
        textField = new JTextField();
        textField.setBounds(71, 154, 273, 34);
        login_panel.add(textField);
        textField.setColumns(10);
        
        JLabel lblNewLabel_1 = new JLabel("Correo electrónico");
        lblNewLabel_1.setBounds(71, 137, 136, 16);
        login_panel.add(lblNewLabel_1);
        
        JButton btnNewButton = new JButton("Reestablecer");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnNewButton.setBounds(71, 217, 267, 41);
        login_panel.add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("Regresar al login");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		frame.remove(login_panel);
        		registro(frame); 
        		frame.revalidate();
        		frame.repaint(); 
        		
        	}
        });
        btnNewButton_1.setBounds(77, 316, 267, 29);
        login_panel.add(btnNewButton_1);
	}
}
