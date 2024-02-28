import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana extends JFrame{
	
	//contructor que define los atributos base
	//de mi ventana
	public Ventana(){
		
		this.setVisible(true);
		this.setSize(1000, 750);
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
		
		//this.login();
		//this.registro();
		//this.admin();
		
		//this.calculadora();
		
		this.repaint();
		this.validate();
	}
	
	public void login() {
		
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
		
		
		JLabel logo = new JLabel(); 
		logo.setIcon( new ImageIcon(getClass().getResource("polluelo.png")) );
		logo.setBounds(100, 50, 100, 100);
		login.add(logo);
		
		
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
		
		this.add(login);
		
	}
	
	public void registro() {
		
		JPanel registro = new JPanel();
		registro.setSize(this.getWidth()/2, this.getHeight());
		registro.setLocation(500, 0);
		registro.setBackground(Color.decode("#47CBEC"));
		registro.setLayout(null);
		
		JLabel regis_tag = new JLabel("REGISTRO",0);
		regis_tag.setSize(300, 80);
		regis_tag.setFont( new Font("Marker Felt", Font.BOLD, 40) );
		regis_tag.setForeground(Color.white);
		regis_tag.setLocation(100, 20);
		regis_tag.setOpaque(true);
		regis_tag.setBackground(Color.black);
		registro.add(regis_tag);
		
		JLabel usr_tag = new JLabel("NOMBRE DE USUARIO: ",0);
		usr_tag.setBounds(50, 120, 400, 40);
		usr_tag.setFont( new Font("Marker Felt", Font.BOLD, 20) );
		usr_tag.setOpaque(true);
		usr_tag.setBackground(Color.yellow);
		registro.add(usr_tag);
		
		JTextField usr_field = new JTextField();
		usr_field.setBounds(50, 160, 400, 40);
		usr_field.setHorizontalAlignment(0);
		usr_field.setFont(new Font("Marker Felt", Font.PLAIN, 17));
		registro.add(usr_field);
		
		JLabel bio_tag = new JLabel("BIO",0);
		bio_tag.setBounds(50, 200, 400, 40);
		bio_tag.setFont( new Font("Marker Felt", Font.BOLD, 20) );
		registro.add(bio_tag);
		
		JTextArea bio_tex = new JTextArea();
		bio_tex.setBounds(50, 240, 400, 80);
		bio_tex.setFont( new Font("Marker Felt", Font.BOLD, 20) );
		registro.add(bio_tex);
		
		JLabel prefer_tag = new JLabel("PREFERENCIAS",0);
		prefer_tag.setBounds(50, 320, 400, 40);
		prefer_tag.setFont( new Font("Marker Felt", Font.BOLD, 20) );
		registro.add(prefer_tag);
		
		JCheckBox item_box_1 = new JCheckBox("Dulces");
		item_box_1.setBounds(50, 360, 80, 40);
		item_box_1.setFont(new Font("Marker Felt", Font.BOLD, 20)); 
		registro.add(item_box_1);
		
		JCheckBox item_box_2 = new JCheckBox("Salado");
		item_box_2.setBounds(140, 360, 90, 40);
		item_box_2.setFont(new Font("Marker Felt", Font.BOLD, 20));
		registro.add(item_box_2);
		
		JCheckBox item_box_3 = new JCheckBox("Saludable");
		item_box_3.setBounds(240, 360, 110, 40);
		item_box_3.setFont(new Font("Marker Felt", Font.BOLD, 20));
		item_box_3.setBorderPainted(true);
		item_box_3.setBorder(BorderFactory.createLineBorder(Color.red,2));
		registro.add(item_box_3);
		
		JLabel terms_tag = new JLabel("TÉRMINOS",0);
		terms_tag.setBounds(50, 400, 400, 40);
		terms_tag.setFont( new Font("Marker Felt", Font.BOLD, 20) );
		terms_tag.setOpaque(true);
		terms_tag.setBackground(Color.yellow);
		registro.add(terms_tag);
		
		JRadioButton accept_radio = new JRadioButton("Acepto los términos");
		accept_radio.setBounds(50, 440, 200, 40);
		accept_radio.setFont( new Font("Marker Felt", Font.BOLD, 20) );
		registro.add(accept_radio);
		
		JRadioButton reject_radio = new JRadioButton("No acepto los términos");
		reject_radio.setBounds(250, 440, 400, 40);
		reject_radio.setFont( new Font("Marker Felt", Font.BOLD, 20) );
		registro.add(reject_radio);
		
		ButtonGroup terms = new ButtonGroup();
		terms.add(accept_radio);
		terms.add(reject_radio);
		
		String colinias[]={"Centro","Camino Real","Pedregal","Conchalito","La 8"}; 
		
		JComboBox locations = new JComboBox(colinias);
		locations.setBounds(50, 480, 400, 40);
		locations.setFont(new Font("Marker Felt", Font.BOLD, 20));
		registro.add(locations);
		
		JButton rgs_btn = new JButton("Crear cuenta");
		rgs_btn.setBounds(50, 530, 400, 70);
		rgs_btn.setFont( new Font("Marker Felt", Font.BOLD, 30) );
		registro.add(rgs_btn);
		
		this.add(registro); 
		
	}

	public void admin() {
		
		//panel 
		JPanel admin_panel = new JPanel();
		admin_panel.setSize(this.getWidth(), this.getHeight());
		admin_panel.setLocation(0,0);
		admin_panel.setBackground(Color.decode("#6DE19B"));
		admin_panel.setLayout(null);
		
		//menu y opciones
		JMenuBar barra = new JMenuBar(); 
		JMenu menu_file = new JMenu("Archivo"); 
		JMenuItem open_item = new JMenuItem("Abrir archivo ...");
		JMenuItem create_item = new JMenuItem("Crear archivo ...");
		
		barra.add(menu_file);
		barra.setOpaque(true);
		barra.setBackground(Color.pink);
		
		menu_file.add(open_item);
		
		menu_file.setOpaque(true);
		menu_file.setBackground(Color.DARK_GRAY);
		
		open_item.setOpaque(true);
		open_item.setBackground(Color.red);
		
		menu_file.add(create_item);
		
		this.setJMenuBar(barra);
		
		//contenido del panel 
		
		JLabel users_tag = new JLabel("USUARIOS",0);
		users_tag.setSize(300, 80);
		users_tag.setFont( new Font("Marker Felt", Font.BOLD, 40) );
		users_tag.setForeground(Color.white);
		users_tag.setLocation(350, 20);
		users_tag.setOpaque(true);
		users_tag.setBackground(Color.black);
		admin_panel.add(users_tag);
		
		JLabel title_widget = new JLabel("Total de usuarios",0);
		title_widget.setFont( new Font("Marker Felt", Font.BOLD, 20) );
		title_widget.setBounds(40, 120, 300, 40); 
		title_widget.setForeground(Color.white);
		admin_panel.add(title_widget);
		
		JLabel content_widget = new JLabel("100",0);
		content_widget.setFont( new Font("Marker Felt", Font.BOLD, 30) );
		content_widget.setBounds(40, 160, 300, 40); 
		content_widget.setForeground(Color.white);
		admin_panel.add(content_widget);
		
		JLabel widget = new JLabel("");
		widget.setBounds(40, 120, 300, 100);
		widget.setOpaque(true);
		widget.setBackground(Color.black);
		admin_panel.add(widget);
		
		JButton donwload = new JButton("Exportar");
		donwload.setBounds(750, 230, 100, 40); 
		admin_panel.add(donwload);
		
		JButton add_user = new JButton("Añadir");
		add_user.setBounds(860, 230, 100, 40);
		admin_panel.add(add_user);
		
		String table_titles[] = { "No. Control", "Nombre", "Appellidos","Semestre","Promedio","Acciones" };
		
		String table_data[][]= {
				{ "No. Control", "Nombre", "Appellidos","Semestre","Promedio","Acciones" },
				{ "No. Control", "Nombre", "Appellidos","Semestre","Promedio","Acciones" },
				{ "No. Control", "Nombre", "Appellidos","Semestre","Promedio","Acciones" },
				{ "No. Control", "Nombre", "Appellidos","Semestre","Promedio","Acciones" },
				{ "No. Control", "Nombre", "Appellidos","Semestre","Promedio","Acciones" },
				{ "No. Control", "Nombre", "Appellidos","Semestre","Promedio","Acciones" },
				{ "No. Control", "Nombre", "Appellidos","Semestre","Promedio","Acciones" },
				{ "No. Control", "Nombre", "Appellidos","Semestre","Promedio","Acciones" },
				{ "No. Control", "Nombre", "Appellidos","Semestre","Promedio","Acciones" },
				{ "No. Control", "Nombre", "Appellidos","Semestre","Promedio","Acciones" },
				{ "No. Control", "Nombre", "Appellidos","Semestre","Promedio","Acciones" },
				{ "No. Control", "Nombre", "Appellidos","Semestre","Promedio","Acciones" },
				{ "No. Control", "Nombre", "Appellidos","Semestre","Promedio","Acciones" },
				{ "No. Control", "Nombre", "Appellidos","Semestre","Promedio","Acciones" },
				{ "No. Control", "Nombre", "Appellidos","Semestre","Promedio","Acciones" },
				{ "No. Control", "Nombre", "Appellidos","Semestre","Promedio","Acciones" },
				{ "No. Control", "Nombre", "Appellidos","Semestre","Promedio","Acciones" },
				{ "No. Control", "Nombre", "Appellidos","Semestre","Promedio","Acciones" },
				{ "No. Control", "Nombre", "Appellidos","Semestre","Promedio","Acciones" },
				{ "No. Control", "Nombre", "Appellidos","Semestre","Promedio","Acciones" },
				{ "No. Control", "Nombre", "Appellidos","Semestre","Promedio","Acciones" }
		};
		
		JTable table_users = new JTable(table_data,table_titles);
		//table_users.setBounds(40, 280, 920, 300);
		JScrollPane table_scroll = new JScrollPane(table_users);
		table_scroll.setBounds(40, 280, 920, 300);
		
		table_scroll.setOpaque(true);
		table_scroll.setBackground(Color.gray);
		
		admin_panel.add(table_scroll);
		
		/*JLabel tabla = new JLabel("");
		tabla.setBounds(40, 280, 920, 300);
		tabla.setOpaque(true);
		tabla.setBackground(Color.black);
		admin_panel.add(tabla);*/
		
		// añadir una tabla
		
		this.add(admin_panel);
		
	}
}
