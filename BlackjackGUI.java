package mainPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BlackjackGUI extends JFrame {




    public BlackjackPanel panel = new BlackjackPanel();

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

    public static void main(String[] args) {
        BlackjackGUI b = new BlackjackGUI();
        b.setVisible(true);
    }

}
