package homeWork_Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class TicTacToe {
	
	public static void print(String[][] arr) {
		for (int i = 0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
		
	}
	
	public static boolean iswinner(String[][] arr) {
		
		//Check for the rows for the winner
		for(int i = 0;i<3;i++) {
			int j = 0;
			if (arr[i][j]== arr[i][j+1] &&
					arr[i][j+1] == arr[i][j+2]) {
				if (arr[i][j] == "X") {
					System.out.println("Player1 is the winner");
					return true;
				} else if (arr[i][j] == "O"){
					System.out.println("Player2 is the winner");
					return true;
				}
			}
		}
		
		//Check the columns for the winner
		for(int j=0;j<3;j++) {
			int i = 0;
			if (arr[i][j] == arr[i+1][j] &&
					arr[i+1][j] == arr[i+2][j]) {
				if (arr[i][j]=="X") {
					System.out.println("Player1 is the winner");
					return true;
				}else if(arr[i][j] == "O") {
					System.out.println("Player2 is the winner");
					return true;
				}
			}
				
		}
		
		//Check the diagonals for the winner
		if ((arr[0][0] ==arr[1][1]&&
				arr[1][1] == arr[2][2]) ||
				(arr[0][2] == arr[1][1] && 
				arr[2][0] == arr[1][1])){
			if (arr[0][0] == "X") {
				System.out.println("Player1 is the winner");
				return true;
			}else if (arr[0][0] == "O") {
				System.out.println("Player2 is the winner");
				return true;
			}else if (arr[0][2] == "X") {
				System.out.println("Player1 is the winner");
				return true;
				}else if (arr[0][2] == "O") {
				System.out.println("Player2 is the winner");
				return true;
				}
			
		}
			
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] tictacarr = new String[3][3];
		
		for (int i=0;i<3;i++) {
			for(int j = 0;j<3;j++) {
				tictacarr[i][j] = "1";
				
			}
		}
		
		for (int i = 0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(tictacarr[i][j]+" ");
			}
			System.out.println("");
		}
		
		Scanner input = new Scanner(System.in);
		//int k = 0;
		for(int k = 1;k<=9;k++) {
			if(k%2 !=0) {
		System.out.println("Player1: Enter your move");
		String m1 = input.next();
		//System.out.println(m1.substring(0,1));
		int rows = Integer.parseInt(m1.substring(0,1));
		int cols = Integer.parseInt(m1.substring(1,2));
		tictacarr[rows-1][cols-1] = "X";
		
		//System.out.println(Arrays.deepToString(tictacarr));
		//Update the board with the move
		print(tictacarr);
		
		//Calculate the winner after the fifth move
		if(k>=5) {
			if (iswinner(tictacarr)== true) {
				break;
			}
		}
			if ((k==9) && iswinner(tictacarr) == false) {
				System.out.println("Game is a draw");
				
		}
			
			}else {
		System.out.println("Player2: Enter your move");
		String m2 = input.next();
		int rows2 = Integer.parseInt(m2.substring(0,1));
		int cols2 = Integer.parseInt(m2.substring(1,2));
		tictacarr[rows2-1][cols2-1] = "O";
		
		//System.out.println(Arrays.deepToString(tictacarr));
		print(tictacarr);
		
		if(k>=5) {
			if(iswinner(tictacarr) == true) {
				break;
			}
		}
			if ((k==9) && iswinner(tictacarr) == false) {
				System.out.println("Game is a draw");
				
		}
			
			}
		}
		
	}

}
