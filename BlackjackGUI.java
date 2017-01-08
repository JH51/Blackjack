import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class BlackjackGUI extends JFrame {
    
    private Container pane;
    
    public BlackjackGUI() {

	setLayout(new FlowLayout());
	this.setTitle("Vim City Blackjack Casino");
	this.setSize(1280, 720);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	pane = this.getContentPane();
	pane.setBackground(Color.green);
	pane.setLayout(new FlowLayout());
	JButton b1 = new JButton("Hit");
	JButton b2 = new JButton("Stay");
	
	pane.add(b1);
	pane.add(b2);
	
    }
    
    public static void main(String[] args) {
	BlackjackGUI tester = new BlackjackGUI();
	tester.setVisible(true);
    }
    
}
