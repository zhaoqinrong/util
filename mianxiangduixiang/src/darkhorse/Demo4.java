package darkhorse;

import java.util.Scanner;

public class Demo4{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("请输入日期(20120321):");
	int dates=input.nextInt(); //例如201203121
	int year=dates/10000;
	int month=dates%10000/100;
	int day=dates%100;
	int bigMonth=31;
	int smallMonth=30;
	int feb=0;
	if(year%4==0&&year%100!=0||year%400==0){
		feb=29;
	}else{
		feb=28;
	}
	switch(month){
		case 1:
		System.out.print("这是一年中的第"+day+"天");
		break;
		case 2:
		System.out.print("这是一年中的第"+(bigMonth+day)+"天");
		break;
		case 3:
		System.out.print("这是一年中的第"+(bigMonth+feb+day)+"天");
		break;
		case 4:
		System.out.print("这是一年中的第"+(2*bigMonth+feb+day)+"天");
		break;
		case 5:
		System.out.print("这是一年中的第"+(2*bigMonth+smallMonth+feb+day)+"天");
		break;
		case 6:
		System.out.print("这是一年中的第"+(3*bigMonth+smallMonth+feb+day)+"天");
		break;
		case 7:
		System.out.print("这是一年中的第"+(3*bigMonth+2*smallMonth+feb+day)+"天");
		break;
		case 8:
		System.out.print("这是一年中的第"+(4*bigMonth+2*smallMonth+feb+day)+"天");
		break;
		case 9:
		System.out.print("这是一年中的第"+(5*bigMonth+2*smallMonth+feb+day)+"天");
		break;
		case 10:
		System.out.print("这是一年中的第"+(5*bigMonth+3*smallMonth+feb+day)+"天");
		break;
		case 11:
		System.out.print("这是一年中的第"+(6*bigMonth+3*smallMonth+feb+day)+"天");
		break;
		case 12:
		System.out.print("这是一年中的第"+(6*bigMonth+4*smallMonth+feb+day)+"天");
		break;
	}
	}
}