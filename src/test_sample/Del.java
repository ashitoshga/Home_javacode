package test_sample;

public class Del {
	String test = "AG";
	Del()
	{
		System.out.println("inside default Del constructor");
		// It will be called depending upon number of objects are created
	}
	Del ob;		//class object reference variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Del o1;				//reference variable
		new Del();			//new object of class
		o1 = new Del();		//accessing object via reference variable
		o1.test = "AshitoshGajare";
		System.out.println(o1.test);
		Del o2 = o1;		//here we are not creating new object 
		o2.test = "AshitoshEknathGajare";
		System.out.println(o2.test);
		Del o3 = new Del();
		o3.getDel("Tejaswi Bamane");
		
		

	}
	public void getDel(String st)
	{
		System.out.println("inside getDel method"+st);
		
	}
	public static void method1(String aa)
	{
		System.out.println(aa);
	}
	public void methodtest()
	{
		System.out.println("inside Del class using methodtest");
	}

}
