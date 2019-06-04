package test_sample;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDupString {

	public static void main(String[] args) {
		
		String[] sarr = {"aa","bb", "cc", "bb","aa"};
	//we can find dup string using 3 methods:
		//1. By using nested for loop- comparing first element with others
		//time complexity is n(o2)= 2For loops used increases time
		//2. By using HashSet:- Does not store dup values
		//3. By using HashMap:-can stores dup values
		
//1. using nested for loop
//		for(int i=0; i<sarr.length; i++)
//		{
//			for(int j=i+1; j<sarr.length; j++)
//			{
//				if(sarr[i]==sarr[j])
//				{
//					System.out.println(sarr[i]);
//				}
//			}
//		}
//2. using HashSet
//		Set<String> hset = new HashSet<>();
//		for(String tmp: sarr)
//		{
//			if(hset.add(tmp) == false)//checking if string already existed
//			{
//				System.out.println(tmp);//printing only dup string
//			}
//			
//		}
//		System.out.println(hset);//only unique values added in hashset
//3. using HashMap
		//sarr = {"aa","bb", "cc", "bb","aa"};
		Map<String, Integer> hmap = new HashMap<>();
		for(String tm : sarr)
		{
			Integer count;
			count=hmap.get(tm);
					if(count == null)
			{
						hmap.put(tm, 1);						
			}			
			else
			{				
				hmap.put(tm, ++count);	//remember pre-increment of counter
										//otherwise it will put default value as 1
										//and then it will increment counter to 2 incase of count++
			}
		}
		System.err.println(hmap);
		
		
		// TODO Auto-generated method stub

	}

}
