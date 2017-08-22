package jiaoCai_2;

import java.util.Scanner;
//测试客户类
public class TestCustomer {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		CustomerBiz Customer=new CustomerBiz();
		while(true){
			System.out.println("请输入客户姓名");
			String newname=input.next();
			Customer.addName(newname);
			System.out.println("继续输入吗?(y/n):");
			char con=input.next().charAt(0);
			if(con!='y'){
				break;
			}

		}
		System.out.println("请输入要修改的客户姓名:");
		String edit1=input.next();
		System.out.println("请输入新的客户姓名:");
		String edit2=input.next();
		boolean flag = Customer.editName(edit1, edit2);
		if(flag == true){
			Customer.show();
		}
	}
}
