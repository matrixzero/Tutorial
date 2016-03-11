package Object;

public class EmployGuard extends Human implements ActionMethod{

	public EmployGuard(){
		
	}
	public EmployGuard(String name,int age,int year,double salary){
		super(name, age, year, salary);
	}
	public String CompanyActivities() {
		// TODO Auto-generated method stub
		return name +" ko phai di company trip";
	}

	double PayRoll() {
		// TODO Auto-generated method stub
		return getBasicSalary()*1.5;
	}
	
	

}
