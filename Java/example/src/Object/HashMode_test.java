package Object;

import java.util.HashMap;

public class HashMode_test {
	
	public static void main(String[] args) {
		
		HashMap<Integer, Employment> hash = new HashMap<Integer, Employment>();
		
		Employment emp = new Employment("tien",28,1987,2.0);
		hash.put(1987, emp);
		Employment emp1 = new Employment("hau", 28, 1988, 3.0);
		hash.put(1988, emp1);
		
		Employment temp = hash.get(1988);
		
		if(temp!=null){
			
			System.out.println(temp.name);
		}
		else 
			System.out.println("can not find employment");
	}

}
