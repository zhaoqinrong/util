package jiaoCai;

import java.util.Scanner;

public class Visitors {
	String name;
	int age;
	public void calaCprice(){
		if(age>18&&age<60)
			System.out.println("你的姓名是:"+name+"\n你的年龄是"+age+"\n票价为:20");
		else
			System.out.println("你的姓名是:"+name+"\n你的年龄是:"+age+"\n门票免费");
	}
	public static void main(String args[]){
		Scanner in = new Scanner (System.in);
		do{
			System.out.print("请输入您的姓名:");
			String name = in.next();
			if(name.equals("n"))
				break;
			Visitors vis = new Visitors();
			vis.name = name;
			System.out.print("请输入您的年龄:");
			vis.age =in.nextInt();
			vis.calaCprice();
			
			
		}while(true);
		System.out.print("程序结束");
	}

	public void show() {
	}
}
