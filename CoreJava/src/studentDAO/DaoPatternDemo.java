package studentDAO;
import java.util.Scanner;

public class DaoPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentDAOimpl studentimpl = new StudentDAOimpl();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the roll no:");
		int rno = input.nextInt();
		Student studentimpl.getStudent(rno);
		boolean flag = false;

	}

}
