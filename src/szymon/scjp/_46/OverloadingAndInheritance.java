package szymon.scjp._46;


class c1
{
public void m1(Object o1)
{
  System.out.println("object");
}
public void m1(String o1)
{
    System.out.println("string");
}
public int m1(int c)
{
    return c;
}

}

public class OverloadingAndInheritance {
	public static void main(String a[])
	{
	   c1 ob1=new c1();
	   ob1.m1("hai");
	   
	           
	}
}
