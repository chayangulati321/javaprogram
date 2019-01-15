import java.util.*;
	class program7
	{
		public static void main (String[] args)
		{
			char choice;
	        do
	        {
	            System.out.println("How many rows of the Rhombus Structure should get displayed?");
	            Scanner scan = new Scanner (System.in);
	            int rows = scan.nextInt();          
	            char startAt='A';
	            int count1=1,count2=1;              
	            for (int c1 = 1; c1 < (rows * 2); c1++)                         
	            {
	                for (int spc = rows - count2; spc > 0; spc--)   
	                    System.out.print(" ");
	                if (c1 < rows) 
	                    count2++;
	                else 
	                    count2--;
	                for (int c2 = 0; c2 < count1; c2++) 
	                {
	                    System.out.print(startAt);      
	                    if (c2 < count1 / 2) 
	                        startAt++;
	                    else 
	                        startAt--;
	                }
	                if (c1 < rows)
	                    count1 = count1 + 2;
	                else
	                    count1 = count1 - 2;
	                startAt = 'A';      
	                System.out.println();   
	            }
	            System.out.println("Do you want to try the program for some other character -- Y/N ??");
	            choice=scan.next().charAt(0);   
	        }
	        while (choice=='Y');
	    }
	}
