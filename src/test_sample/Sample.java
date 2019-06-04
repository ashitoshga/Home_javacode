package test_sample;

public class Sample {
	protected static int sample;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hello World");
		
for (int counter = 0; counter < 10; counter++)
    {
		System.out.println(counter);

			if (counter == 4) 
				{
					continue;
					}
System.out.println("This will not get printed when counter is 4");
    }


	}
}
