package Inheritance.Super_Keyword;

public class Parent {

	int a;
	int b;
	
	Parent(){
		System.out.println("this no arg constructor parent class");
	}
	
	Parent(int a,int b){
		this();
		this.a= a;
		this.b= b;
		System.out.println("Parent value a="+a+" and b="+b);
	}
}
