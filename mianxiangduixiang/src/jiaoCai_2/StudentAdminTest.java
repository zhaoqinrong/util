package jiaoCai_2;

import java.util.Scanner;

public class StudentAdminTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] name = new String[10];
		StudentAdmin stu = new StudentAdmin();
		
		for (int i = 0; i < name.length; i++) {
			System.out.println("�������"+(i+1)+"λѧ������:");
			name[i] = input.next();
			System.out.println("�Ƿ��������(y/n):");
			char a = input.next().charAt(0);
			if(a != 'y'){
				break;
			}
		}
		System.out.println("����ǰ");
		stu.show(name);
		
		stu.sortName(name);
		System.out.println("�����");
		stu.show(name);
	}
}
