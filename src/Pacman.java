import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;

public class Pacman extends JFrame implements KeyListener{

	//private JFrame frame;
	public int x=225,y=225;
	public int dir = 0;
	Player jp = new Player(x,y,25,25,"#68FF33");
	
	Player obstaculos[] = {
				new Player(100,100,25,125,"#33CAFF"),
				new Player(400,400,25,125,"#FFAC33"),
				new Player(0,400,125,25,"#45A9AE")
				};
	
	
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
		
		Timer timer = new Timer(100, new ActionListener() {
		    public void actionPerformed(ActionEvent evt) { 
		         
		    	update(); 
		    }    
		});
		
		timer.start();

	}
	
	 
	
	@Override
	public void paint(Graphics g){
		super.paint(g);
		
		Graphics2D g2d = (Graphics2D) g;
        
		g2d.setColor(Color.decode( jp.getC() ));  
		g2d.fillRect(jp.getX(),jp.getY(),jp.getW(),jp.getH());  
		
		for (Player obstaculo : obstaculos) {
			
			g2d.setColor(Color.decode( obstaculo.getC() ));  
			g2d.fillRect(obstaculo.getX(),obstaculo.getY(),obstaculo.getW(),obstaculo.getH()); 
		}
        
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
				dir = 1;
			break;
			case 83: //s  
				dir = 2;
				break;
			case 68: //d 
				dir = 3;
				break;
			case 65: //a
				dir = 4;
				break;
			default:
			break;
		} 
		
		
	}
	
	public void update() {
		
		
		switch (dir) {
			case 1: //w   
				jp.setY( jp.getY()-10 ); 
			break;
			case 2: //s 
				jp.setY( jp.getY()+10 ); 
				break;
			case 3: //d
				jp.setX( jp.getX()+10 ); 
				break;
			case 4: //a
				jp.setX( jp.getX()-10 ); 
				break;
			default:
			break;
		} 
		
		for (Player obstaculo : obstaculos) { 
			
			if(jp.colision(obstaculo)) {  
				
				if(dir==1) {
					jp.setY( jp.getY()+10 );
				}
				if(dir==2) {
					jp.setY( jp.getY()-10 );
				}
				if(dir==3) {
					jp.setX( jp.getX()-10 );
				}
				if(dir==4) {
					jp.setX( jp.getX()+10 ); 
				}
			} 
		}
		
		
		this.update(getGraphics()); 
		
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
