package jiaoCai_2;

import java.util.Scanner;

public class Sj_6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		CustomerBizs C1 = new CustomerBizs();
		boolean flag=true;
		while(flag){
			System.out.print("请输入姓名:");
			String newName = input.next();
			C1.addName(newName);
			System.out.println("需要继续输入吗?(y/n)");
			char con = input.next().charAt(0);
			if(con != 'y'){
				flag = false;
			}
			
		}
		C1.show();
	}

}
class CustomerBizs{
	String names[] = new String[10];
	public void addName(String name){
		for(int i = 0;i <names.length;i++){
			if(names[i]==null){
				names[i]=name;
				break;
			}
		}
	}
	public void show(){
		for(int i = 0;i < names.length;i++){
			if(names[i] != null)
			System.out.print(names[i]+"\t");
		}
	}
}
