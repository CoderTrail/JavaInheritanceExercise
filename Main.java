
public class Main {

	public static void main(String[] args) {
		Employee mgr1 = new Manager("Ron", 123, null);
		Employee mgr2 = new Manager("James", 456, mgr1);
		Employee emp1 = new Employee("John", 789, mgr2);
		Personnel.printReport(mgr1);
	}

}
