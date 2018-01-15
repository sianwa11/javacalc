package calculator;

import javax.swing.JFrame;

public class main {
	public static void main(String[]args) {
		GUI g=new GUI();
		g.setSize(440,350);
		g.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		g.setVisible(true);
		g.setResizable(false);
		
	}
}
