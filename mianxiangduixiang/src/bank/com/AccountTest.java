package bank.com;

import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double oldMoney = 0;
		Account Acc = new Account();
		
	a:	while(true){
		System.out.println("1.���\t2.ȡ��\t0.�˳�");
		System.out.println("��ѡ����Ҫ�����ҵ��:");
		int a = input.nextInt();
			switch(a){
			case 1:
				System.out.println("����������:");
				double money = input.nextDouble();
				Acc.setMoney(oldMoney, money);
				oldMoney+=money;
				break;
			case 2:
				System.out.println("������ȡ����:");
				double money1 = input.nextDouble();
				Acc.getMoney(oldMoney, money1);
				oldMoney-=money1;
				break;
			case 0:
				System.out.println("ллʹ��!");
				break a;
				
			}
		}
	}
}
