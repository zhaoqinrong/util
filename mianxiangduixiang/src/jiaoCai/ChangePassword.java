package jiaoCai;

import java.util.Scanner;

public class ChangePassword {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);//新建一个扫描仪
		Administrator admin=new Administrator();//新建一个Administrator
		admin.name="admin";//赋初值
		admin.password="111111";//赋初值
		System.out.print("请输入用户名：");//提示输入用户名
		String nameInput=input.next();//接收用户输入的用户名
		System.out.print("请输入密码：");//提示输入密码
		String passWordInput=input.next();//接收用户输入的密码
		if(admin.name.equals(nameInput)&&admin.password.equals(passWordInput)){//判断输入的用户名和密码是否正确
			System.out.print("请输入新密码：");
			admin.password=input.next();//输入新密码
			System.out.print("密码修改成功，您的新密码为："+admin.password);
		}else{
			System.out.print("用户名和密码不匹配！您没有权限更新管理员信息。");
		}
		
		
	}
}
