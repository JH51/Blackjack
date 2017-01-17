package mainPackage;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class BlackjackPanel extends JPanel {

    private int betAmount;
    private int score;
    private Blackjack game;
    private boolean GameOver = true;
    private Point cardLocationPlayer;
    private Point cardLocationDealer;

    //gui:
    JLabel moneyLabel;
    JLabel scoreLabel;
    JButton playButton;
    JButton hitButton;
    JButton stayButton;
    JButton nextButton;

    public BlackjackPanel() {
        setBackground(new Color(48, 128, 48));
        setLayout(new FlowLayout(2, 5, 200));

        cardLocationPlayer = new Point(430, 510);
        cardLocationDealer = new Point(430, 50);


        this.betAmount = 100;
        this.score = 0;
        moneyLabel = new JLabel("Money: " + betAmount);
        scoreLabel = new JLabel("Score: " + score);
        playButton = new JButton("PLAY");
        hitButton = new JButton("Hit");
        stayButton = new JButton("Stay");
        nextButton = new JButton("Next Hand");

        playButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startgame();
            }
        });
        hitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                hitButtonAction();
            }
        });

        stayButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                stayButtonAction();
            }
        });

        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nextButtonAction();
            }
        });

        this.add(moneyLabel);
        this.add(scoreLabel);
        this.add(playButton);
        this.add(hitButton);
        this.add(stayButton);
        this.add(nextButton);

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (!GameOver) {
            paintCards(g, game.player, cardLocationPlayer, false);


            if (game.dealer.hand[2] == null) {
                paintCards(g, game.dealer, cardLocationDealer, true);
            } else {
                paintCards(g, game.dealer, cardLocationDealer, false);
            }
        }


    }

    public void startgame() {
        try {
            game = new Blackjack();
            String message = JOptionPane.showInputDialog(null, "How much would you like to wager?");
            betAmount = Integer.parseInt(message);
            moneyLabel.setText("Money: " + (game.money - betAmount));

            score = 0;
            scoreLabel.setText("Score: " + score);

            GameOver = false;

            //set up game:
            game.player.draw(game.deck);
            game.player.draw(game.deck);

            game.dealer.draw(game.deck);
            game.dealer.draw(game.deck);

            repaint();

        } catch (Exception f) {
            System.out.println("error on play button action");
        }
    }

    public void paintCards(Graphics g, Agent agent, Point point, boolean start) {
        int cardsToPrint;
        if (start) {
            cardsToPrint = 1;
        } else {
            cardsToPrint = agent.count;
        }


        cardLocationPlayer = new Point(430, 510);
        cardLocationDealer = new Point(430, 50);
        try {
            for (int i = 0; i < cardsToPrint; i++) {

                String cardFolder = "/img/";
                String cardname = "";

                cardname = agent.getHand()[i].toString().replaceAll(" ", "_");
                cardname += ".png";


                BufferedImage temp;
                temp = ImageIO.read(getClass().getResource(cardFolder + cardname));

                g.drawImage(temp, point.x, point.y, 120, 155, null);
                point.x += 130;

            }
            if (start) {
                BufferedImage temp;
                temp = ImageIO.read(getClass().getResource("/img/hidden.png"));

                g.drawImage(temp, point.x, point.y, 120, 155, null);

            }

        } catch (IOException ex) {
            System.out.println("error - loading cards");
        }

    }

    public void hitButtonAction() {
        if (!GameOver) {
            game.player.draw(game.deck);
            repaint();
            System.out.println("\nYou have drawn a "
                    + game.player.getHand()[2].toString());


            if (game.player.getValue() > 21) {
                System.out.println(game.player.getValue()
                        + " is your new hand value, you BUST");

                game.money -= betAmount;
                moneyLabel.setText("Money" + game.money);
                JOptionPane.showMessageDialog(null, game.player.getValue()
                        + " is your new hand value, you BUST");
                GameOver = true;

            }

            //NOT BUSTING
            if (game.player.getValue() <= 21 && GameOver == false) {
                System.out.println(game.player.getValue()
                        + " is your new hand value");

                dealerActions();
            }

        }
    }

    public void stayButtonAction() {


        dealerActions();
    }

    public void dealerActions() {

        if (game.dealer.getValue() < 17 && GameOver == false) {
            game.dealer.draw(game.deck);
            repaint();

            System.out.println("Dealer draws a "
                    + game.dealer.getHand().toString()
                    + "\nDealer's new hand value is "
                    + game.dealer);

            if (game.dealer.getValue() > 21) {

                JOptionPane.showMessageDialog(null, "Dealer busts, you win: " + betAmount);
                game.money += betAmount;
                score += betAmount;
                GameOver = true;
            }

        }//end if

        if (game.dealer.getValue() >= 17) {

            if (game.dealer.getValue() == game.player.getValue()) {
                System.out.println("Push");
                JOptionPane.showMessageDialog(null, "Push");
                GameOver = true;
            }


            if ((game.player.getValue() > game.dealer.getValue()) && GameOver == false) {
                System.out.println("You win the hand, you gain: " + betAmount);
                JOptionPane.showMessageDialog(null, "You win the hand, you gain: " + betAmount);
                game.money += betAmount;
                score += betAmount;
            }


            if ((game.player.getValue() < game.dealer.getValue()) && GameOver == false) {

                System.out.println("Dealer wins, you lose: " + betAmount);
                JOptionPane.showMessageDialog(null, "Dealer wins, you lose: " + betAmount);
                game.money -= betAmount;
                GameOver = true;
            }

            moneyLabel.setText("Money: " + (game.money));
            scoreLabel.setText("Score: " + score);

        }

    }

    public void nextButtonAction() {

        try {
            int currentMoney = game.money;
            game = new Blackjack();
            game.money = score + currentMoney;
            String message = JOptionPane.showInputDialog(null, "How much would you like to wager?");
            betAmount = Integer.parseInt(message);
            moneyLabel.setText("Money: " + (game.money - betAmount));

            GameOver = false;

            //set up game:
            game.player.draw(game.deck);
            game.player.draw(game.deck);

            game.dealer.draw(game.deck);
            game.dealer.draw(game.deck);

            repaint();

        } catch (Exception f) {
            System.out.println("error on play NEXT action");
        }
    }
}
