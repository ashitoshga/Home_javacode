package test_sample;

public class RecursiveMethods {
	///To have a recursive method it is very IMP to set a BreakPoint otherwise it will go into infinite loop
	///It will give 'StackOverflowError' if breakpoint is not defined
	
	//static String abc = "Ashitosh";
	static String xyz = "Gajare";

	public static void main(String[] args) {
		
		//System.out.println(abc.val);
		// TODO Auto-generated method stub
		//System.out.println(Factorial(4));;
		System.out.println(ReverseString("Tejaswi"));
	}
	
	
	/*public static int Factorial(int a)
	{
		if(a<1)
		{
			return 1;//breaking condition
		}
		int temp = a*(Factorial(a-1));
		return temp;
		
	}*/
	
	public static String ReverseString(String abc)
	{
		//System.out.println(abc.length());
		if((abc.length()<=1) || (abc== null))
		{
			//System.out.println(abc);
			return abc;
		}
		String temp1 = ReverseString(abc.substring(1))+abc.charAt(0);
		//make sure output of ReverseString(abc.substring(1)) should be appended to abc.charAt(0)
		//System.out.println(temp1);
		return temp1;
		
	}
	
	
	
	

}
