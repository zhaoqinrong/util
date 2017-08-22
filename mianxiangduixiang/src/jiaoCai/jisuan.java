package jiaoCai;

import java.util.Scanner;

public class jisuan {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		double c=input.nextDouble();
		char d=input.next().charAt(0);
		double e=input.nextDouble();
		if('/'==d){
			chu chu=new chu();
			chu.a=c;
			chu.b=e;
			chu.show();
		}else if('*'==d){
			cheng cheng=new cheng();
			cheng.a=c;
			cheng.b=e;
			cheng.show();
		}else if('+'==d){
			jia jia=new jia();
			jia.a=c;
			jia.b=e;
			jia.show();
		}else {
			jian jian=new jian();
			jian.a=c;
			jian.b=e;
			jian.show();
		}
	}

}
