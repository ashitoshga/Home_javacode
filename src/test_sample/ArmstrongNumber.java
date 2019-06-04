package test_sample;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// armstrong number 157 = 1^(3)+5^(3)+7^(3)
		//							3+125+147=275
	//	GetArmstrongNumber(153);
		//ArmstrongNumberSeries();
		PowerOfNumber(4);
		
//		String s = "371";
//		
//		int z= Integer.parseInt(s);
//		
//		
//		System.out.println(z);
//		char c1 = s.charAt(0);
//		char c2 = s.charAt(1);
//		char c3 = s.charAt(2);
//		
//		
//		
//		int result = 1;
//		for(int i=1; i<s.length(); i++)
//		{
//			result = result*c1;
//			System.out.println(result);/		}
		
		

	}

	//int a = 371;
	static int cube = 0;
	
	public static void GetArmstrongNumber(int a)
	{
		int temp=a;
		while(temp>0)
		{
			int remainder = temp%10;//remainder>>1,7,3
			temp = temp/10;//>>division 37,3
		 cube = cube+(remainder*remainder*remainder);
		}
	
		
		 if (cube==a)
			 System.out.println("Given Number is Armstrong number"+' '+a);
		 else
			 System.out.println("Given Number is NOT a Armstrong number"+' '+a);
			 
	}
	
	public static void ArmstrongNumberSeries()
	{	
	//for getting Armstrong number between 1 to 1000	
		for(int i=0; i<999; i++)	
		{
			int x=i;
			int cube1 = 0;
			while(x != 0)
			{
				int remainder = x%10 ;//for getting last digit
				x = x/10;
				//for getting remaining digits
				//we are updating value of x to finally get quotient as 0
				
				cube1 = cube1+(remainder*remainder*remainder);
				
			}
			if(i==cube1)
				System.out.println(i);		
					}
		
	}
	
	public static void PowerOfNumber(int z)
	{
		//int num = 111;
		int counter =0;
		while(z !=0)
		{
			z = z/10;
			counter++;
		}
		System.out.println(counter);
		
	}
	
	

}
