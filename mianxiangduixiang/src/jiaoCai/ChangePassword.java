package jiaoCai;

import java.util.Scanner;

public class ChangePassword {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);//�½�һ��ɨ����
		Administrator admin=new Administrator();//�½�һ��Administrator
		admin.name="admin";//����ֵ
		admin.password="111111";//����ֵ
		System.out.print("�������û�����");//��ʾ�����û���
		String nameInput=input.next();//�����û�������û���
		System.out.print("���������룺");//��ʾ��������
		String passWordInput=input.next();//�����û����������
		if(admin.name.equals(nameInput)&&admin.password.equals(passWordInput)){//�ж�������û����������Ƿ���ȷ
			System.out.print("�����������룺");
			admin.password=input.next();//����������
			System.out.print("�����޸ĳɹ�������������Ϊ��"+admin.password);
		}else{
			System.out.print("�û��������벻ƥ�䣡��û��Ȩ�޸��¹���Ա��Ϣ��");
		}
		
		
	}
}
