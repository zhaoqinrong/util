package darkhorse;

public class demo1_phone {
	public static void main(String[] args){
		phone p1=new phone("锤子","红色",2999);
		p1.show();
		phone p2=new phone();
		p2.setName("iphone");
		p2.setColor("red");
		p2.setPrice(6999);
		p2.show();
		System.out.print("手机的名字是:"+p2.getName()+"\n"+"手机的颜色为:"+p2.getColor()+"\n"+"手机的价格为:"+p2.getPrice());
	}
}
class phone{
	private String name;
	private String color;
	private int price;
	public phone(){
		
	}
	public phone(String name,String color,int price){
		this.name=name;
		this.color=color;
		this.price=price;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setColor(String color){
		this.color=color;
	}
	public String getColor(){
		return color;
	}
	public void setPrice(int price){
		this.price=price;
	}
	public int getPrice(){
		return price;
	}
	public void show(){
		System.out.println("手机的名字:"+name+"\n"+"手机的颜色是:"+color+"\n"+"手机的价格为:"+price);
	}
}
