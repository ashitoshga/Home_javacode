package test_sample;

public class Del2 extends Del {

	public static void main(String[] args) {
		System.out.println(1 * 6 + "aa");
		
		System.out.println("aa" + 1*2);
		// TODO Auto-generated method stub
		
		Del o1 = new Del();
		o1.method1("Ashitosh");
		method1();
		o1.methodtest();
		System.out.println();
		
		Del2 o2 = new Del2();
		o2.methodtest(122);
		System.out.println();
		
		Del o3 = new Del2();
		o3.methodtest();
		o3.method1("aaaa");
	}
	
	public static void method1()
	{
		System.out.println("Gajare");
	}
	public static void method1(int b)
	{
		System.out.println(b);
	}
	//method overriding...
	public int methodtest(int a)
	{
		System.out.println("inside Del2 class using methodtest"+a);
		return a;
	}
}
