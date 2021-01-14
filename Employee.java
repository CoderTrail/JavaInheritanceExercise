
public class Employee {
	private String name;
	private int id;
	private Employee manager;

	
	public Employee(String name, int id, Employee manager) {
		this.name = name;
		this.id = id;
		this.manager = manager;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getId() {
		return this.id;
	}
	
	public Employee getManager() {
		return this.manager;
	}
	
	public boolean isMatch(Employee otherEmployee) {
		return this.id == otherEmployee.id;
	}
	
}
