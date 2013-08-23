import javax.swing.JFrame;

public class Main {

	/* Authors: Joey Natale & Troy Frediani */
	
	public static void main(String[] args) {
		
		JFrame window = new JFrame("Dot Box RTS");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		window.setContentPane(new GamePanel());
		
		window.pack();
		window.setVisible(true);
		;
	}

}
