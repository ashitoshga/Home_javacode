package test_sample;

public class ClassInterfaceTest implements I1, I2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassInterfaceTest obj = new ClassInterfaceTest();
		obj.show();
		
		//System.out.println(obj.methodI1_2("1234"));
//		obj.m1();
//		I1 obj_i = new ClassInterfaceTest(); //calling method from Interface I1
//		obj_i.show();
		//obj.show();
	}
	public void show()
	{
		System.out.println("inside show method from class");
	}
	public void m2()
	{
		System.out.println("inside method m2 from Class");
	}
	public void m1()
	{
		System.out.println("inside method m1 from Class");
	}
//	public void methodI1_1()
//	{
//		System.out.println("inside classinterfacetest methodI1_1 with no param");
//	}
//	public int methodI1_2(String k)
//	{
//		System.out.println("inside classinterfacetest methodI1_1 with one parameters");
//		int test = Integer.parseInt(k);
//		return test;
//	}
	//method overloading....
//	public int methodI1_2(String k, String y)
//	{
//		System.out.println("inside classinterfacetest methodI1_1 with two parameters");
//		int test = Integer.parseInt(k);
//		return test;
//	}
//	@Override
//	public void methodI2_1() {
//		// TODO Auto-generated method stub
//		
//	}
//	@Override
//	public int methodI2_2() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//	@Override
//	public void m1() {
//		// TODO Auto-generated method stub
//		
//	}
	@Override
	public void I1show() {
		// TODO Auto-generated method stub
		
	}


}
