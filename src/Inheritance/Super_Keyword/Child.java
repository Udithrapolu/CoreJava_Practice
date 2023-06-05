package Inheritance.Super_Keyword;

public class Child extends Parent {
	
	int c;
	int d;
	
	Child(){
		
		this(10, 20, 30, 40);
		System.out.println("this no arg constructor child class");
	}

	Child(int a, int b,int c,int d) {
		super(a, b);
		this.c= c;
		this.d= d;
		System.out.println("Child value c="+c+" and d="+d);
		
	}
	
	public static void main(String[] args) {
		
		Child c = new Child();
	}

}
