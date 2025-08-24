package BH_Intern_Task1;
import java.util.Scanner;

public class Task1 {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the input");
			int num=sc.nextInt();
			
			if(num%2==0) {
				System.out.println("Given num is even number");
			}
			else {
				System.out.println("Given num is odd number");

			}
			sc.close();			
		}

}
