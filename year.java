package Java;
import java.util.Scanner;
public class year {
	public static void main(String[] args) {
		System.out.println("Check The Leap Year");
		
		Scanner sc= new Scanner(System.in);   
		System.out.print("Enter a Year:");  
		int year=sc.nextInt(); 
		
		int x = year % 4;
		int y = year % 100;
		int z= year % 400;
		if (x == 0 && y != 0 && z != 0) {
			System.out.println("Given year is Leap Year:"+year);
		}
		else {
			System.out.println("Given year is not a Leap Year:"+year);
		}
	}
}

