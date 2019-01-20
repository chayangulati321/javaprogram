import java.util.*;
class program2
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int a[] = new int[5];
		int rc;
		int sum = 0;
		int l;
		l = a[0];
		int sm;
		sm = a[0];
		int sl;
		sl = a[0];
		int sumalt = 0;
		int ceven;
		int occ;
		int count = 0;
		int choice;

		System.out.println("**********MENU**********");
		System.out.println("Press 1 to find	its elements");
		System.out.println("Press 2 to find	Sum of all the elements");
		System.out.println("Press 3 to find	Largest number in the array");
		System.out.println("Press 4 to find	Smallest number in the array");
		System.out.println("Press 5 to find	Second largest number in the array");
		System.out.println("Press 6 to find	Sum of alternate elements in the array");
		System.out.println("Press 7 to find	Count of even numbers in the array");
		System.out.println("Press 8 to find Occurrence of a given number in the array and its frequency");
		
		System.out.println("Enter the element : ");
		s.nextLine();
		for(rc=0; rc<a.length; rc++)
			{
				a[rc] = s.nextInt();
			}
		s.nextLine();
		System.out.println("Enter your choice : ");
		choice = s.nextInt();
		
		switch(choice)
		{
			case 1:
			for(rc=0; rc<a.length; rc++)
			{
				System.out.println("Entered elements are : "+ a[rc]);
				s.nextLine();
			}

			case 2:
			for(rc=0; rc<a.length; rc++)
			{
				sum = sum + a[rc];
				System.out.println("Sum : "+ sum);
				s.nextLine();
			}

			case 3:
			for(rc=0; rc<a.length; rc++)
			{
				if(l < a[rc])
				{
					l = a[rc];
				}
				System.out.println("Largest no. : "+ l);
				s.nextLine();
			}

			case 4:
			for(rc=0; rc<a.length; rc++)
			{
				if(sm > a[rc])
				{
					sm = a[rc];
				}
				System.out.println("Smallest no. : "+ sm);
				s.nextLine();
			}		

			case 5:
			for(rc=0; rc<a.length; rc++)
			{
				if(a[rc] >= sl && a[rc] <= l)
				{
					sl = a[rc];
				}
				System.out.println("Second largest no. : "+ sl);
				s.nextLine();
			}

			case 6:
			for(rc=0; rc<a.length; rc=rc+2)
			{
				sumalt = sumalt + a[rc];
				System.out.println("Sum of alternate elements : "+ sumalt);
				s.nextLine();
			}

			case 7:
			for(rc=0; rc<a.length; rc++)
			{
				if(a[rc]%2 == 0)
				{
					count++;
				}
				System.out.println("Count even no. : "+ count);
				s.nextLine();
			}

			case 8:
			System.out.println("Enter a no. to find Occurrence : ");
			occ = s.nextInt();
			for(rc=0; rc<a.length; rc++)
			{
				if(a[rc] == occ)
				{
					count++;
				}
				System.out.println("Occurrenceof a given no. : "+ count);
				s.nextLine();
			}

		}
	
	}	
}
		