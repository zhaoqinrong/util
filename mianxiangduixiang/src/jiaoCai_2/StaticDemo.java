package jiaoCai_2;

public class StaticDemo {
	static String name;
	
	static int age;
	public StaticDemo(){
		System.out.print("我是无参构造");
	}
	public StaticDemo(String name,int age){
		System.out.println("我是有参构造");
		this.name=name;
		this.age = age;
	}
	public void setName(String name){
		System.out.println("我是setName方法");
		this.name = name;
	}
	public static int getAge() {
		System.out.println("我是getAge方法");
		return age;	
	}
	
	public static void setAge(int age) {
		StaticDemo.age = age;
		System.out.println("我是setAge方法");
	}
	public static String getName() {
		System.out.println("我是getName方法");
		return name;
	}
	static{
		System.out.println("我是静态代码块");
	}
	public static void main(String[] args) {
		StaticDemo.name = "你好";
		System.out.print(StaticDemo.name);
	}
}
