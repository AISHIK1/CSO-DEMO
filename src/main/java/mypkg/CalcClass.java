package mypkg;

public class CalcClass {
	
	public int sum(int a, int b)
	{
		return a+b;
	}
	public int diff(int a, int b)
	{
		return a-b;
	}
	public int mul(int a, int b)
	{
		return a*b;
	}
	public int div(int a, int b)
	{
		return a/b;
	}
	public int mult2(int a,int b)
	{
		int mul=1;
		for(int i=1;i<=a;i++)
		{
			mult=mult*i;
		}
		int mul2=1;
		for(int i=1;i<=b;i++)
		{
			mult=mult*i;
		}
		return a+b;
	}
}
