package Inheritance.Project;

public class Developer extends Employee {
	
	String[] technology;

	public Developer(int id,String name,String dept,double salary,String[] technology) {
		super(id,name,dept,salary);
		this.technology=technology;
	}
	
	@Override
	public void work() {
		System.out.println("Inside the Developer");
		for (String string : technology) {
			System.out.println(string);
		}
	}

}
