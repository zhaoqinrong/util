package jiaoCai_2;

import java.util.Scanner;

public class ScoreCalcTest {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		ScoreCalc Li=new ScoreCalc();
		//����Java�ɼ�
		System.out.print("������Java�ɼ���");
		Li.java=input.nextInt();
		//����C#�ɼ�
		System.out.print("������C#�ɼ���");
		Li.c=input.nextInt();
		//����DB�ɼ�
		System.out.print("������DB�ɼ���");
		Li.db=input.nextInt();
		/*�����ܳɼ�
		Li.CalcTotal();*/
		//��ʾ�ܳɼ�
		Li.ShowTotal();
		//����ƽ����
	/*	Li.CalcAvg();
		//��ʾƽ����*/
		Li.ShowAvg();
	}
}
