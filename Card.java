
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//package mainPackage;


public class Card {

    private char name;
    private String name2;
    private int value;
    private Suit suit;
    private boolean hidden;
    public String img;

    public Card(char name, Suit suit) {
	this.suit = suit;
	this.hidden = false;
	this.name = name;
	if (name == 'A') {
	    this.name2 = "ace";
	    this.value = 11;
	}
	if (name >= '2' && name <= '9') {
	    this.name2 = name + "";
	    this.value = name - '0';
	}
	if (name == '0') {
	    this.name2 = "10";
	    this.value = 10;
	}
	if (name == 'J') {
	    this.name2 = "jack";
	    this.value = 10;
	}
	if (name == 'Q') {
	    this.name2 = "queen";
	    this.value = 10;
	}
	if (name == 'K') {
	    this.name2 = "king";
	    this.value = 10;
	}
	if (!hidden) this.img =  this.name2 + "_of_" + this.suit.toString() + ".png";
	else this.img = "img/hidden.png";
    }

    public Card(int value, Suit suit) {
	this.value = value;
	this.suit = suit;
    }

    public int getValue() {
	return this.value;
    }

    public Suit getSuit() {
	return this.suit;
    }

    public void setHidden(boolean b) {
	this.hidden = b;
    }

    public String toString() {

	return this.name2 + " of " + this.suit.toString();
    }

    public JLabel toImage() {
	ImageIcon imageIcon1 = new ImageIcon("img/" + this.img);
	Image image1 = imageIcon1.getImage();
	Image newImage1 = image1.getScaledInstance(120, 180, java.awt.Image.SCALE_SMOOTH);
	imageIcon1 = new ImageIcon(newImage1);
	JLabel l1 =  new JLabel(imageIcon1);
	return l1;
    }

}
