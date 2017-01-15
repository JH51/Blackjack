import javax.swing.*;
import java.awt.*;
import java.util.*;

public class BlackjackGUI extends JFrame{

    private Container pane;
    private JFrame frame = new JFrame("Blackjack");
    private Blackjack game;
    
    public BlackjackGUI() {
	this.setTitle("Vim City Blackjack Casino");
	this.setSize(1280, 720);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	pane = this.getContentPane();
	pane.setBackground( new Color(48,128,48) );
	pane.setLayout(new FlowLayout(2,5,200));
	JButton b1 = new JButton("Hit");
	JButton b2 = new JButton("Stay");
	JButton b3 = new JButton("Next Hand");
	JDialog d1 = new JDialog(frame, "How much would you like to wager?");

	d1.setLocationRelativeTo(pane);
	d1.setVisible(true);
	pane.add(b1);
	pane.add(b2);
	pane.add(b3);
    }
    
    public static void main(String[] args) {
	BlackjackGUI tester = new BlackjackGUI();
	tester.setVisible(true);
    }

}
