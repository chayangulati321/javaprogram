import java.util.*;
class program4
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n;
		System.out.println("Enter an integer with five digits : ");	
		n = s.nextInt();
		if((n>=10000) && (n<=99999))
		{
			System.out.printf("%d  ", (n / 10000));	
			System.out.printf("%d  ", (n / 1000) % 10);	
			System.out.printf("%d  ", (n / 100) % 10);	
			System.out.printf("%d  ", (n % 100) / 10);	
			System.out.printf("%d  ", (n % 10));	
		}
	else
	{
		System.out.printf("Error");
	}	

    }
}		