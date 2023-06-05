package Abstraction;

public class My_Circle implements Circle {
	

	public void calculate(int value) {
		System.out.println(value*pi);
		
	}

	public static void main(String[] args) {

		My_Circle c = new My_Circle();
		c.calculate(2);
		
	}

}
