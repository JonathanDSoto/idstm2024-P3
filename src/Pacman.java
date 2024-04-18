import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;

public class Pacman extends JFrame implements KeyListener{

	//private JFrame frame;
	public int x=225,y=225;
	Player jp = new Player(x,y,25,25,"#68FF33");
	
	Player obstaculo = new Player(100,100,25,125,"#33CAFF");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pacman window = new Pacman();
					window.setVisible(true);
					//window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Pacman() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//frame = new JFrame();
		this.setBounds(100, 100, 450, 483);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		this.getContentPane().add(panel, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Reiniciar");
		btnNewButton.setFocusable(false);
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 0));
		this.getContentPane().add(panel_1, BorderLayout.CENTER);
		
		this.addKeyListener(this);
	}
	
	@Override
	public void paint(Graphics g){
		super.paint(g);
		
		Graphics2D g2d = (Graphics2D) g;
        
		g2d.setColor(Color.decode( jp.getC() ));  
		g2d.fillRect(jp.getX(),jp.getY(),jp.getW(),jp.getH());  
		
		
		g2d.setColor(Color.decode( obstaculo.getC() ));  
		g2d.fillRect(obstaculo.getX(),obstaculo.getY(),obstaculo.getW(),obstaculo.getH()); 
		
		//g2d.setColor(Color.green);  
        //g2d.fillRect(x,y,25,25);  
        
        
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		//System.out.println(e.getKeyCode());
		
		switch (e.getKeyCode()) {
			case 87: //w   
				jp.setY( jp.getY()-10 );
			break;
			case 83: //s 
				jp.setY( jp.getY()+10 );
				break;
			case 68: //d
				jp.setX( jp.getX()+10 );
				break;
			case 65: //d
				jp.setX( jp.getX()-10 );
				break;
			default:
			break;
		}
		
		System.out.println( jp.colision(obstaculo) );
		
		this.update(getGraphics()); 
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
