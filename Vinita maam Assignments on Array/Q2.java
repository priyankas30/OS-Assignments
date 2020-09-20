 /* How do you find the missing number in a given integer array of 1 to 10?*/
 import java.util.*;
 class Q2
 {
	 public static void main(String...a)
	 {
		 Scanner sc=new Scanner (System.in);
		 System.out.println("Enter n elements");
		 int n=sc.nextInt();
		 int arr[]=new int [n];
		 System.out.println("Enter (n-1) numbers: ");
		 for (int i=0;i<=n-2;i++)
		 {
			 arr[i]=sc.nextInt();
		 }
		
		 int sum=(n*(n+1))/2;
		 int sumofarray=0;
		 for(int i=0;i<=n-2;i++)
		 {
			 sumofarray=sumofarray+arr[i];
		 }
		 int missingNum=sum-sumofarray;
	 System.out.println("missing number is " +missingNum);
	 }
 }
		 