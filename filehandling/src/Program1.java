import java.util.*;
import java.io.*;
class Program
{
	int serialno;
	String firstname;
	float cgpa;
	char grade;

	Program()
	{
		serialno = 1;
		firstname  = "";
		cgpa = 9.0f;
		grade = 'A';
	}

	Program(int serialno,String firstname,float cgpa,char grade)
	{
		this.serialno = serialno;
		this.firstname = firstname;
		this.cgpa = cgpa;
		this.grade = grade;
	}
	void display()
	{
		System.out.println(serialno +"\t" +firstname +"\t" +cgpa "\t" +grade)
	}
}
class Program1
{
	public static void main(String[] args)
	{
		File f = null;
		try
		{
			   f = new File("C:\\xyz\\javaprogram\\filehandling\\files\\Program1.txt");
              FileReader fin = new FileReader(f);
	      BufferedReader bin= new BufferedReader(fin);
		}
	}
}