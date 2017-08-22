package jiaoCai;

public class Jd_3 {
	public static void main(String[] args) {
		CurrentTimes Cu = new CurrentTimes();
		 Cu.show();
	}
}
class CurrentTimes{
	String time;
	public void show(){
		time="2015年5月12日10点11分00秒";
		System.out.print("当前时间为:"+time);
	}
}
