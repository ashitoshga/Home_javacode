package test_sample2;

public class SubstringPractice {
	
	static String s = "ABCD";
	static String result;

	public static void main(String[] args) {
		
		method(s);

	}
	public static String method(String s1)
	{
		//result = s.substring(1)+s.charAt(0);
		//System.out.println(result);
		
		return method(s1.substring(1))+s1.charAt(0);
		//return result;
	}
	
	

}
