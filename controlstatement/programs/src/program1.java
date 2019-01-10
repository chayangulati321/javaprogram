import java.util.*;
class program1
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		double a,b,c,d;
		double r1,r2;
	    System.out.println("Equation should be written in ax^2+bx+c");
	    System.out.println("Enter a :");
	    a = s.nextDouble();
	    System.out.println("Enter b :");
	    b = s.nextDouble();
	    System.out.println("Enter c :");
	    c = s.nextDouble();
	    d = b*b-4*(a*c);
	    r1 = (-b + Math.sqrt(d))/(2*a);
	    r2 = (-b - Math.sqrt(d))/(2*a);
	    System.out.println("Roots are :"+ r1 + r2);
    }
	

}