package Object.Exception;

public class Test_Exception {
	
	public static void Chia2so(float a,int b)throws MyException{
		
		if(b==0){
			throw new MyException("so "+a+" ko the chia cho 0!!!Fuck You");
		}
		else if(a==0){
			throw new MyException("so "+b+" ko the chia cho 0!!!Fuck You");
		}
		else
			System.out.println(a/b);
	}
	
	public static void main(String[] args) {
		
		
		try {
			Chia2so(9, 10);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
