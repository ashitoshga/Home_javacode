package test_sample;

public class Outer {
	
	static int x = 100;
	String s = "test";
	
	protected String s1 = "Ashu_teja";
	public class Inner{
		
		public void Innermethod()
		{
			System.out.println("Innermethod from InnerClass");
		}
		
		 
		
	}
	protected void Outermethod()
	//method not available outside of package through inheritance
	//check OuterTest2 class implenting this method
	{
		System.out.println("protected Outermethod from Outer");
	}
	void Outermethod2()			
	//method not available outside of package even through inheritance
	{
		System.out.println("default Outermethod from Outer");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
