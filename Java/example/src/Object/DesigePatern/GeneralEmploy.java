package Object.DesigePatern;

import Object.EmployGuard;
import Object.Employment;
import Object.Human;

public class GeneralEmploy {
	
	public Human GetEmploy(int i){
		
		Human human =null;
		if(i==1){
			human = new Employment();
		}
		else
			human = new EmployGuard();
		
		return human;
	}
}
