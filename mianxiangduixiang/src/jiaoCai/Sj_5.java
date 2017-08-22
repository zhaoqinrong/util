package jiaoCai;

import java.util.Scanner;

public class Sj_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Customers C1 = new Customers();
		System.out.println("请输入卡类型:");
		C1.type=input.next();
		System.out.println("请输入积分");
		C1.scores=input.nextInt();
		if("金卡".equals(C1.type)&&C1.scores>=1000||"普卡".equals(C1.type)&&C1.scores>=5000){
			C1.scores=C1.scores+500;
			C1.show();
			System.out.println("回馈积分500分!");
		}
		

	}
}
class Customers{
	String type;
	int scores;
	public void show(){
		System.out.println("卡类型:"+type+"\t积分:"+scores);
	}
}
