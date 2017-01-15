import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

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
	JButton b1 = new JButton("PLAY");
        b1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		    JDialog d = new JDialog(frame, "How much would you like to wager?", true);
		    JTextField t1 = new JTextField();
		    JButton b1_01 = new JButton("PLAY");
		    d.add(t1);
		    d.add(b1_01);
		    d.setSize(640, 360);
		    d.setLocationRelativeTo(frame);
		    d.setVisible(true);
		}
	    }
	    );
	JButton b2 = new JButton("Hit");
	JButton b3 = new JButton("Stay");
	JButton b4 = new JButton("Next Hand");

	pane.add(b1);
	pane.add(b2);
	pane.add(b3);
    }
    
    public static void main(String[] args) {
	BlackjackGUI tester = new BlackjackGUI();
	tester.setVisible(true);
    }

}
