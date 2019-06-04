package test_sample;

public class OuterClassTest extends Outer {
	

	public static void main(String[] args) {
		
		x = 200;
		
		Outer o = new Outer();
		o.Outermethod();
		o.Outermethod2();
		OuterClassTest obj = new OuterClassTest();
		obj.Outermethod();
		obj.Outermethod2();
		
	
	}

}
