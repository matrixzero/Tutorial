package Object;

import java.util.ArrayList;
import java.util.EmptyStackException;


public class Arraylist_test {
	
	public static void main(String[] args) {
		
		ArrayList<Employment> arr = new ArrayList();
		
		Employment emp = new Employment();
		emp.name ="tien";
		arr.add(emp);
		Employment emp1 = new Employment();
		emp1.name = "hau";
		arr.add(emp1);
		Employment emp2 = new Employment();
		emp2.name = "uyen";
		arr.add(emp2);
		
		
		
		for(int i=0;i<arr.size();i++){
			
			System.out.println(arr.get(i).name);
		}
	}

}
