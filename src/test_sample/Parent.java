package test_sample;

public class Parent {
	public int mainvar = 2019;
	static String statvar = "static string from Parent Class";
	
	    int x = 1;// Class Variable/Non-Static Variable/Instance Variable
	 private int xx = 11;//Private Non-Static Variable
	 // private variable can only be accessed using Getter/Setter method
	 
	 public int getXx() {
		return xx;
	}
	public void setXx(int xx) {
		//x=10;
		this.xx = xx;
	}
	protected int xxx = 111;
	 
	 
	 final static int y = 2;// Static Variable
	 public static int yy = 22;// Static Variable
	 private static int yyy;// Private Static Variable
	 
	 
	
	public static int getYyy() {
		return yyy;
	}
	public static void setYyy(int yyy) {
		
		Parent.yyy = yyy;
	}
	//OR
	/*public static void setYyy(int ashu) {
		//Parent.yyy = yyy;
		yyy=ashu;
		
	}*/
	//OR
	//can not use this keyword when static variable/method is referred
	/*public static void setYyy(int yyy) {
		//Parent.yyy = yyy;
		this.yyy=yyy		
	}*/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variables
		 
		int a =12;// Local Variable
		Parent p = new Parent();
		//System.out.println(x);
		System.out.println(p.x);
		System.out.println(y);
		System.out.println(a);
	}
	public void parentmethod(){
//		int b = 20;// Local Variable
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(b);
		System.out.println("parentmethod from Parent class");
	}
	private void parentmethod2(){
		System.out.println("This is private method from ParentClass");
	}
	
	 void method1()
	{
		System.out.println("Parent method1");
	}
	
	
	
	
	
	
	
	
	
	
}
