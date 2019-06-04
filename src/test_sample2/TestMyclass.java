package test_sample2;

public class TestMyclass {
		int i,j;

	public static void main(String[] args) {
		int a=1,b=2;
		Myclass obj = new Myclass(a,b);
		
		obj.swap(a,b);
		System.out.println(obj.x);//returning swapped values from method
		Myclass obj1 = new Myclass();
		obj1.objmethod(obj);
	}

}
