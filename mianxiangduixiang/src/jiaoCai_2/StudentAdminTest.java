package jiaoCai_2;

import java.util.Scanner;

public class StudentAdminTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] name = new String[10];
		StudentAdmin stu = new StudentAdmin();
		
		for (int i = 0; i < name.length; i++) {
			System.out.println("请输入第"+(i+1)+"位学生姓名:");
			name[i] = input.next();
			System.out.println("是否继续输入(y/n):");
			char a = input.next().charAt(0);
			if(a != 'y'){
				break;
			}
		}
		System.out.println("排序前");
		stu.show(name);
		
		stu.sortName(name);
		System.out.println("排序后");
		stu.show(name);
	}
}
