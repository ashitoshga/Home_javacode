package test_sample2;

import test_sample.Sample;

public class TestobjAbstractTest extends Sample {
	
		
	public static void main(String[] args) {
		objAbstractTest oj = new objAbstractTest();
//		sample=250;
//		System.out.println(sample);
//		objAbstractTest ob = new objAbstractTest();
//		ob.ab1();
//		ob.ab2();
//		ob.ab3();
		
		
		int a,b;
		//1. pass by value
		a=1; 
		b=2;
		int z = oj.swapByvalue(a,b);
		System.out.println(z);
		
		//2. pass by reference
		oj.a=100;
		oj.b=200;
		oj.swapByRef(oj);
		System.out.println("after swap"+' '+"value of a is"+oj.a+' '+"& value of b is"+oj.b);
	}
	public void test()
	{
		//sample=90;
	}


}
