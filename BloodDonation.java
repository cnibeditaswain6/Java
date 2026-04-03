//Question-Nested if-else
import java.util.Scanner;
class BloodDonation
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Age : ");
		int age = sc.nextInt();
		
		System.out.println("Enter Weight : ");
		double weight = sc.nextDouble();
		
		if (age >= 18)
		{
			if (weight >= 50)
			{
				System.out.println("eligible to donate blood");
			}
			else
			{
				System.out.println("not eligible(weight is less than 50kg)");
		    }
		}
		else
		{
			System.out.println("not eligible(age is less than 18)");
		}
	}
}
