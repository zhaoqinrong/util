package darkhorse;

public class Demo1_Person {
	public static void main(String[] args){
		Person p1=new Person("����",23);
		//p1.show();
		System.out.println(p1.getname()+"..."+p1.getage());
		Person p2=new Person();
		//p2.show();
		p2.setname("����");
		p2.setage(23);
		System.out.println(p2.getname()+"...."+p2.getage());
		
	}
}
class Person{
	private String name;
	private int age;
	public Person(){
		//System.out.println("�޲ι���");
	}
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	//	System.out.println("�вι���");
	}
	public void setname(String name){
		this.name=name;
	}
	public void setage(int age){
		this.age=age;
	}
	public String getname(){
		return name;
	}
	public int getage(){
		return age;
	}
	//public void show(){
	//	System.out.println(name+"...."+age);
	//}
}
