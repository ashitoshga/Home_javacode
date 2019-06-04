package test_sample2;
//include pass by value & pass by reference object methods

public class objAbstractTest extends AbstractTest {
	
	int a,b;

	public static void main(String[] args) {
		objAbstractTest o = new objAbstractTest();
		o.ab1();	
		}	
	public void ab1() {
		System.out.println("objAbstractTest ab1 method");		
	}	
	public void ab2() {
		System.out.println("objAbstractTest ab2 method");		
	}
	public int swapByvalue(int x, int y)
	{
		int temp = x;
		x = y;
		y = temp;
		return x;
	}
	public objAbstractTest swapByRef(objAbstractTest obj)
	{
		int temp2 = obj.a;
		obj.a = obj.b;
		obj.b = temp2;
		return obj;
	}
}
