
public class Salary {
	
	private String companyName;
	private String name;
	private int salary;
	
	public Salary(String companyName, String name, int salary) {
		this.companyName = companyName;
		this.name = name;
		this.salary = salary;
	}
	
	public int getTo() {
		return salary;
	}
	public String getName() {
		return name;
	}
	public String getCompanyName() {
		return companyName;
	}
	
}
