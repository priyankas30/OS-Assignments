class Q1
{
	static void intersection(int arr1[],int arr2[],int m,int n)
	{
		int i=0,j=0;
		while (i<m && j<n)
		{
			if (arr1[i]<arr2[j])
			i++;
			else if (arr2[j]<arr1[i])
				j++;
			else 
			{
				System.out.println(arr2[j++]+ " ");
				i++;
			}
		}
	}
	public static void main(String...s)
	{
	int arr1[]={12, 34, 56, 67, 89};
	int arr2[]= {21,56, 78,90};
	int m=arr1.length;
	int n=arr2.length;
	intersection( arr1, arr2, m, n);
	}
}