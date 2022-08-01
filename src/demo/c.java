package demo;

public class c 
{
 // 0  1  1  2  3  5    8    13    21    34    55    89 
	public static void main(String[] args)
{
		
	int a = 0;
	int b = 1;
	int c ;
	
	for (int i=0;i<10;i++)
	{
		a=a+b;
		
		System.out.println(a);
		c=a;
		a=b;
		b=c;
		
		
	}
	
			
}
}