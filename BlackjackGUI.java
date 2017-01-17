package mainPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BlackjackGUI extends JFrame {


<<<<<<< HEAD
	JLabel l1 = new JLabel("Money: " + money);
	JLabel l2 = new JLabel("Score: " + score);

	pane.add(l1);
	pane.add(l2);

	JButton b1 = new JButton("Hit");
        b1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		    game.player.draw(game.deck);
		    pane.add(game.player.hand[game.player.count - 1].toImage());
		    gameRules();
		    update();
		}
	    });
	JButton b2 = new JButton("Stay");
	
	pane.add(b1);
	pane.add(b2);

	JLabel l3 = new JLabel("Dealer");
	pane.add(l3);
=======

>>>>>>> finalgui

    public BlackjackPanel panel = new BlackjackPanel();

<<<<<<< HEAD
	for (int i = 0; i < game.dealer.count; i += 1) pane.add(game.dealer.hand[i].toImage());

	JLabel l4 = new JLabel("Player");
	pane.add(l4);
	
	game.player.draw(game.deck);
	game.player.draw(game.deck);

        for (int i = 0; i < game.player.count; i += 1) pane.add(game.player.hand[i].toImage());
	
    }

    public void update() {
	setVisible(false);
	setVisible(true);
    }

    public void gameRules() {
	if (game.player.value > 21) {
	    JButton bust = new JButton("BUST");
	    this.pane.add(bust);
	}
	update();
    }
    
=======
    //gui
    JLabel moneyLabel;

    public BlackjackGUI() {

        this.setTitle("Vim City Blackjack Casino");
        this.setSize(1280, 720);
        this.setLocation(100, 100);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.add(panel);
        this.setComponentZOrder(panel, 0);

    }

>>>>>>> finalgui
    public static void main(String[] args) {
        BlackjackGUI b = new BlackjackGUI();
        b.setVisible(true);
    }
    
}
