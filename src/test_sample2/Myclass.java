package test_sample2;

public class Myclass {
	
	int x,y;
	Myclass()
	{
		System.out.println("default constructor");
	}
	Myclass(int a, int b)
	{		
		this.x = a; 
		this.y = b;
		System.out.println("param constructor");
//		int temp = this.x;
//		this.x = this.y;
//		this.y = temp;
////		
	}
	public Myclass objmethod(Myclass my)
	{
		Myclass tmp = new Myclass();
		
		return tmp;
	}
	public Myclass swap(int x, int y)
	{
		Myclass o = new Myclass();
		int temp = x;
			x=y;
			y=x;
			this.x = x;
			this.y = y;			
			return o;
	}
	

	

}
