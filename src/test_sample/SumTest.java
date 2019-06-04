package test_sample;

public class SumTest {
	

	public static void main(String[] args) {
//		int a =5;			//passing primitive int datatype alongwith Intger gives u exception
//		Integer b =6;
//		SumTest ob = new SumTest();
//		
//		//ob.sum(a, b);	//Compile error, The method sum(int, int) is ambiguous for the type SumTest
//		
//	}
//	
//	public void sum(int a, int b)
//	{
//		System.out.println("inside primitive sum method");
//		//return a+b;
//	}
//	public void sum(Integer a, Integer b)
//	{
//		System.out.println("inside wrapper class Integer method");
//		//return a+b;
		
		String ar[] = {"1","2","3"};
		
		int a[] = new int[ar.length];
		
		//print odd numbers
		//int tmp=0, res[];
//		for(int z=0; z<ar.length; z++)
//		{
//			a[z] = Integer.parseInt(ar[z]); 
//			a[z] = Integer.valueOf(ar[z]);
//			//System.out.println("all number in given array"+a[z]);
//			if(a[z]%2!=0)
//			{
//				System.out.println("odd number in given array"+a[z]);
//			}
//		}
		for(String s:ar)
		{
			int i = Integer.parseInt(s);
			if(i%2==1)
			{
				System.out.println(i);
			}
			
		}
		
		
		
	}
	
	
	
}
