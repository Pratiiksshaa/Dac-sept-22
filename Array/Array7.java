class Array7
{
	public static void main(String args [])
	{
		int a[] ={23,60,94,3,102};
		int b[]= {42,16,74};
		int c[]= new int[a.length+b.length];
		for(int i=0; i<a.length; i++)
		{
			c[i]= a[i];
		}
		for(int i=0; i<b.length; i++)
		{
			c[a.length+i]= b[i];
		}
		System.out.println("Merged array is ");
		for(int i=0; i<c.length; i++)
		{
			System.out.print(c[i]+" ");
		}
	}
}
/*
Merged array is
23 60 94 3 102 42 16 74
*/