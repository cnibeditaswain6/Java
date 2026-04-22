class Test3 
{
	int x = 10; //Non Static variable
	public static void main(String[] args) 
	{
		// 1st way to print with object creation
		Test3 t = new Test3();
		System.out.println(t.x);
		
		// 2nd way to print with object creation.
		System.out.println(new Test3().x);
	}
}
