package Inheritance.Project;

public class Tester extends Employee {
	
	String[] tools;

	public Tester(int id,String name,String dept,double salary,String[] tools) {
		super(id,name,dept,salary);
		this.tools=tools;
	}
	
	@Override
	public void work() {
		super.work();
		System.out.println("Inside the tester");
		for (String string : tools) {
			System.out.println(string);
		}
	}

}
