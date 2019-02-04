class Address
{
	String line1;
	String line2;
	String city;
	String state;
	String pincode;

	Address()
	{
		line1 = "";
		line2 = "";
		city = "";
		state = "";
		pincode = "";
	}

	Address(String line1,String line2,String city,String state,String pincode)
	{
		this.line1 = line1;
		this.line2 = line2;
		this.city = city;
		this.state  = state;
		this.pincode = pincode;
	}
}