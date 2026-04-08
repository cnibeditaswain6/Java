import java.util.Scanner;
class ScanCalculator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 1st Number : ");
		int x = sc.nextInt();
		
		System.out.println("Enter the 2nd Number : ");
		int y = sc.nextInt();
		
		int sum = x + y;
		System.out.println("Result = " + sum);
	}
}
