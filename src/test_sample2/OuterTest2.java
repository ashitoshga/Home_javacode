package test_sample2;

import test_sample.Outer;



public class OuterTest2  extends Outer{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outer o = new Outer();
		OuterTest2 oo = new OuterTest2();
		oo.Outermethod();
		
//above protected method of parent class is accessed via inheritance outside of package
		
	
		

	}

}
