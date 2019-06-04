package test_sample;

public class InterviewProgrames {

	public static void main(String[] args) {
		
		
		
		//Upper half Star loop
		for (int a=0; a<5; a++)
		{
			for(int b=5; b>a; b--)
			{
				System.out.print(" ");
			}
			//System.out.println();
			//System.out.print("*");
			//System.out.println();
			for (int c=0; c<=a; c++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		//Lower Half star
		
		for (int aa=0; aa<=5; aa++)
		{
			for(int bb=5; bb>=aa; bb--)
			{
				System.out.print("*");
			}
			//System.out.println();
			//System.out.print("*");
			System.out.println();
			for (int cc=0; cc<=aa; cc++)
			{
				System.out.print(" ");
			}
			//System.out.println();
		}
			
		//Opposite side	
			
			
			System.out.println();
		//Increment Star loop
				for(int i=0; i<5; i++ )
				{
					for(int j=0; j<=i; j++)
					{
						System.out.print("*");
					}
					System.out.println();
					
				}
				//System.out.println();
				
				
			//Decrement Star loop
				for(int jj=0; jj<5; jj++)
				{
					for (int ii=5; ii>jj; ii--)
					{
						System.out.print("*");
					}
					System.out.println();
				}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
