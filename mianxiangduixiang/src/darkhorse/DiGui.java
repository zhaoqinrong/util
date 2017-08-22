package darkhorse;
//递归算法 菲波那切数列;f(0)=0;f(1)=1;f(n)=f(n-1)+f(n-2);
public class DiGui {
	public static void main(String[] args){
		
	}
	static int fn(int n){
		  if(n==0){
			  return 0;
		  }else if(n==1){
			  return 1;
		  }else{
			  return fn(n-1)+fn(n-2);
		  }
	  }
}
  
