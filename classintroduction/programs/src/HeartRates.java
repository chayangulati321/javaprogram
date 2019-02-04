import java.util.*;
class Heart
{
	String firstname;
	String lastname;
	int dateofbirth;
	int date;
	int month;
	int year;
	int currentdate;
	int currentmonth;
	int currentyear;
	int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};

	Heart()
	{
		firstname = "";
		lastname = "";
		date = 1;
		month = 1;
		year = 2000;
	}
	Heart(String firstname, String lastname, int date, int month, int year)
	{
		this.firstname = firstname;
		this.lastname = lastname;
		this.date = date;
		this.month = month;
		this.year = year;
	}
	void AgeCalculator()
	{
		if(date > currentdate)
		{
			currentdate = currentdate + months[month -1];
			currentmonth = currentmonth -1;
		}
		if(month > currentmonth)
		{
			currentyear = currentyear -1;
			currentmonth = currentmonth +12;
		}
		int caldate = currentdate - date;
		int calmonth = currentmonth - month;
		int calyear = currentyear - year;
		System.out.println("Calculated Age : "+caldate +" " +calmonth +" " +calyear);
	}
	void display()
	{
		System.out.println("firstname : " + firstname);
		System.out.println("lastname : " + lastname);
		AgeCalculator();
	}
}
public class HeartRates
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		Heart h1 = new Heart();
		h1.display();
		System.out.println("Enter the firstname : ");
		h1.firstname = s.nextLine();
		System.out.println("Enter the lastname : ");
		h1.lastname = s.nextLine();
		System.out.println("Enter the dateofbirth : ");
		h1.date = s.nextInt();
		h1.month = s.nextInt();
		h1.year = s.nextInt();
		System.out.println("Enter the current date : ");
		h1.currentdate = s.nextInt();
		h1.currentmonth = s.nextInt();
		h1.currentyear = s.nextInt();

		h1.display();
	}
}