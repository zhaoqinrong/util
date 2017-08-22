package jiaoCai_2;

import java.util.Scanner;


class Menu{
	//显示登录界面，并实现切换
	public void showLoginMenu(){
		System.out.println("\t\t欢迎使用我行我素购物管理系统");
		System.out.println("\t\t\t\t1.登录系统");
		System.out.println("\t\t\t\t2.退出");
		System.out.println("*****************************************************************************");
		
		boolean con=false;
		do{
			System.out.println("\n请选择，请输入数字：");
			Scanner input=new Scanner(System.in);
			int no=input.nextInt();
			switch(no){
			case 1:
				showMainMenu();
				break;
			case 2:
				System.out.println("退出系统");
				break;
			default:
				System.out.println("输入错误！请重新输入数字：");
				con=true;
				break;
				
			}
		}while(con==true);
	}
	//显示主菜单，并实现切换
	public void showMainMenu(){
		System.out.println("\t\t欢迎使用我行我素购物管理系统\n");
		System.out.println("*****************************************************************************\n");
		System.out.println("\t\t\t\t1.客服信息管理");
		System.out.println("\t\t\t\t2.真情回馈");
		
		boolean con=false;
		do{
			System.out.println("请选择，输入数字或按0返回上一级菜单：");
			Scanner input=new Scanner(System.in);
			int no=input.nextInt();
			switch(no){
			case 1:
				showCustMMenu();
				break;
			case 2:
				showSendGMenu();
				break;
			case 0:
				showLoginMenu();
				break;
			default:
				System.out.println("输入错误！请重新输入数字：");
				con=true;
				break;
				
			}
		}while(con==true);
	}
	
	//显示客服信息管理，并实现切换
	public void showCustMMenu(){
		System.out.println("\t\t欢迎使用我行我素购物管理系统>客服管理系统\n");
		System.out.println("*****************************************************************************\n");
		System.out.println("\t\t\t\t1.显示所有客服信息");
		System.out.println("\t\t\t\t2.添加客服信息");
		System.out.println("\t\t\t\t3.修改客服信息");
		System.out.println("\t\t\t\t4.查询客服信息");
		System.out.println("*****************************************************************************\n");
		
		boolean con=false;
		do{
			System.out.print("请选择，输入数字或按0返回上一级菜单：");
			Scanner input=new Scanner(System.in);
			int no=input.nextInt();
			switch(no){
			case 1:
				System.out.println("显示所有客服信息");
				break;
			case 2:
				System.out.println("添加客服信息");
				break;
			case 3:
				System.out.println("修改客服信息");
				break;
			case 4:
				System.out.println("查询客服信息");
				break;
			case 0:
				showLoginMenu();
				break;
			default:
				System.out.println("输入错误！请重新输入数字：");
				con=true;
				break;
				
			}
		}while(con==true);
	}
	//实现真情回馈菜单，并实现切换
	public void showSendGMenu(){
		System.out.println("\t\t欢迎使用我行我素购物管理系统>真情回馈\n");
		System.out.println("*****************************************************************************\n");
		System.out.println("\t\t\t\t1.幸运大放送");
		System.out.println("\t\t\t\t2.幸运抽奖");
		System.out.println("\t\t\t\t3.生日问候");
		System.out.println("*****************************************************************************\n");
		
		boolean con=false;
		do{
			System.out.println("请选择，输入数字或按0返回上一级菜单：");
			Scanner input=new Scanner(System.in);
			int no=input.nextInt();
			switch(no){
			case 1:
				System.out.println("幸运大放送");
				break;
			case 2:
				System.out.println("幸运抽奖");
				break;
			case 3:
				System.out.println("生日问候");
				break;
			case 0:
				showLoginMenu();
				break;
			default:
				System.out.println("输入错误！请重新输入数字：");
				con=true;
				break;
				
			}
		}while(con==true);
		
	}
}
