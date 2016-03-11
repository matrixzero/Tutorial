package Object;

public abstract class Human {
	
	public String name;
	public int age,yearOfBirth;
	private double basicSalary;


	public Human(){
		
	}


	public Human(String name, int age, int yearOfBirth, double basicSalary) {
		super();
		this.name = name;
		this.age = age;
		this.yearOfBirth = yearOfBirth;
		this.basicSalary = basicSalary;
	}
	
	
	public double getBasicSalary() {
		return basicSalary;
	}


	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public String toString(){
		
		return name+" "+age+" "+yearOfBirth+" "+basicSalary;
	}
	abstract double PayRoll();
	
	
}
