package demo;

public class Constructor_with_Parameter {

	
		int a = 10;
		int b = 10;
		int c;
		
		public void add ()
		{
			 	c=a+b;
			 	System.out.println(c);
	    }
		
		
		public static void main(String[] args)
		{
			Constructor_with_Parameter  ans = new Constructor_with_Parameter ();
			ans.add();
		}
		
		
		
		
		

}
