
public class test1 {
	
	public static void bangCuuChuong(int start,int end){
		
		int i,j,kq,temp=1;
		String s="";
		
		for(i=1;i<=9;i++){
			
			for(j=start;j<=end;j++){
				
				kq =j*temp;
				s+=j+"*"+temp+"="+kq+" ";
			}
			temp+=+1;
			System.out.println(s);
			s="";
			
		}
	}

	public static void tongS(int n){
		
		int i ,j;
		String s="",s1="";
		
		for(i=1;i<=n;i++){
		
			if(i==n){
				s=s+i;
			}
			else
				s=s+i+"*";
			
		}
		if(n%2==0){
			
			for(j=1;j<=n;j++){
				
				if(j%2==0){
					
					if(j==n){
						s1=s1+j;
					}
					else
						s1=s1+j+"*";
				}
			}
		}
		else
			for(j=1;j<=n;j++){
				
				if(j%2!=0){
					
					if(j==n){
						s1=s1+j;
					}
					else
						s1=s1+j+"*";
				}
			}
		System.out.println(s);
		System.out.println(s1);
	}
	public static void main(String[] args) {
		
		tongS(10);

		
		
	}
}
