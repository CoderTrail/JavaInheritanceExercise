
public class Personnel {
	public static void printReport(Employee employee) {
		Employee reportingManager = employee.getManager();
		if (employee.isMatch(reportingManager)) {
			System.out.println("This is a manager who reports to nobody.");
		} else {
			System.out.println("Employee " + employee.getName() + " reports to " + reportingManager.getName() + ".");
		}
	}
}
