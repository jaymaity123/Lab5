package ex1;
import java.util.Scanner;
public class MainRunner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age of person=");
		int age = sc.nextInt();
		try {
			if(age<15)
			{
				throw new InvalidInputException("Exception");
			}
			System.out.println("Entered age is valid");
		}
		catch(InvalidInputException e)
		{
			System.out.println("Caught exception- Plz enter age greater than 15");
		}
	}

}
