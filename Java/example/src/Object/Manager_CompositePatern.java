package Object;

public class Manager_CompositePatern extends Human {

	public EmployGuard employguard;
	public Employment employment;
	
	public Manager_CompositePatern(String name,int age,int year,double salary){
		super(name, age, year, salary);
	}
	public Manager_CompositePatern(Employment emp,EmployGuard emp1){
		
		emp = employment;
		emp1 = employguard;
	}
	
	
	public EmployGuard getEmployguard() {
		return employguard;
	}
	public void setEmployguard(EmployGuard employguard) {
		this.employguard = employguard;
	}
	public Employment getEmployment() {
		return employment;
	}
	public void setEmployment(Employment employment) {
		this.employment = employment;
	}
	public double getSalaryofEmployment(){
		
		return employment.PayRoll()+employguard.PayRoll();
	}

	@Override
	double PayRoll() {
		
		return getBasicSalary()*4;
	}
	
}
