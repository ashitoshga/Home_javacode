package test_sample2;

public class ArraySorting3 {

	public static void main(String[] args) {	
		//Simple Sort
		int[] ar = {1,44,6,22,16,10,567,3};
				int temp;
//		for(int i=0; i<ar.length; i++)
//		{
//			for(int j=i+1; j<ar.length; j++)//IMP j=i+1 will skip first sorted number i
//			{
//				if(ar[j]<ar[i])
//				{
//					temp = ar[j];
//					ar[j] = ar[i];
//					ar[i] = temp;
//				}
//			}
//		}
//		for(int a=0; a<ar.length; a++)
//		{
//			System.out.println(ar[a]);
//		}
		
//		for(int i=0; i<ar.length; i++)
//		{			temp = ar[i];
//			for(int j=i+1; j<ar.length; j++)
//			{
//				while(j>0 && ar[j]<temp)
//				{
//					temp = ar[i];
//					ar[j] = ar[i];
//					ar[j] = temp;
//				}
//			}			
//		}
//		for(int a=0; a<ar.length; a++)
//		{
//			System.out.println(ar[a]);
//		}
				
		//array merging
			int[] ar1 = {1,2,3}; 
			int[] ar2 = {4,5,6};
			int len = ar1.length+ar2.length;
			int[] ar5 = new int[len];
			
						
			for(int i=0; i<ar1.length; i++)
			{
				ar5[i] = ar1[i];
			}
				
				for(int j=0; j<ar2.length; j++)
				{
					ar5[ar1.length+j] = ar2[j];					
				}
			
			for(int a=0; a<len; a++)
			{
				System.out.println(ar5[a]);
			}
		
		
		
	}

}
