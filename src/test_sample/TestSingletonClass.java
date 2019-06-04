package test_sample;

public class TestSingletonClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingletonClass ob = SingletonClass.GetSingletonMethod();//setting value of obj to ob
		//from above line of code we are expecting to return SingletonClass = new SingletonClass() by GetSingletonMethod from SingletonClass class
		//we can not use regular instantiation as constructor is private & we can not access 
		//here we are setting value of SingletonClass reference variable to 'ob'
		//calling static method using class name
		
		// hence we have to call static method using class name
		// after calling static method we can use same object for accessing different methods inside of Singlton class
		//here we restricted to use only 'ob' object to call other methods from Singleton Class
		
		//ob.GetSingletonMethod();
		ob.singletonmethod1();
		SingletonClass ob2 = SingletonClass.GetSingletonMethod();
		ob2.GetSingletonMethod();
		ob2.singletonmethod1();
		

	}

}
