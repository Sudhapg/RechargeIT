package homeWork_Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class Flightticketsnewcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[][] seats = new String[26][10];
		
		for (int i=0;i<26;i++) {
			for(int j=0;j<10;j++) {
				char x = (char)(i+65);
				int y = j+1;
				seats[i][j] = Character.toString(x)+Integer.toString(y);
			}
		}
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
		System.out.println("Aisle seats are:"+Arrays.toString(aisleSeats));
		//System.out.println("Please enter the number of booked seats");
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the seats booked:");
		String seatNo = input.next();
		
		String[] bookedSeats = seatNo.split(",");
		System.out.println("The bookedSeats array is:"+Arrays.toString(bookedSeats));
		
		/*for (int k=0;k<bookedSeats.length;k++) {
			String temp = bookedSeats[k];
			System.out.println("temp is:"+temp);
			
			for(int i=0;i<26;i++) {
				for(int j=0;j<10;j++) {
					//System.out.println("first element is:"+seats[i][j]);
					if(seats[i][j].equals(temp)) { //Comparing two strings
						seats[i][j] = "Booked";
					}
				}
			}
		}*/
		int count = 0;
		int numberOfFamilies = 0;
		int aislecount = 0;
		int flag = 0;
		for(int i=0;i<26;i++) {
			for(int j=0;j<10;j++) {
				if (j==0) { 
					System.out.println("count before entering"+i+"row:"+count);
					System.out.println("total tickets so far:"+numberOfFamilies);
				}
				
				for(int k=0;k<bookedSeats.length;k++) {
					if (seats[i][j].equals(bookedSeats[k])) {
						 flag = 1;
						 System.out.println("booked seat no:"+seats[i][j]);
						 System.out.println("Flag value:"+flag);
					}else {flag = 0;}
				}
				
				//for (int k = 0;k<bookedSeats.length;k++) {
				//if (seats[i][j].equals("Booked")) {
				    if(flag==1) {
				    	System.out.println("inside flag loop");
					System.out.println("Seat No:"+seats[i][j]);
					for(int aisleloop =0;aisleloop<104;aisleloop++) {
					//System.out.println("inside aisleloop");
					if(aisleSeats[aisleloop].equals(seats[i][j])) {
						//System.out.println("inside if");
						aislecount++;
						System.out.println("Aislecount:"+aislecount);
						//System.out.println("count:"+count);
					}
					
				}
				} 
				//if (seats[i][j]!= "Booked") {
				    if(flag == 0) {
					//System.out.println("count before Hello:"+count);
					//System.out.println("Hello");
					System.out.println("Seat No:"+seats[i][j]);
					count++;
					System.out.println("count is:"+count);
					System.out.println("aislecount is:"+aislecount);
					//System.out.println("count after Hello:"+count);
					for(int aisleloop =0;aisleloop<104;aisleloop++) {
						//System.out.println("inside aisleloop");
						if(aisleSeats[aisleloop].equals(seats[i][j])) {
							//System.out.println("inside if");
							aislecount++;
							//System.out.println("Aislecount:"+aislecount);
							//System.out.println("count:"+count);
						}
						
					}
					
					if (count == 3){
						if(aislecount<2) {
						//aislecount=0;
						//System.out.println("inside last if");
						numberOfFamilies++;
						aislecount=0;
						count = 0;
						//System.out.println("No of tickets available:"+numberOfFamilies);
						//System.out.println("Seats available are:"+ 
						//seats[i][j]+" "+seats[i][j-1]+" "+seats[i][j-2]);
						}else if(aislecount == 2){
							//System.out.println("Inside aislecount is 2 loop");
							aislecount--;
							count--;
						}
			
					}					
				}
				}
				/*else {
					count--;
					}*/
				
				}
				
			
			
			System.out.println("No of tickets available:"+numberOfFamilies);
			

	}

}
