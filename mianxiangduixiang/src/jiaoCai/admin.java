package jiaoCai;

import java.util.Scanner;

public class admin {
	public static void main(String[] args){
		Administrator guanLiYuan=new Administrator();
		Scanner input=new Scanner(System.in);
		guanLiYuan.name=input.next();
		guanLiYuan.password=input.next();
		Administrator guanLiYuan2=new Administrator();
		guanLiYuan2.name=input.next();
		guanLiYuan2.password=input.next();
		guanLiYuan.show();
		guanLiYuan2.show();
	}
}
