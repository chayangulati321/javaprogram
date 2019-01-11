import java.util.*;
class program6
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int r,i,j,k;
		int num = 1;
		System.out.print("Enter the no. of rows : ");
		r = s.nextInt();

		for(i=0;i<r;i++)
		{
			for(k=r;k>1;k--)
			{
				System.out.print(" ");
			}
			num = 1;
			for(j=0;j<=i;j++)
			{
				System.out.print(num+ " ");
				num = num * (i-j)/(j+1);
			}
			System.out.println();
		}
	}
}
