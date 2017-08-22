package jiaoCai;

import java.util.Scanner;

public class Sl_6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Visitors v = new Visitors();
		System.out.println("请输入姓名:");
		v.name=input.next();
		System.out.println("请输入年龄:");
		v.age=input.nextInt();
		v.show();
	}
}
class Visitor1{
	String name;
	int age;
	public void show(){
		Scanner input = new Scanner(System.in);
		while(!"n".equals(name)){
			if(age >= 18 && age <= 60){
				System.out.println(name+"的年龄为:"+age+"门票价格为:20元");
			}else{
				System.out.println(name+"的年龄为:"+age+",门票免费");
			}
			System.out.println("请输入姓名:");
			name = input.next();
			if(!"n".equals(name)){
				System.out.println("请输入年龄:");
				age=input.nextInt();
			}
		}
		System.out.println("退出程序");
	}
}