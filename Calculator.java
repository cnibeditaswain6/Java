class Calculator 
{
	public static void main(String[] args) 
	{
		int a = 2;
		int b = 3;
		char ch = '+';
		if(ch == '+')
		{
			System.out.println(a + b);
		}
		else if (ch == '-')
		{
			System.out.println(a - b);
		}
		else if (ch == '*')
		{
			System.out.println(a * b);
		}
		else if (ch == '/')
		{
			System.out.println(a / b);
		}
		else if (ch == '%')
		{
			System.out.println(a % b);
		}
		else
		{
			System.out.println("Error");
		}
	}
}
