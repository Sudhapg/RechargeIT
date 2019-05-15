package homeWork_Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class bookingFlightTicketswithMethods {
	
	public static String[][] flightseats(){
		String[][] seats = new String[26][10];
		for (int i=0;i<26;i++) {
			for(int j=0;j<10;j++) {
				char x = (char)(i+65);
				int y = j+1;
				seats[i][j] = Character.toString(x)+Integer.toString(y);
			}
		}
		return seats;
	}

	public static String[] aisleseatslist(String[][] seats) {
		String[] aisleSeats = new String[104];
		int z = 0;
		System.out.println("Seats Array is:"+Arrays.deepToString(seats));
		for(int i=0;i<26;i++) {
			
			for(int j=0;j<10;j++) {
				if (j==2 || j==3 ||j==6 || j==7) {
					
					aisleSeats[z]=seats[i][j];
					z++;
				}
			}
		}
		System.out.println(Arrays.toString(aisleSeats));
		return aisleSeats;
		
	}
	
	//Method to update the seats array with the booked status for the tickets
	//that are already booked
	public static String[][] updateseatsarray(String[] bookedSeats,String[][] seats){
		for (int k=0;k<bookedSeats.length;k++) {
			String temp = bookedSeats[k];
			//System.out.println("temp is:"+temp);
			
			for(int i=0;i<26;i++) {
				for(int j=0;j<10;j++) {
					if(seats[i][j].equals(temp)) { //Comparing two strings
						seats[i][j] = "Booked";
					}
				}
			}
		}
		return seats;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int numberOfFamilies = 0;
		int aislecount = 0;
		String seats[][] = flightseats();
		
		String[] aisleSeats = aisleseatslist(seats);
		Scanner input = new Scanner(System.in);
		//Read the input from the user for the seats that are already booked
		System.out.println("Enter the seats booked:");
		String seatNo = input.next();
		//Add the booked seats to an array
		String[] bookedSeats = seatNo.split(",");
		seats = updateseatsarray(bookedSeats,seats);
			
		for(int i=0;i<26;i++) {
			for(int j=0;j<10;j++) {
				//Checking if the seat is of booked status
				if (seats[i][j]!= "Booked") { 
					count++; //Increment the count for the available seats
					
					//looping through the aisleseats array to check if the 
					//available seat belongs to aisleseat
					for(int aisleloop =0;aisleloop<104;aisleloop++) {
						if(aisleSeats[aisleloop].equals(seats[i][j])) {
						aislecount++;//incrementing the aislecount if it is an aisleseat
						}
					}
					
					//If there are 3 consecutive available seats
					//check how many seats belong to aisle category
					if (count == 3){
						if(aislecount<2) {
						//aislecount=0;
						//Increment the numberofFamilies if the aislecount is less than 2
						numberOfFamilies++;
						aislecount=0;//reset the aislecount to 0
						count = 0;//reset the available seats count to 0
						//System.out.println("The number of families that can be accomodated:"+numberOfFamilies);
						
						}//Closing the aislecount if statement
						else if(aislecount == 2){//check if the aislecount is equal to 2
							aislecount--; // Decrement the aislecount by 1
							count--; // Decrement the available seats count by 1
						}
					}					
				} else if (seats[i][j].equals("Booked")) {
					if ((j==2)||(j==3)||(j==6)||(j==7)) {
						aislecount++;
					}
				}
								
				}
				
			}
			
			System.out.println("No of families that can be accomodated:"+numberOfFamilies);
	

	}//this is closing the main method

}//This is closing the class
