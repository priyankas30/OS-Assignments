class Q4
{
	public static void main(String...s)
	{
		int num[]={1,2,3,4,5};
		int tofind=7;
		boolean found=false;
		
		for (int n:num)
		{
			if (n==tofind)
			break;
		}
		if(found)
		{
			System.out.println(tofind+" foud");
		}
		else 
		{
			System.out.println(tofind+" not foud");
		}
	}
}
