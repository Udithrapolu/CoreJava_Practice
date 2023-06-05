package Polymorphism;

public class Compile_Time {
	
	void add(int a,int b)
	{
		System.out.println(a*b);
	}
	void add(float a,float b)
	{
		System.out.println(a*b);
	}

	public static void main(String[] args) {

		Compile_Time c = new Compile_Time();
		c.add(1.33f, 12.34f);
		c.add(2, 3);
		
	}

}
