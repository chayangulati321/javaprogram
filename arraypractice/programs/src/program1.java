import java.util.*;
class program1
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int rc1;
		int rc2;
		int a[][] = new int[2][2];

		System.out.println("Enter the elements : ");
		for(rc1=0; rc1<a.length; rc1++)
		{
			for(rc2=0; rc2<a.length; rc2++)
			{
				a[rc1][rc2] = s.nextInt();
				System.out.println("Entered elements are : "+ a[rc1][rc2]);
			}
		}
		
		for(rc1=0; rc1<a.length; rc1++)
		{
			for(rc2=0; rc2<a.length; rc2++)
			{
				if(a[rc1][rc2]%2 == 0)
				{
					System.out.println("Even elements are : "+ a[rc1][rc2]);
					break;
				}
				else
				{
					a[rc1][rc2]= a[rc1][rc2]*2;
					System.out.println("Odd elements after multiplication are : "+ a[rc1][rc2]);
					break;	
				}
			}
		}
	}
}