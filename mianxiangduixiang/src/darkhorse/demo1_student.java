package darkhorse;

public class demo1_student {
	public static void main(String[] args){
		student s1=new student();
		s1.setName("����");
		s1.setAge(23);
		System.out.println("������:"+s1.getName()+"\n"+"����Ϊ:"+s1.getAge());
		student s2=new student("����",24);
		s2.show();
		
	}

}
class student{
	private String name;
	private int  age;
	
	public student(){
		
	}
	public student(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}
	public void show(){
		System.out.print(name+"..."+age);
	}
}

