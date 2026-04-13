//Write a program to chaeck wheather a number is a neon number or not.-------> while loop
import java.util.Scanner;
class NeonNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		
		int square = num * num;
		int sum = 0;
		int rem = 0;
		
		while (square > 0)
		{
			rem = square % 10;
			sum = sum + rem;
			square = square / 10;
		}
		System.out.println(sum == num ?"Neon Number" :"Not a Neon Number");
	}
}
