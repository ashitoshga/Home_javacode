package test_sample2;

public class ObjTest {
	
		int a;
		

	public static void main(String[] args) {
		
		ObjTest obj = new ObjTest();
		ObjTest obj2;
		
		obj.a = 100;
		obj.m3();
		obj.m1(12);
		//obj.m2(11);
		
		//ObjTest obj1 = new ObjTest();
		
		
		
	

	}
	
	
	public void m1(int a)
	{
		this.a = a;
		System.out.println(a);
	}
	public void m2(int b)
	{
		this.a = b;
		System.out.println(a);
	}
	public void m3()
	{
		this.a = a;
		System.out.println(a);
	}
	

}
