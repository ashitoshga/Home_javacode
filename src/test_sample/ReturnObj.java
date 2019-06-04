package test_sample;
//include pass by value & pass by reference object methods

public class ReturnObj {

		int a;
		String s;
		public ReturnObj(String tst)
		{
			this.s = tst;
		}
		public ReturnObj(int a)
		{
			this.a = a;
			System.out.println("inside const value of a"+' ' +a);
		}
		public ReturnObj objreturn()
		{
			ReturnObj ob = new ReturnObj(s+s.concat("Gajare"));
			System.out.println(ob);
			return ob;
		}
		public ReturnObj updateobj1()
		{
			ReturnObj o = new ReturnObj(a+1);			
			//System.out.println(o);
			return o;
		}		
		
	public static void main(String[] args) {
		
		//String update
//		ReturnObj obj = new ReturnObj("Ashitosh");		
//		obj.objreturn();
		
		
		//int update
		ReturnObj obj1 = new ReturnObj(12);		
		System.out.println("before update"+obj1.a);
		
		obj1 = obj1.updateobj1();
		System.out.println("after update" +obj1.a);
		obj1 = obj1.updateobj1();
		obj1.updateobj1();
		
		System.out.println(obj1.a);
		
		
		
	}

}
