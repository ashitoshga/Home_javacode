package test_sample;

public class InterviewQuestions {
	
	//print following structure
			//   4
			//  34
			// 234
			//1234

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NumPyramid();

	}
	
	
	public static void NumPyramid()
	{
		for(int i=0; i<10; i++)
		{
			for(int j=9; j>i; j--)
			{
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++)
			{
				//System.out.print("*");
				if(k==i)
				{
					System.out.print(10);
				}
					if(k<i)
					{		
						if(k==i)
						{
							
							System.out.print(10-k);
						}
						else
						{
							System.out.print(10-i);
						}							
						
					}
						
					
				
					
				
													
			}
			System.out.println();
		}
	}
	

}
