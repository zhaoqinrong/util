package jiaoCai;

import java.util.Scanner;

public class Sj_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Customers C1 = new Customers();
		System.out.println("�����뿨����:");
		C1.type=input.next();
		System.out.println("���������");
		C1.scores=input.nextInt();
		if("��".equals(C1.type)&&C1.scores>=1000||"�տ�".equals(C1.type)&&C1.scores>=5000){
			C1.scores=C1.scores+500;
			C1.show();
			System.out.println("��������500��!");
		}
		

	}
}
class Customers{
	String type;
	int scores;
	public void show(){
		System.out.println("������:"+type+"\t����:"+scores);
	}
}
