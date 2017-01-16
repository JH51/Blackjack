import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BlackjackGUI extends JFrame{

    private Container pane;
    private JFrame frame = new JFrame("Blackjack");
    private Blackjack game = new Blackjack();
    private int money;
    private int score;
    
    public BlackjackGUI() {
	this.money = 100;
	this.score = 0;
	this.setTitle("Vim City Blackjack Casino");
	this.setSize(1280, 720);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	pane = this.getContentPane();
	pane.setBackground( new Color(48,128,48) );
	pane.setLayout(new FlowLayout(2,5,200));

	JLabel l1 = new JLabel("Money: " + money);
	JLabel l2 = new JLabel("Score: " + score);
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
	
	pane.add(l1);
	pane.add(l2);
	pane.add(b1);
	pane.add(b2);
	pane.add(b3);

	game.player.draw(game.deck);
	game.player.draw(game.deck);

	game.dealer.draw(game.deck);
	game.dealer.draw(game.deck);

	ImageIcon imageIcon1 = new ImageIcon(game.player.getHand()[0].img);
	Image image1 = imageIcon1.getImage();
	Image newimg1 = image1.getScaledInstance(120, 180,  java.awt.Image.SCALE_SMOOTH);
	imageIcon1 = new ImageIcon(newimg1);

	ImageIcon imageIcon2 = new ImageIcon(game.player.getHand()[1].img);
	Image image2 = imageIcon2.getImage();
	Image newimg2 = image2.getScaledInstance(120, 180,  java.awt.Image.SCALE_SMOOTH);
	imageIcon2 = new ImageIcon(newimg2);
	
	pane.add(new JLabel(imageIcon1));
	pane.add(new JLabel(imageIcon2));
	
    }
    
    public static void main(String[] args) {
	BlackjackGUI b = new BlackjackGUI();
	b.setVisible(true);
    }

}
