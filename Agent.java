public class Agent {

    int money;
    Card[] hand;
    int count;
    int value;

    public Agent() {
	this.hand = new Card[52];
	this.count = 0;
	this.value = 0;
	//this.money = 100;
    }

    public int getCount() {
	return this.count;
    }

    public int getMoney() {
	return this.money;
    }
    
    public void setMoney(int money){
	this.money = money;
    }
    
    public int getValue() {
	value = 0;
	for (int i = 0; i < this.count; i += 1) {
	    value += hand[i].getValue();
	}
	return this.value;
    }

    public Card[] getHand() {
	return this.hand;
    }

    public void draw(Deck deck) {
        hand[count] = deck.draw();
	count += 1;
    }

    public String toString() {
	String tempString = "";
	for (int i = 0; i < this.count; i += 1) tempString += "\n" + this.hand[i];
	return tempString;
    }

}
