import java.util.*;
class employee
{
	String firstname;
	String lastname;
	int monthlysalary;
	
	employee()
	{
		firstname = "Ram";
		lastname = "Krishan";
	}
	employee(String firstname,String lastname)
	{
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	employee(int monthlysalary)
	{
		firstname = "Ram";
		lastname = "Krishan";
		this.monthlysalary = monthlysalary;
	}
	void monthlysalary()
	{
		System.out.print("monthlysalary "+monthlysalary);	
	}
	void yearlysalary()
	{
		System.out.print("yearlysalary "+ (12*monthlysalary));
	}
	void raisedsalary()
	{
		System.out.print("raisedsalary"+ ((10/100)*monthlysalary));
	}

	void display()
	{
		System.out.println("firstname "+ firstname);
		System.out.println("lastname "+ lastname);
		monthlysalary();
		yearlysalary();
		raisedsalary();
	}
}

	public class employeetest
	{
		public static void main(String[] args)
		{
			Scanner s = new Scanner(System.in);
			
			employee e1 = new employee();
			e1.display();
			

			System.out.println("Enter the monthlysalary ");
			int monthlysalary = s.nextInt();

			employee e2 = new employee(monthlysalary);
			e2.display();

		}
	}
