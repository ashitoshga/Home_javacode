package test_sample;

import java.util.ArrayList;

public class ArrysExamples {

	public static void main(String[] args) {
		// Array defination
		//1. simple declaration-No need to define size
		String[] st = {"Ashitosh", "Gajare"};
		String st1[] ={"Teja", "Gajare"};
		System.out.println(st.length);
		
		for(int y=0; y<=st.length-1; y++)
		{
			System.out.println(st[y]);
		}
		for(String ts : st1)
		{
			System.out.println(ts);
		}
		
		//2. Using new object method
		int[] aar = new int[4];
		int aar1[] = new int[5];
		
		//3. Using 'ArrayList' Class method
		ArrayList ar = new ArrayList();
		ar.add("Test");
		ar.add(12);
//		System.out.println(ar);
//		System.out.println(ar.get(0));
//		System.out.println(ar.get(1));
		//To restrict only Integers
		ArrayList<Integer> in = new ArrayList<Integer>();
		//in.add("tets");
		//This is not allowed adding String to Integer array
		ArrayList<String> ss = new ArrayList<String>();
		//Similar case for String array list	
		
		
		String s = "123456678";
		String[] sa = s.split("");
		int[] ina = new int[sa.length];
		
		for(int i=0; i<s.length(); i++)
		{
			ina[i] = Integer.parseInt(sa[i]);
			System.out.println(ina[i]);
		}		
		
		//other way of iterating array loop using While-loop
		int x=0;
		while(x!=ina.length)
		{
			System.out.println(ina[x]);
			x++;
		}
		
		//int[] t = new int[3];
		//findmissing(ina);
		dupnum(ina);
	
	}
	
	//int a1[]= s.split(s);
	public static void findmissing(int inaa[])
	{
		//finding actual sum for 1 to 9 numbers
		int expectedsum = 0;
		for(int j=1; j<=9; j++)
		{
			expectedsum = expectedsum+j;
		}
		System.out.println("expected sum is"+' '+expectedsum);
		
		
		int actualsum = 0;
		System.out.println("array size is"+' '+inaa.length);
		for(int z=0; z<inaa.length; z++)
		{
			actualsum = actualsum+inaa[z];
		}
		System.out.println("expected sum is"+' '+actualsum);
		
		int miss;
		miss = expectedsum-actualsum;
		System.out.println("Missing number is"+' ' +miss);
	}
	public static void dupnum(int ina[])
	{
		int expectresult2=0;
		for(int a=1; a<ina.length; a++)
		{
			expectresult2 = expectresult2+ina[a];
		}
		expectresult2=45;
		System.out.println("expected Sum is"+' '+expectresult2);
		int actualsum2=0;
		
		for(int b=0; b<ina.length; b++)
		{
			actualsum2 = actualsum2+ina[b];
		}
		System.out.println("actual Sum is"+' '+actualsum2);
		//int dup;
		int dup = expectresult2-actualsum2;
		System.out.println("difference in sum is"+' '+dup);
		int actualnum = ina[8]-dup;
		System.out.println("duplicate number is"+' '+actualnum);
		
	}
	

}
