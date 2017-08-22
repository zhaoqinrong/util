package darkhorse;

import java.util.Scanner;

public class caishuzi {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int a=(int)(Math.random()*100+1);
		System.out.print("请输入一个整数范围在1~100之间");
		
		do{
			int  b=input.nextInt();
			if(a>b){
				System.out.print("小了!");
			}else if(a<b){
				System.out.print("大了!");
			}else{
				System.out.print("恭喜您,猜中了!");
				break;
			}
			
			
		}while(true);
	
	}
}
