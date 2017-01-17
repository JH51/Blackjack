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
		    JLabel stuff = new JLabel("" + game.player.count);
		    //pane.add(game.player.hand[game.player.count - 1].toImage());
		    setVisible(false);
		    setVisible(true);
		}
	    });
	JButton b2 = new JButton("Stay");
	
	pane.add(b1);
	pane.add(b2);

	JLabel l3 = new JLabel("Dealer");
	pane.add(l3);

	game.dealer.draw(game.deck);
	game.dealer.draw(game.deck);

	for (int i = 0; i < game.dealer.count; i += 1) pane.add(game.dealer.hand[i].toImage());

	JLabel l4 = new JLabel("Player");
	pane.add(l4);
	
	game.player.draw(game.deck);
	game.player.draw(game.deck);

	pane.add(game.player.hand[0].toImage());
	pane.add(game.player.hand[1].toImage());


	
    }
    
    public static void main(String[] args) {
	BlackjackGUI b = new BlackjackGUI();
	b.setVisible(true);
    }

}
