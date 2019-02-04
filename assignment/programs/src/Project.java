class Project
{
	String name;
	String startDate;
	String endDate;
	String role;
	String respon[]; 

	Project()
	{
		name = "";
		start = Date.Now;
		end = Date.Now;
		respon[] = null;
	
	}

	Project(String name, String startDate, String endDate, String role, String respon[])
	{
			this.name = name;
			this.startDate = startDate;
			this.endDate = endDate;
			this.role  = role;
			this.respon = respon;
	}
}