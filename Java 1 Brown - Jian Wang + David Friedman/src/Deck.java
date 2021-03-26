import java.util.Random;

public class Deck {
	private Card[] deck = new Card[52];
	public Deck() {
		String suit[] = {"Club","Spade","Heart","Diamond"};
		int countI=0;
		for(int i=0;i<4;i++) {
			for(int j=1;j<14;j++) {
				Card newCard = new Card (suit[i],j);
				deck[countI]=newCard;
				countI++;
			}
		}
	}
	public String toString() {
		String deckcheck = "";
		for(int i=0;i<deck.length;i++) {
			deckcheck+=deck[i].getSuit()+" "+deck[i].getPrint()+", ";
		}
		return deckcheck;
	}
	
	public Card getRandom() {
		Card newCard = deck[(int)(Math.floor((Math.random()*52+1)))];
		return newCard;
	}
	
	public Card[] getFirstN(int n) {
		Card[] firstN = new Card[n];
		for(int i=0;i<n;i++) {
			firstN[i]=deck[i];
		}
		return firstN;
	}
	
	public void shuffle() {
		for(int a=0; a<3; a++) {
			for (int i = 0; i < deck.length; i++) {
				int random = (int)(Math.floor((Math.random()*deck.length)));
				Card temp = deck[random];
				deck[random] = deck[i];
				deck[i] = temp;
			}
		}
	
	}
	
	public void sort() {
		String suit[] = {"Club","Spade","Heart","Diamond"};
		int countI=0;
		for(int i=1;i<14;i++) {
			for(int j=0;j<4;j++) {
				Card newCard = new Card (suit[j],i);
				deck[countI]=newCard;
				countI++;
			}
		}
	}
	
	public void display() {
		System.out.println(this);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create deck
		Deck myDeck = new Deck();
		System.out.println(myDeck);
		myDeck.shuffle();
		System.out.println(myDeck);
		myDeck.sort();
		System.out.println(myDeck);

	}

}
