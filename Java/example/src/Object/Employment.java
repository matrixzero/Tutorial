package Object;

public class Employment extends Human implements ActionMethod{
	
	
	public Employment(){
		
	}
	public String getName(){
		
		return name;
	}
	public Employment(String name,int age,int yearOfBirth,double basicSalary){
		
		super(name, age, yearOfBirth, basicSalary);
	}
	
	public String CompanyActivities() {
		
		return name+"phai di picnic";
	}
	
	double PayRoll() {
		
		return getBasicSalary()*2;
	}

	
	

}
