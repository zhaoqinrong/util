package jiaoCai;

import java.util.Scanner;

public class Cus1 {
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		Customer1 one=new Customer1();
		System.out.println("�������Ա�����ͣ�");
		one.leixing=input.next();
		System.out.println("�������Ա���֣�");
		one.score=input.nextInt();
		if(one.leixing.equals("��")&&one.score>1000||one.leixing.equals("��ͨ��")&&one.score>5000){
			one.hui=500;
			one.show();
		}else{
			one.show();
		}
	}
}
