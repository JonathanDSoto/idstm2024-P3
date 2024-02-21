import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Ventana extends JFrame{
	
	//contructor que define los atributos base
	//de mi ventana
	public Ventana(){
		
		this.setVisible(true);
		this.setSize(1000, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Mi ventana");
		this.setMinimumSize(new Dimension(250,250));
		this.setMaximumSize(new Dimension(1000,750));
		this.setResizable(true);
		this.setLocation(200, 200);
		this.setLocationRelativeTo(null);
		
		this.setLayout(null);//quitar el molde
		
		this.iniciarComponentes();
	}
	
	public void iniciarComponentes() {
		
		JPanel login = new JPanel();
		login.setSize(this.getWidth()/2, this.getHeight());
		login.setBackground(Color.gray);
		login.setLayout(null); // quitamos el molde
		
		JLabel login_tag = new JLabel("ACCEDER",0);
		login_tag.setSize(300, 80);
		login_tag.setFont( new Font("Marker Felt", Font.BOLD, 40) );
		login_tag.setForeground(Color.white);
		login_tag.setLocation(100, 20);
		login_tag.setOpaque(true);
		login_tag.setBackground(Color.red);
		login.add(login_tag);
		
		
		JLabel usr_tag = new JLabel("NOMBRE DE USUARIO: ");
		usr_tag.setBounds(10, 120, 200, 40);
		usr_tag.setFont( new Font("Marker Felt", Font.BOLD, 20) );
		login.add(usr_tag);
		
		JTextField usr_field = new JTextField();
		usr_field.setBounds(10, 160, 300, 40);
		login.add(usr_field);
		
		
		JLabel pwd_tag = new JLabel("CONTRASEÑA: ");
		pwd_tag.setBounds(10, 220, 200, 40);
		pwd_tag.setFont( new Font("Marker Felt", Font.BOLD, 20) );
		login.add(pwd_tag);
		
		JPasswordField pwd_field = new JPasswordField();
		pwd_field.setBounds(10, 260, 300, 40);
		login.add(pwd_field);
		
		JCheckBox remember = new JCheckBox("Recordarme");
		remember.setBounds(10, 300, 150, 40);
		login.add(remember);
		
		JLabel forgot_tag = new JLabel("¿Olvidó su contraseña?");
		forgot_tag.setBounds(160, 300, 150, 40);
		login.add(forgot_tag);
		
		JButton login_btn = new JButton("Acceder");
		login_btn.setBounds(50, 360, 200, 70);
		login_btn.setFont( new Font("Marker Felt", Font.BOLD, 30) );
		login.add(login_btn);
		
		//size
		//location
		//background - opaque 
		//string constructor
		
		JPanel registro = new JPanel();
		registro.setSize(this.getWidth()/2, this.getHeight());
		registro.setLocation(500, 0);
		registro.setBackground(Color.green);
		
		this.add(login);
		//this.add(registro);
		
	}
}
