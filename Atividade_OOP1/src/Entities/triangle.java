package Entities;


public class triangle {

	public double a;
	public double b;
	public double c;
	public double p;
	
	public double area()
	{
	p = (a + b + c) / 2;
	System.out.println("p eh" + p);
	return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}}
	

	
	

	
