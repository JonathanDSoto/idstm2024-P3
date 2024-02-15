import java.awt.Dimension;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		JFrame ventana = new JFrame();
		
		//permite que la ventana sea visible
		ventana.setVisible(true);
		
		//tamaño de la ventana
		ventana.setSize(200, 200);
		
		//cerrar el programa por defecto
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//título
		ventana.setTitle("Mi ventana");
		
		//tamaños de la ventana
		ventana.setMinimumSize(new Dimension(250,250));
		ventana.setMaximumSize(new Dimension(750,750));
		ventana.setResizable(true);
		
		//ubicación en la pantalla
		ventana.setLocation(200, 200);
		
		//centrar
		ventana.setLocationRelativeTo(null);
	}

}
