package test_sample;

public class TestConstructor {
	
	// If we dont create object of Class then constructor method will not be called
	// In other words Default or Parameterized constructor method,
	// is called when Object of a Class is created.
	// If Constructor return type set as Void then method wont return anything.
	// Always keep in mind that when creating constructor of class don't set void return type
	
	public TestConstructor(){
		System.out.println("Default const...");
	}
	
	
	public TestConstructor(String a)
	{
		String test = "TestConstructor string return const...";
		System.out.println(test);
		//return test; This is not possible since const method dont return values
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestConstructor obbj = new TestConstructor();
		
		//obbj.TestConstructor();
		TestConstructor obj1 = new TestConstructor("ashu");
		
		
		
		
		

	}

}
