package jiaoCai_2;

public class StaticDemo {
	static String name;
	
	static int age;
	public StaticDemo(){
		System.out.print("�����޲ι���");
	}
	public StaticDemo(String name,int age){
		System.out.println("�����вι���");
		this.name=name;
		this.age = age;
	}
	public void setName(String name){
		System.out.println("����setName����");
		this.name = name;
	}
	public static int getAge() {
		System.out.println("����getAge����");
		return age;	
	}
	
	public static void setAge(int age) {
		StaticDemo.age = age;
		System.out.println("����setAge����");
	}
	public static String getName() {
		System.out.println("����getName����");
		return name;
	}
	static{
		System.out.println("���Ǿ�̬�����");
	}
	public static void main(String[] args) {
		StaticDemo.name = "���";
		System.out.print(StaticDemo.name);
	}
}
