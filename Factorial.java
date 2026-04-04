//WAP to display the factorial of a number. ------>while loop
import java.util.Scanner;
class Factorial 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		
		int factorial = 1;
		
		while (num != 0)
		{
			factorial = factorial * num;
			num--;
		}
		System.out.println("Factorial of the number is : " + factorial);
	}
}
