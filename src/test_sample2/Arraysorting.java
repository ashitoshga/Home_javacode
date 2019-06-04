package test_sample2;

public class Arraysorting {

	static int ar[] = {45,12,85,32,89,39,69,44,42,1,6,8}; 
	
	static int temp;
	
	public static void main(String[] args) {
		
		//1. Selection sort method
		//a. find minimum value by comparing first number with rest
		//b. swap first number with smallest number 
		
		//here first element is compared with all other element &
		//at same time it get replaced by smallest number
		//e.g ar={6,13,67,4,1}
		//1st iteration>> 6, 13, 67, 4, 1
		//				  1 ,13, 6, 4, 6
		//(here 6 is replaced by smallest number 1)
		//2nd iteration>> 1, 13, 67, 4, 6
		//				  1 ,4, 6, 13, 6
		//(here 13 is replaced by next smallest number 4) 
		
//			int minindex, temp=0;
//		for(int i=0; i<ar.length; i++)
//		{		
//			minindex = i;
//			for(int j=i+1; j<ar.length; j++)
//			{
//		//a. finding smallest value assuming first value smallest
//				if(ar[j]<ar[minindex])
//				{
//					minindex = j;	//assigning index of min value	
//				}
//			}
//		//b. swapping value using minindex
//			temp = ar[i];
//			ar[i] = ar[minindex];
//			 ar[minindex] = temp;
//			
//		}
//		// printing sorted array
//		System.out.println("select sort method");
//		for(int x=0; x<ar.length; x++)
//		{
//			System.out.println(ar[x]);		
//		}
		
		
		//Bubble sort method
		
//		int[] ar1 = {99,24,6,2,15,7,8};
//		System.out.println("array size before sort"+ar1.length);
//		int temp1;
//		for(int i=0; i<ar1.length; i++)
//		{
//			for(int j=0; j<ar1.length-1; j++)
//			{
//				if(ar1[j+1]<ar1[j])
//				{
//					temp1 = ar1[j];
//					ar1[j] = ar1[j+1];
//					ar1[j+1] = temp1;
//				}
//			}
//		}
//		System.out.println("array size after sort"+ar1.length);
//		System.out.println("bubble sort method");
//		
//		for(int y=0; y<ar1.length; y++)
//		{
//			System.out.println(ar1[y]);
//			
//		}
//		
		int[] ar2 = {5,6,1,8,55,6,6,12,20,76};
		
			int temp, j;
			//starting value is i=1>>not from i=0
			//we are taking second value from array
		for(int i=1; i<ar2.length; i++)	
		{		
					temp = ar2[i];
					j=i;				
					while( j>0 && ar2[j-1]>temp)
					{						
						ar2[j] = ar2[j-1];
						j = j-1;						
					}
					ar2[j] = temp;			
		}
		for(int y=0; y<ar2.length; y++)
			{
				System.out.println(ar2[y]);
				
			}
		
		
		
		
		
		
	}

}
