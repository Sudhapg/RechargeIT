package day10Java;
import java.util.Scanner;
import java.util.Arrays;

public class Slide42_DeckOfCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] deck = new int[52];
		String flag = "";
		for (int i=0;i<deck.length;i++) {
			deck[i]= i;
		}
		
		System.out.println("The original cards:"+Arrays.toString(deck));
		
		for (int i=deck.length-1;i>0;i--) {
			int j = (int)(Math.random()*(i+1));
			int temp = deck[i];
		deck[i] = deck[j];
			deck[j] = temp;
		}
		System.out.println("The shuffled cards:"+Arrays.toString(deck));
			
		for(int i=0;i<=3;i++) {
			int x = deck[i]/13;//This gives the type of the card
			int y = (deck[i]%13)+1; // This gives the value of the card
			if (x==0) {
				flag = "Spades";
			}else if(x==1) {
				flag = "Hearts";
		}else if(x==2) {
			flag = "Diamonds";
		}else if(x==3) {
			flag = "Clubs";
		}
			if(y==1) {
				System.out.println("The card you picked is :"+"Ace of type"+flag);
			}else if(y==11) {
				System.out.println("The card you picked is:"+"Jack of type"+flag);
			}else if(y==12) {
				System.out.println("The card you picked is:"+"Queen of type"+flag);
			}else if(y==13) {
				System.out.println("The card you picked is:"+"King of type"+flag);
			}else {
			System.out.println("The card you picked is:"+y+" "+"of type "+flag);
		}
		}
						
	}

}
