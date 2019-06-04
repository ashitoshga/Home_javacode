package test_sample;

public interface I2 extends I1{
	
	//int method_1(String t);
//	void methodI1_1();
//	void methodI2_1();
//	int methodI2_2();
	void m1();
	default void show()
	{
		System.out.println("default method from interface I2");
	}
}
