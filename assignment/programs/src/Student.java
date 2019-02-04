class Student
{
	String firstname;
	String lastname;

	Qualification.qual[];
	Address addr;
	Project project[];
	String eMail;
	String contactNo;
	String skill[];

	Student()
	{
		firstname = "";
		lastname = "";
		qual = null;
		addr = null;
		project = null;
		eMail = "";
		contactNo = "";
		skill = null;
	}

	Student(String f, String l, Qualification qual[], Address addr, Project project[], String eMail, String contactNo, String skill)
	{
		firstname = f;
		lastname = l;
		this.addr = addr;
		this.qual = qual;
		this.project = project;
		this.eMail = eMail;
		this.contactNo = contactNo;
		this.skill = skill;
	}
}