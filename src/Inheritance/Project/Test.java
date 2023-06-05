package Inheritance.Project;

public class Test {

	public static void main(String[] args) {

		String[] project = new String[] {"Check in","Check Out"};
		Manager manager  = new Manager(1,"udith","LOB",20000,project);
		System.out.println(manager.id);
		System.out.println(manager.name);
		System.out.println(manager.dept);
		manager.work();
		String[] technology =  new String[] {"java","C#"};
		Developer developer = new Developer(1,"udith","LOB",20000,technology);
		developer.work();
		String[] tools =  new String[] {"java selenium"};
		Tester tester = new Tester(1,"udith","LOB",20000,tools);
		tester.work();
		
	}

}
