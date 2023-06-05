package Inheritance.Project;

public class Manager extends Employee {
	
	String[] project;

	public Manager(int id,String name,String dept,double salary,String[] project) {
		super(id,name,dept,salary);
		this.project=project;
	}
	
	@Override
	public void work() {
		super.work();
		System.out.println("Inside the manager");
		for (String string : project) {
			System.out.println(string);
		}
	}

}
