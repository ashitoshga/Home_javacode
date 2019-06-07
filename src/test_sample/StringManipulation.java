package test_sample;

import java.util.ArrayList;
import java.util.List;

public class StringManipulation {

	public static void main(String[] args) {
		// consider a string "ABCD01"
		//increment value of integer from given string
		
		String s = "ABCD10";
		String unchange = s.substring(0, s.length()-2);
		//System.out.println(unchange);
		String tmp;
		List<String> list = new ArrayList<>();
		try 
		{
			String change = s.substring(s.length()-2);
			int digits = Integer.parseInt(change);
			//System.out.println(change);
			System.out.println(digits);
			while(digits<=15)
			{
				digits++;
				tmp = Integer.toString(digits);
//				StringBuffer sbf = new StringBuffer(digits);
//				String tmp = sbf.toString();
				//System.out.println(tmp);
				list.add(unchange+tmp); 
			}
			System.out.println(list);
			System.out.println(list.get(1));
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		

	}

}
