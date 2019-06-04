package test_sample2;

public class Blocks {
	int z = 200;
	Integer ab = 9;
	int u = ab;
	int g = ab.intValue();
	
	private void sys() {
		// TODO Auto-generated method stub

	}
	public Blocks()
	{
		System.err.println(g);
//		System.out.println(b);
//		System.out.println(a);
		 z = 100;
		//System.out.println(z);
		
	}
	
	int a;
	//non-static block
	{
		//int a = 20;//variable 'a' not accessible
		//if we create and initilize any variable inside block then it will not accessible
		//variable 'a' not accessible outside non-static block even in constructor
		a = 10; 
	}
	static int b;
	static 
	{
		b = 50;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Blocks ob = new Blocks();
	/*	System.out.println(ob.a);
		System.out.println(Blocks.b);*/
		System.out.println(ob.z);
	}

}
