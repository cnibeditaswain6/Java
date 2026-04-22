class Test4 
{
	static int x = 20;//Static Variable
	public static void main(String[] args) 
	{
		Test4 t1 = new Test4();
		Test4 t2 = new Test4();
		
		System.out.println(t1.x);
		System.out.println(t2.x);
		
		t1.x = 33;//Updation
		
		System.out.println(t1.x);
		System.out.println(t2.x);//There is only one copy of static variable that will be shared with each and every object.
	}
}
