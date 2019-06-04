package test_sample;

public class Child extends Parent{
	String test;
	static int xyz;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	y=44;
		System.out.println(y);
	//	System.out.println(yyy);
		
		Parent p = new Parent();
		p.parentmethod();
		
	//	p.setYyy(111);
		Child c = new Child();
		c.parentmethod();
		c.variabletest();
		
		Parent opc = new Child();
		opc.parentmethod();
		
//		c.variabletest();
//		//p.parentmethod();
//		p.x =15;
//		Parent pp1 = new Child();
//		pp1.x=16;
//		System.out.println(pp1.x);
//		System.out.println(pp1.xxx);
//		System.out.println(p.x);
//	//	p.y=55;
//		//y=44;
//		System.out.println(p.y);
//	//	c.y=500;
//		System.out.println(c.y);
//		
//		System.out.println(y);
//	//	Parent.y=400;
//		System.out.println(Parent.y);
//			
	}
	public void variabletest(){
		// x = 10;
	//	 y = 200;// Static Variable/Class variable
		System.out.println("value of var is"+ ' '+x);
		
		System.out.println("value of var is"+ ' '+y);
		//System.out.println("value of class var is"+ ' '+b);
		System.out.println("variabletest from Child class");
	}
	public String parentmethod(String ss)
	{
		System.out.println("overloaded ovreridden parentmethod from child class");
		return ss;
	}
	public void parentmethod()
	{
		System.out.println("overridden parentmethod from child class");
	}
	 void method1()
	{
		//super.method1();
		System.out.println("child overridden method1");
	}
}
