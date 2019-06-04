package test_sample2;

public class C {	
	
	public static void TestPrint(A obj1)
	{
		obj1.print();
	}
	public static void main(String[] args) {
		A o1 = new A();
		A o2 = new B();
		B o3 = new B();
		TestPrint(o1);
		TestPrint(o2);
		TestPrint(o3);
		

	}

}
