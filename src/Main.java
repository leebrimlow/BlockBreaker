import java.awt.Color;

import javax.swing.JFrame;

public class Main {
	
	public static void main(String[]args){
		JFrame frame = new JFrame("BlockBreaker");
		BlockBreakerPanel panel = new BlockBreakerPanel();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(490, 600);
		frame.setResizable(false);
		frame.getContentPane().add(panel);
		frame.setBackground(Color.BLACK);
		
		
		
		
	}

}
