package Snake_Game;

import javax.swing.JFrame;

public class gameFrame extends JFrame{

	gameFrame(){
		this.add(new gamePanel());
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
}
