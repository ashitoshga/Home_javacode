package test_sample2;

public class ArraySorting2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Select sort method
		//1.find min value considering first value(i=0)
		//as minimum and comparing other using(j=i+1)
		//if found then using index num swap numbers
		
//		int []ar = {23,5,4,1,9};
//		int temp, minindx;
		//creating 2 variable: one for swapping and second for storing min index
//		for(int i=0; i<ar.length; i++)
//		{
//			minindx = i;		
//			for(int j=i+1; j<ar.length; j++)
//			{						
//				if(ar[j]<ar[minindx])
//				{
//					minindx = j;				
//				}
//			}
//			 	temp = ar[minindx];
//			 	ar[minindx] = ar[i];
//			 	ar[i] = temp;
//		}
//		for(int z=0; z<ar.length; z++)
//		{
//			System.out.println(ar[z]);
//		}
//		
		//String sorting
		//1. Here it is same as int but for comaring char ascii values are used
		
		String s = "TEJASWI";
		char[] chrr = s.toCharArray();
		for(int a=0; a<chrr.length; a++)
		{
			System.out.println("Unsorted String is"+' '+chrr[a]);
		}
		
		for(int i=0; i<chrr.length; i++)
		{	
			char ctemp;
			for(int j=i+1; j<chrr.length; j++)
			{
				if(chrr[j]<chrr[i])
				{
					ctemp = chrr[i];
					chrr[i] = chrr[j];
					chrr[j] = ctemp;
				}
			}
		}
		String res="";
		for(int b=0; b<chrr.length; b++)
		{			
			res = res+chrr[b];			
		}
		System.out.println("Sortred String is"+' '+res);
		

	}

}
