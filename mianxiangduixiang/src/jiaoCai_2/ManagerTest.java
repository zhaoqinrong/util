package jiaoCai_2;

import java.util.Scanner;

public class ManagerTest {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		Manager admin=new Manager();
		//�����û���
		System.out.print("�������û�����");
		admin.name=input.next();
		//��������
		System.out.print("���������룺");
		admin.key=input.next();
		//������
		System.out.print(admin.show());
		
		
		
	}
}
