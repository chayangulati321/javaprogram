import java.util.*;
class circle
{
	private double radius;
	private String colour;
	private final double pi = 3.14;
	circle()
	{
		radius = 1.0;
	}
	circle(double radius)
	{
		this.radius = radius;
	}
	circle(double radius , String colour)
	{
		this.radius = radius;
		this.colour = colour;
	}
	public double getradius()
	{
		return radius;
	}
	public void setradius()
	{
		this.radius = radius;
	}
	public void setcolour()
	{
		this.colour = colour;
	}
	public String getcolour()
	{
		return colour;
	}
	public void setcolour(String colour)
	{
		this.colour = colour;
	}
	public double getArea()
	{
		return pi*radius*radius;
	}
}
class cylinder extends circle
{
	private double height;

	cylinder()
	{
		super();
		height = 1.0;
	}
	cylinder (double radius)
	{
		super (radius);
	}
	cylinder(double radius, double height)
	{
		super (radius);
		this.height = height;
	}
	cylinder(double radius, double height, String colour)
	{
		super (radius, colour);
		this.height = height;
	}
	public double getheight()
	{
		return height;
	}
	public void setheight()
	{
		this.height = height;
	}
	public double getvolume()
	{
		return super.getArea()*height;
	}
}
	public class Test
	{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		cylinder c1 = new cylinder(2,3,"blue");
		System.out.println(c1.getvolume());
		System.out.println(c1.getcolour());
		System.out.println(c1.getArea());
		
	}
}
