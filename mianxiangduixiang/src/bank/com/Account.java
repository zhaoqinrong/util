package bank.com;

public class Account {
	public boolean getMoney(double oldMoney,double newMoney){
		boolean flag = false;
		if(oldMoney >= newMoney){
        System.out.println("取款成功,卡上余额为:"+(oldMoney-newMoney));
        flag = true;
		}else{
			System.out.println("卡上余额不足");
		}
		return flag;	
	} 
	public boolean setMoney(double oldMoney,double newMoney){
		boolean flag = false;
		if(newMoney>0){
			System.out.println("存款成功,卡上余额为:"+(oldMoney+newMoney));
			flag = true;
		}else{
			System.out.println("存款金额有误!");
		}
		return flag;
	}
}
