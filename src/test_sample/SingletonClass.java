package test_sample;

public class SingletonClass {
	// To achieve Singleton class means restricting only one object per class
	//1. Create private static class reference variable
	//2. Make constructor Private
	//3. Create a public static method which will return class reference variable
	
	private static SingletonClass obj; 	//step#1
	
	private SingletonClass()			//step#2
	{
		System.out.println("inside SingletonClass constructor");
	}	
		
	public static SingletonClass GetSingletonMethod()	//step#3
	{
		System.out.println("inside GetSingletonMethod");
		
		if (null==obj)
		{
			obj = new SingletonClass();
			//it is imp step if we do not create object of SingletonClass Class then we will get null pointer exception
			//if we try to access singletonmethod1 using test class object 
		}			
			return obj;									//step#3
		
	}
	public void singletonmethod1()
	{
		//this method can be accessed only by object/instance of class
		//obj.singletonmethod1
		System.out.println("inside singletonmethod1 of Singleton Class");
	}
}
