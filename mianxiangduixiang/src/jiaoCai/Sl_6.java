package jiaoCai;

import java.util.Scanner;

public class Sl_6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Visitors v = new Visitors();
		System.out.println("����������:");
		v.name=input.next();
		System.out.println("����������:");
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
				System.out.println(name+"������Ϊ:"+age+"��Ʊ�۸�Ϊ:20Ԫ");
			}else{
				System.out.println(name+"������Ϊ:"+age+",��Ʊ���");
			}
			System.out.println("����������:");
			name = input.next();
			if(!"n".equals(name)){
				System.out.println("����������:");
				age=input.nextInt();
			}
		}
		System.out.println("�˳�����");
	}
}