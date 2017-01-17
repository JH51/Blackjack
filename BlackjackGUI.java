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

	pane.add(l1);
	pane.add(l2);

	JButton b1 = new JButton("Hit");
        b1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		    game.player.draw(game.deck);
		    
		}
	    });
	JButton b2 = new JButton("Stay");
	
	pane.add(b1);
	pane.add(b2);

	game.player.draw(game.deck);
	game.player.draw(game.deck);

	game.dealer.draw(game.deck);
	game.dealer.draw(game.deck);

	pane.add(game.player.getHand()[0].toImage());
	pane.add(game.player.getHand()[1].toImage());

	JLabel l4 = new JLabel("Dealer");
	pane.add(l4);

	pane.add(game.dealer.getHand()[0].toImage());
	
    }
    
    public static void main(String[] args) {
	BlackjackGUI b = new BlackjackGUI();
	b.setVisible(true);
    }

}
