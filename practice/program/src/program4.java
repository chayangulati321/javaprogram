import java.util.*;
class program4
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int i,n;
		float x;
		float sum = 1;
		float term = 1;
		System.out.println("Enter the value of x and n : ");
		x = s.nextFloat();
		n = s.nextInt();

		for(i=1;i<n;i++)
		{
			term = term*x/(float)i;
			sum = sum + term;
		}
		System.out.println("Sum is : "+ sum);

	}
}
