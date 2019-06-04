package test_sample;

import java.util.HashMap;
import java.util.Scanner;



public class Stringtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//palinogram programe
//		
//		Scanner scn = new Scanner(System.in);
//		System.out.println("Enter number to Check");
//		String input = scn.nextLine();
//		scn.close();
//		//System.out.println("Enter number to Check");
//	//	System.out.print(input);
//		//int len = Integer.valueOf(input);
//		int len1= Integer.parseInt(input);
//		//String len = 
//		
//		System.out.println(len1);
//		
//		int i =5;
//		Integer obj = new Integer(i);
//		System.out.println(obj);
//		
//		int j = obj.intValue();
//		System.out.println(j);	
		
		//Find recurrsive word in a String using hashmap
		FindStringDup("i am am test");
		
	}
	public static String FindStringDup(String str)
	{
		HashMap<String, Integer> hm = new HashMap<>();
		
		String[] tmpstr = str.split(" ");
		for(String s : tmpstr)
		{
			if(hm.get(s) != null)
			{
				hm.put(s, hm.get(s)+1);
			}
			else
			{
				hm.put(s, 1);
			}
			
			//System.out.println(hm);
		}
		//System.out.println(hm);
		
		String st = hm.toString();
		//System.out.println(st);
		return st;
		
		
		
		
	}

}
