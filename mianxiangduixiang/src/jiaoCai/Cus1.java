package jiaoCai;

import java.util.Scanner;

public class Cus1 {
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		Customer1 one=new Customer1();
		System.out.println("请输入会员卡类型：");
		one.leixing=input.next();
		System.out.println("请输入会员积分：");
		one.score=input.nextInt();
		if(one.leixing.equals("金卡")&&one.score>1000||one.leixing.equals("普通卡")&&one.score>5000){
			one.hui=500;
			one.show();
		}else{
			one.show();
		}
	}
}
