package jiaoCai_2;

import java.util.Scanner;


class Menu{
	//��ʾ��¼���棬��ʵ���л�
	public void showLoginMenu(){
		System.out.println("\t\t��ӭʹ���������ع������ϵͳ");
		System.out.println("\t\t\t\t1.��¼ϵͳ");
		System.out.println("\t\t\t\t2.�˳�");
		System.out.println("*****************************************************************************");
		
		boolean con=false;
		do{
			System.out.println("\n��ѡ�����������֣�");
			Scanner input=new Scanner(System.in);
			int no=input.nextInt();
			switch(no){
			case 1:
				showMainMenu();
				break;
			case 2:
				System.out.println("�˳�ϵͳ");
				break;
			default:
				System.out.println("��������������������֣�");
				con=true;
				break;
				
			}
		}while(con==true);
	}
	//��ʾ���˵�����ʵ���л�
	public void showMainMenu(){
		System.out.println("\t\t��ӭʹ���������ع������ϵͳ\n");
		System.out.println("*****************************************************************************\n");
		System.out.println("\t\t\t\t1.�ͷ���Ϣ����");
		System.out.println("\t\t\t\t2.�������");
		
		boolean con=false;
		do{
			System.out.println("��ѡ���������ֻ�0������һ���˵���");
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
				System.out.println("��������������������֣�");
				con=true;
				break;
				
			}
		}while(con==true);
	}
	
	//��ʾ�ͷ���Ϣ������ʵ���л�
	public void showCustMMenu(){
		System.out.println("\t\t��ӭʹ���������ع������ϵͳ>�ͷ�����ϵͳ\n");
		System.out.println("*****************************************************************************\n");
		System.out.println("\t\t\t\t1.��ʾ���пͷ���Ϣ");
		System.out.println("\t\t\t\t2.��ӿͷ���Ϣ");
		System.out.println("\t\t\t\t3.�޸Ŀͷ���Ϣ");
		System.out.println("\t\t\t\t4.��ѯ�ͷ���Ϣ");
		System.out.println("*****************************************************************************\n");
		
		boolean con=false;
		do{
			System.out.print("��ѡ���������ֻ�0������һ���˵���");
			Scanner input=new Scanner(System.in);
			int no=input.nextInt();
			switch(no){
			case 1:
				System.out.println("��ʾ���пͷ���Ϣ");
				break;
			case 2:
				System.out.println("��ӿͷ���Ϣ");
				break;
			case 3:
				System.out.println("�޸Ŀͷ���Ϣ");
				break;
			case 4:
				System.out.println("��ѯ�ͷ���Ϣ");
				break;
			case 0:
				showLoginMenu();
				break;
			default:
				System.out.println("��������������������֣�");
				con=true;
				break;
				
			}
		}while(con==true);
	}
	//ʵ����������˵�����ʵ���л�
	public void showSendGMenu(){
		System.out.println("\t\t��ӭʹ���������ع������ϵͳ>�������\n");
		System.out.println("*****************************************************************************\n");
		System.out.println("\t\t\t\t1.���˴����");
		System.out.println("\t\t\t\t2.���˳齱");
		System.out.println("\t\t\t\t3.�����ʺ�");
		System.out.println("*****************************************************************************\n");
		
		boolean con=false;
		do{
			System.out.println("��ѡ���������ֻ�0������һ���˵���");
			Scanner input=new Scanner(System.in);
			int no=input.nextInt();
			switch(no){
			case 1:
				System.out.println("���˴����");
				break;
			case 2:
				System.out.println("���˳齱");
				break;
			case 3:
				System.out.println("�����ʺ�");
				break;
			case 0:
				showLoginMenu();
				break;
			default:
				System.out.println("��������������������֣�");
				con=true;
				break;
				
			}
		}while(con==true);
		
	}
}
