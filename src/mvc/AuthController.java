package mvc;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class AuthController {
	
	private JFrame frame;
	private AuthView view;
	
	public AuthController() {
		
		frame = new JFrame();
		frame.setVisible(false);
		frame.setBounds(100, 100, 391, 492);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		view = new AuthView();
	}
	
	public void login() {
		
		frame.add(view.login());
		
		frame.setVisible(true);
		frame.repaint();
		frame.revalidate();
	}

}
