package jiaoCai_2;

public class StaticDemoTest {
	public static void main(String[] args) {
		StaticDemo.name="nihao!";
		System.out.println(StaticDemo.name);
		StaticDemo S1 = new StaticDemo();
		S1.name = "ฤ๚บร";
		System.out.println(S1.name);
		StaticDemo S2 = new StaticDemo("zhangsan",18);
		System.out.println(S2.name);
		System.out.println(S2.age);
		
	}
}
