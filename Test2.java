class Test2
{
	static int x = 10; //Static Varibale
	public static void main(String[] args) 
	{
		System.out.println(x);
		System.out.println(Test2.x);
		System.out.println(new Test2().x);
	}
}
