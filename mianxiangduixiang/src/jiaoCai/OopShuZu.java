package jiaoCai;

public class OopShuZu {
	String uerName;
	String passWord;
	public OopShuZu(){}
	public OopShuZu(String uerName,String passWord){
		this.uerName = uerName;
		this.passWord = passWord;
	}
	public void print(){
	}
	
	public String toString(){
		return "”√ªß√˚:"+this.uerName+"\n"+
				"√‹¬Î:"+this.passWord;
	}
	public void show(){
	}
	public static void main(String args[]){
		OopShuZu  oop1 = new OopShuZu("Admin","123");
		System.out.println(oop1);
		OopShuZu oop2 = new OopShuZu();
		oop2.uerName = "Admin1";
		oop2.passWord = "123b";
		OopShuZu oop3 = new OopShuZu();
		oop3.uerName = "Admin2";
		oop3.passWord = "123c";
		OopShuZu oop[] = new OopShuZu[3];
		oop[0] = oop1;
		oop[1] = oop2;
		oop[2] = oop3;
		
		
	}
}
