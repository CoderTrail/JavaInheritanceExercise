
public class Manager extends Employee {
	public Manager(String name, int id, Employee manager) {
		super(name, id, manager);
	}
	
	public Manager(String name, int id) {
		super(name, id, null);
	}
	
	@Override
	public Employee getManager() {
		Employee reportingManager = super.getManager();
		return reportingManager == null ? this : reportingManager;
	}
	
}
