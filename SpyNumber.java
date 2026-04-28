//Wap to check wheather a number is a spy number or not. ------> while loop
import java.util.Scanner;
class SpyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		
		int rem = 0;
		int sum = 0;
		int product = 1;
		
		while (num > 0)
		{
			rem = num % 10;
			sum = sum + rem;
			product = product * rem;
			num = num / 10;
		}
		System.out.println(sum == product ?"Spy Number" :"Not a Spy Number");
	}
}
