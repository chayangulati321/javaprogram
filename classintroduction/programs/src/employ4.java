import java.util.*;
class employee
{
	String name;
	String address;
	int yearJoining;
	int salary;

	employee()
	{
		name = "Ram";
		yearJoining = 1994;
		address = "64C Vasant Kunj 110070";
	}
	employee(String name, int yearJoining, String address )
	{
		this.name = name;
		this.yearJoining = yearJoining;
		this.address = address;
	}

	void display()
	{
		System.out.println("Name\tYearJoining\tAddress\n"+ name + "  " + yearJoining +"   "+ address);
	}
		
}
		public class employ4
		{
				public static void main(String[] args)
				{
					employee e1 = new employee(); 
					e1.display();
				}
		}
