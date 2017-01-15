import java.util.Scanner;

public class Blackjack {

    private static final String CLEAR_SCREEN =  "\033[2J";
    private static final String HIDE_CURSOR =  "\033[?25l";
    private static final String SHOW_CURSOR =  "\033[?25h";

    private Agent player;
    private Agent dealer;
    private Deck deck;
    private int money = 100;

    public Blackjack() {
	deck = new Deck();
        player = new Agent();
	dealer = new Agent();
	//this.money = 100;
    }

    public Blackjack(int money) {
	deck = new Deck();
	deck.shuffle();
        player = new Agent();
	dealer = new Agent();
	this.money = money;
    }
<<<<<<< HEAD
    
=======

    /*
    public void shuffle(Random r) {
	Card[] temp = deck.getDeck();
	Card a;
	Card b;
 	for (int i = 0; i < temp.length; i += 1) {
	    int j = r.nextInt(temp.length);
	    a = temp[i];
	    b = temp[j];
	    temp[i] = b;
	    temp[j] = a;
	}
	this.deck.setDeck(temp);
    }
    */



>>>>>>> 4f31207870bfbf5308d2c8c423583b254c4f68d0
    public static void main(String[] args) {
	
	System.out.println("\nWelcome to Blackjack");
	Blackjack game = new Blackjack();

	Scanner playerInput = new Scanner(System.in);

<<<<<<< HEAD
	while(game.money > 0){
      
	    game = new Blackjack(game.money);

	    int playerValue = 0;
	    boolean roundFinished = false;
	    System.out.println("\nCurrent funds: " + game.money + " \nHow much to wager?");

	    int bet = playerInput.nextInt();
	    if(bet > game.money){
		System.out.println("Cannot bet more than what you currently have");
		break;
	    }
	    
=======
  while(game.money > 0){

      game = new Blackjack(game.money);

      int playerValue = 0;
      boolean roundFinished = false;
      System.out.println("\nCurrent funds: " + game.money + " \nHow much to wager?");

      int bet = playerInput.nextInt();
      if(bet > game.money){
	  System.out.println("Cannot bet more than what you currently have");
	  break;
      }
>>>>>>> 4f31207870bfbf5308d2c8c423583b254c4f68d0
      //player gets two cards
	    game.player.draw(game.deck);
	    game.player.draw(game.deck);
	    System.out.println("\nYour cards are:\n" +
			       game.player.getHand()[0].toString() + "\n" +
			       game.player.getHand()[1].toString());
      //dealer gets two cards
	    game.dealer.draw(game.deck);
	    game.dealer.draw(game.deck);
	    System.out.println("The dealer shows:\n" +
			       game.dealer.getHand()[0].toString());

      //loop for action
<<<<<<< HEAD
	    while(true){
		if(game.dealer.getHand()[0].getValue() + game.dealer.getHand()[1].getValue() == 21){
		    System.out.println("Dealer has Blackjack");
		    game.money -= bet;
		    roundFinished = true;
		}
		System.out.println(game.player.getHand()[0].getValue() +
				   game.player.getHand()[1].getValue() +
				   " is your current hand value" );
		System.out.println("Press (0) to stay and (1) to hit");
		int hitOrStay = playerInput.nextInt();

       //Staying
		if(hitOrStay == 0){
		    System.out.println(game.player.getHand()[0].getValue() +
				       game.player.getHand()[1].getValue() +
				       " remains your hand value");
		    playerValue = game.player.getHand()[0].getValue() + game.player.getHand()[1].getValue();
		    break;
		}
		
       //HITTING
		if(hitOrStay == 1){
		    game.player.draw(game.deck);
		    System.out.println("\nYou have drawn a " +
				       game.player.getHand()[2].toString());
		    
       //BUSTING
		    if((game.player.getHand()[0].getValue() + game.player.getHand()[1].getValue()
			+ game.player.getHand()[2].getValue()) > 21) {
			System.out.println(game.player.getHand()[0].getValue() +
					   game.player.getHand()[1].getValue() +
					   game.player.getHand()[2].getValue() +
					   " is your new hand value, you BUST");
			roundFinished = true;
			game.money -= bet;
			break;
		    }
      
	//NOT BUSTING
		    if((game.player.getHand()[0].getValue() +
			game.player.getHand()[1].getValue() +
			game.player.getHand()[2].getValue()) <= 21) {
			System.out.println(game.player.getHand()[0].getValue() +
					   game.player.getHand()[1].getValue() +
					   game.player.getHand()[2].getValue() +
					   " is your new hand value");
		    }
		    playerValue = game.player.getHand()[0].getValue() +
			game.player.getHand()[1].getValue() +
			game.player.getHand()[2].getValue();
		}
		break;
	    }

	//DEALER ACTIONS
	    System.out.println("The dealer shows:\n" +
			       game.dealer.getHand()[0].toString() + "\n" +
			       game.dealer.getHand()[1].toString());
	    int dealerValue = game.dealer.getHand()[0].getValue() + game.dealer.getHand()[1].getValue();
	    int x = 2;
	    while(dealerValue < 17 && roundFinished == false){
		game.dealer.draw(game.deck);
		dealerValue += game.dealer.getHand()[x].getValue();
		System.out.println("Dealer draws a " +
				   game.dealer.getHand()[x].toString()
				   + "\nDealer's new hand value is " +
				   dealerValue);
		x += 1;
		if(dealerValue > 21){
		    roundFinished = true;
		    System.out.println("Dealer busts, you win: " + bet);
		    game.money += bet;
		}
	    }

	    //System.out.println("MONEY: " + game.money);
	    //System.out.println("BET: " + bet);
	    //System.out.println(d.size());
    
	    if(dealerValue == playerValue){
		System.out.println("Push");
		roundFinished = true;
	    }
	    
	    if((playerValue > dealerValue) && roundFinished == false){
		System.out.println("You win the hand, you gain: " + bet);
		game.money += bet;
	    }
	    
	    if((playerValue < dealerValue) && roundFinished == false){
		roundFinished = true;
		System.out.println("Dealer wins, you lose: " + bet);
		game.money -= bet;
	    }
=======
      while(true){
	  if(game.dealer.getHand()[0].getValue() + game.dealer.getHand()[1].getValue() == 21){

	      game.money -= bet;
        System.out.println("Dealer has Blackjack." + " You lose " + bet + ".");
	      roundFinished = true;
	  }

	  System.out.println(game.player.getHand()[0].getValue() + game.player.getHand()[1].getValue() + " is your current hand value" );


	  System.out.println("press (0) to stay and (1) to hit");
	  int hitOrStay = playerInput.nextInt();

//Staying
    if(hitOrStay == 0){
      System.out.println(game.player.getHand()[0].getValue() + game.player.getHand()[1].getValue()
      + " remains your hand value");
      playerValue = game.player.getHand()[0].getValue() + game.player.getHand()[1].getValue();
      break;
    }

//HITTING
    if(hitOrStay == 1){
      game.player.draw(d);
      System.out.println("\nYou have drawn a " + game.player.getHand()[2].toString());

      //BUSTING
      if((game.player.getHand()[0].getValue() + game.player.getHand()[1].getValue()
      + game.player.getHand()[2].getValue()) > 21) {
          System.out.println(
          + game.player.getHand()[0].getValue() + game.player.getHand()[1].getValue()
          + game.player.getHand()[2].getValue() + " is your new hand value, you BUST");
	  roundFinished = true;
          game.money -= bet;
          break;
      }

      //NOT BUSTING
      if((game.player.getHand()[0].getValue() + game.player.getHand()[1].getValue()
      + game.player.getHand()[2].getValue()) <= 21) {
        System.out.println(game.player.getHand()[0].getValue() + game.player.getHand()[1].getValue()
        + game.player.getHand()[2].getValue() + " is your new hand value");
      }
      playerValue = game.player.getHand()[0].getValue() + game.player.getHand()[1].getValue()
      + game.player.getHand()[2].getValue();
    }
    break;
  }

//DEALER ACTIONS
    System.out.println("The dealer shows:\n" + game.dealer.getHand()[0].toString()
    + "\n" + game.dealer.getHand()[1].toString());

    int dealerValue = game.dealer.getHand()[0].getValue() + game.dealer.getHand()[1].getValue();
    int x = 2;
    while(dealerValue < 17 && roundFinished == false){
      game.dealer.draw(d);
      dealerValue += game.dealer.getHand()[x].getValue();
      System.out.println("Dealer draws a " + game.dealer.getHand()[x].toString()
      + "\nDealer's new hand value is " + dealerValue);
      x += 1;
      if(dealerValue > 21){
        roundFinished = true;
        System.out.println("Dealer busts, you win: " + bet);
        game.money += bet;
      }
    }

    //System.out.println("MONEY: " + game.money);
    //System.out.println("BET: " + bet);

    if(dealerValue == playerValue){
      System.out.println("Push");
      roundFinished = true;
    }

    if((playerValue > dealerValue) && roundFinished == false){
      System.out.println("You win the hand, you gain: " + bet);
      game.money += bet;
    }

    if((playerValue < dealerValue) && roundFinished == false){
      roundFinished = true;
      System.out.println("Dealer wins, you lose: " + bet);
      game.money -= bet;
    }

    }
>>>>>>> 4f31207870bfbf5308d2c8c423583b254c4f68d0

	}

    }

}
