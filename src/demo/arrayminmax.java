package demo;

public class arrayminmax {

	public static void main(String[] args)
	{
		int a[] = {100,250,67,89,54,76,98};
		
		int max = a[0];
		
		for (int i=1;i<a.length;i++)
		{
			   if(a[i]>max)
			{
				max=a[i];
			}
		}
		
		System.out.println(max);
		
		

	}

}
