package jiaoCai_2;

import java.util.Scanner;
//���Կͻ���
public class TestCustomer {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		CustomerBiz Customer=new CustomerBiz();
		while(true){
			System.out.println("������ͻ�����");
			String newname=input.next();
			Customer.addName(newname);
			System.out.println("����������?(y/n):");
			char con=input.next().charAt(0);
			if(con!='y'){
				break;
			}

		}
		System.out.println("������Ҫ�޸ĵĿͻ�����:");
		String edit1=input.next();
		System.out.println("�������µĿͻ�����:");
		String edit2=input.next();
		boolean flag = Customer.editName(edit1, edit2);
		if(flag == true){
			Customer.show();
		}
	}
}
