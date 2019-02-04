class Qualification
{
	String qual;
	String university;
	String institute;
	float cgpa;

	Qualification()
	{
		qualname = "";
		university = "";
		institute = "";
		cgpa = 0.0f;
	}

	Qualification(	String qual,String university,String institute,float cgpa)
	{
		this.qual = qual;
		this.university = university;
		this.institute = institute;
		this.cgpa = cgpa;
	}
}