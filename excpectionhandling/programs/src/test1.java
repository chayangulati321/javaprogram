import java.util.*;
import java.lang.*;
class test1{
	int a,b;
	test1(int a,int b){
		this.a=a;
		this.b=b;

	}
	int divide(){
		return(a/b);
	}

	public static void main(String[] args){
		test1 t1=new test1(33,4);
		test1 t2=new test1(3,0);
		try
		{
			if(t2.b==0)
			throw new ArithmeticException("Value of b cannot be zero");
		
		
			System.out.println(t2.divide());
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			System.out.println(t1.divide());
		}

	}
}