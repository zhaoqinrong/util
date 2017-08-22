package bank.com;

import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double oldMoney = 0;
		Account Acc = new Account();
		
	a:	while(true){
		System.out.println("1.存款\t2.取款\t0.退出");
		System.out.println("请选择你要办理的业务:");
		int a = input.nextInt();
			switch(a){
			case 1:
				System.out.println("请输入存款金额:");
				double money = input.nextDouble();
				Acc.setMoney(oldMoney, money);
				oldMoney+=money;
				break;
			case 2:
				System.out.println("请输入取款金额:");
				double money1 = input.nextDouble();
				Acc.getMoney(oldMoney, money1);
				oldMoney-=money1;
				break;
			case 0:
				System.out.println("谢谢使用!");
				break a;
				
			}
		}
	}
}
