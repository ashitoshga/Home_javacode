package test_sample;

public class Wrapping {

	
public static void main(){
	//Wrapper Class>>all primitive datatypes have classes
	//converting variable to object is called wrapping
			int i =5;
			Integer obj = new Integer(i);
			System.out.println(obj);
	//converting obj into variable is called un-wrapping
			int j = obj.intValue();
			System.out.println(j);
			
			
	
}
}
