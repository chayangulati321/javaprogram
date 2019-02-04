import java.util.*;
import java.lang.*;
class CheckArgumentException extends Exception
{
	CheckArgumentException(String m)
	{
		super(m);
	}
}
class Test
{
	public static void main(String[] args)
	{
		try
		{
			if(args.length < 5)
				throw new CheckArgumentException("Num < 5 ");
			int sum = 0;
			for(int i=0; i<args.length; i++)
			{
				num = Integer.parseInt(args[i]);
				if
				{
					sum = sum + num;
				}
				else
				{
					throw new CheckArgumentException("Command Line Arg should be of type int ");	
				}
			}
			System.out.println(sum);
		}
		catch(CheckArgumentException e)
		{
			System.out.println(e.getMessage());
		}
	}
}