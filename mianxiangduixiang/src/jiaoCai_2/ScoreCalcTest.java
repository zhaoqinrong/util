package jiaoCai_2;

import java.util.Scanner;

public class ScoreCalcTest {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		ScoreCalc Li=new ScoreCalc();
		//输入Java成绩
		System.out.print("请输入Java成绩：");
		Li.java=input.nextInt();
		//输入C#成绩
		System.out.print("请输入C#成绩：");
		Li.c=input.nextInt();
		//输入DB成绩
		System.out.print("请输入DB成绩：");
		Li.db=input.nextInt();
		/*计算总成绩
		Li.CalcTotal();*/
		//显示总成绩
		Li.ShowTotal();
		//计算平均分
	/*	Li.CalcAvg();
		//显示平均分*/
		Li.ShowAvg();
	}
}
