package jiaoCai_2;

import java.util.Scanner;

public class Sj_7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		CustomerTemo C1 = new CustomerTemo();
		boolean flag = true;

		while(flag){
			System.out.println("����������:");
			C1.addName(input.next());
			System.out.println("��Ҫ����������?(y/n)");
			char choice = input.next().charAt(0);
			if(choice!='y'){
				flag=false;
			}
		}
		System.out.println("��������Ҫ�޸ĵ�����:");
		String oldName = input.next();
		System.out.println("������������:");
		String newName = input.next();
		boolean edit = C1.edit(oldName, newName);
		if(edit==true)
			System.out.println("�޸ĳɹ�");
		C1.show();
	}
}
class CustomerTemo{
	String names[] = new String[10];
	public void addName(String name){
		for(int i = 0;i<names.length;i++){
			if(names[i]==null){
				names[i]=name;
				break;
			}
		}
	}
	public boolean edit(String oldName,String newName){
		boolean flag = false;
		for(int i=0;i<names.length;i++){
			if(names[i].equals(oldName)){
				names[i]=newName;
				flag=true;
				break;

			}

		}
		return flag;
	}
	public void show(){
		for(int i=0;i<names.length;i++){
			if(names[i]!=null){
				System.out.print(names[i]+"\t");
			}
		}


	}
}
