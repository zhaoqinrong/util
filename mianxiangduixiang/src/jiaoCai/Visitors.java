package jiaoCai;

import java.util.Scanner;

public class Visitors {
	String name;
	int age;
	public void calaCprice(){
		if(age>18&&age<60)
			System.out.println("���������:"+name+"\n���������"+age+"\nƱ��Ϊ:20");
		else
			System.out.println("���������:"+name+"\n���������:"+age+"\n��Ʊ���");
	}
	public static void main(String args[]){
		Scanner in = new Scanner (System.in);
		do{
			System.out.print("��������������:");
			String name = in.next();
			if(name.equals("n"))
				break;
			Visitors vis = new Visitors();
			vis.name = name;
			System.out.print("��������������:");
			vis.age =in.nextInt();
			vis.calaCprice();
			
			
		}while(true);
		System.out.print("�������");
	}

	public void show() {
	}
}
