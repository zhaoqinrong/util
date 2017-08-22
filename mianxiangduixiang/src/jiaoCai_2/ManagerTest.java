package jiaoCai_2;

import java.util.Scanner;

public class ManagerTest {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		Manager admin=new Manager();
		//输入用户名
		System.out.print("请输入用户名：");
		admin.name=input.next();
		//输入密码
		System.out.print("请输入密码：");
		admin.key=input.next();
		//输出结果
		System.out.print(admin.show());
		
		
		
	}
}
