import java.util.*;
class program5
{
	public static void main(String[] args)
	{
		int i = 0;
		char c;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the character in single alphabet : ");
		c = s.next().charAt(0);

		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
		{
			System.out.println("VOWEL");
		}
		else if((c>='a'&&c<='z')||(c>='A'&&c<='Z'))
		{
			System.out.println("CONSONENT");
		}
		else
		System.out.println("ERROR");

	}	
}
