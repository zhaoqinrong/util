package bank.com;

public class Account {
	public boolean getMoney(double oldMoney,double newMoney){
		boolean flag = false;
		if(oldMoney >= newMoney){
        System.out.println("ȡ��ɹ�,�������Ϊ:"+(oldMoney-newMoney));
        flag = true;
		}else{
			System.out.println("��������");
		}
		return flag;	
	} 
	public boolean setMoney(double oldMoney,double newMoney){
		boolean flag = false;
		if(newMoney>0){
			System.out.println("���ɹ�,�������Ϊ:"+(oldMoney+newMoney));
			flag = true;
		}else{
			System.out.println("���������!");
		}
		return flag;
	}
}
