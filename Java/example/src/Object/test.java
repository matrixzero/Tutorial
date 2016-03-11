package Object;

import Object.DelegatePatern.NguyenVanA;
import Object.DelegatePatern.NguyenVanB;
import Object.DesigePatern.GeneralEmploy;

public class test {

	public static void main(String[] args) {

		NguyenVanB b = new NguyenVanB();
		NguyenVanA a = new NguyenVanA(b);
		
		a.setParty();
	}
	
	
}
