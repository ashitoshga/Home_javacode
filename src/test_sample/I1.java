package test_sample;

public interface I1 {
	
//	public void methodI1_1();
//	int methodI1_2(String v);
	void m1();
	static void m2() {
	}
	default void show()
	{
		System.out.println("default method from interface I1");
	}
	void I1show();

}
