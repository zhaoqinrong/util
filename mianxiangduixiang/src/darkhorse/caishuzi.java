package darkhorse;

import java.util.Scanner;

public class caishuzi {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int a=(int)(Math.random()*100+1);
		System.out.print("������һ��������Χ��1~100֮��");
		
		do{
			int  b=input.nextInt();
			if(a>b){
				System.out.print("С��!");
			}else if(a<b){
				System.out.print("����!");
			}else{
				System.out.print("��ϲ��,������!");
				break;
			}
			
			
		}while(true);
	
	}
}
