package jiaoCai;

import java.util.Scanner;

public class Jd_2 {
	public static void main(String[] args) {
		boolean flag=false;
		Scanner input = new Scanner(System.in);
		Calculator Ca = new Calculator();
		
		while(!flag){
			System.out.print("�������һ����:");
			int a=input.nextInt();
			System.out.print("������ڶ�����:");
			int b=input.nextInt();
			System.out.print("�����������:");
			char c=input.next().charAt(0);
			flag=true;
		switch(c){
		case '+':
			System.out.print(a+"+"+b+"="+Ca.jia(a, b));
			break;
		case '-':
			System.out.print(a+"-"+b+"="+Ca.jian(a, b));
			break;
		case '*':
			System.out.print(a+"*"+b+"="+Ca.cheng(a, b));
			break;
		case '/':
			System.out.print(a+"/"+b+"="+Ca.chu(a, b));
			break;
			default:
				System.out.println("��������,����������:");
				flag=false;
				break;
		}
		}
	}

}
class Calculator{
	int add;
	int sub;
	int mul;
	int div;
	public int jia(int a, int b){
		add=a+b;
		return add;
	}
	public int jian(int a,int b){
		sub=a-b;
		return sub;
	}
	public int cheng(int a,int b){
		mul=a*b;
		return mul;
	}
	public int chu(int a ,int b){
		div=(int)(a/b);
		return div;
		
	}
}
