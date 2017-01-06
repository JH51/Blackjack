import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;



public class BlackjackGUI extends JFrame{

  private Container pane;

  public BlackjackGUI() {
    this.setTitle("Vim City Blackjack Casino");
    this.setSize(750, 500);
    this.setLocation(100,100);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);


  pane = this.getContentPane();
  pane.setBackground(Color.green);
  pane.setLayout(new FlowLayout());
  JButton b = new JButton("Hit");
  JButton b1 = new JButton("Stay");
  JButton b2 = new JButton("Next Hand");


  pane.add(b);
  pane.add(b1);
  pane.add(b2);


}
  public static void main(String[] args) {
    BlackjackGUI tester = new BlackjackGUI();
    tester.setVisible(true);
  }

}
