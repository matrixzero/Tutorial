package Object.DelegatePatern;

public class NguyenVanA {
	
	public Delegate delegate;

	public NguyenVanA(Delegate delegate) {
		this.delegate = delegate;
	}
	
	public void setParty(){
		
		System.out.println("Nguyen van A dang don dep");
		System.out.println(delegate.delegate("di mua banh"));
		System.out.println("Nguyen Van A dang di nau an");
	}
	
	
	

}
