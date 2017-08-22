package darkhorse;

import java.util.Scanner;

public class Demo_Arectangle {
	public static void main(String[] args) {
		Arectangle A1 = new Arectangle();
		Scanner input = new Scanner(System.in);

		boolean con;
		do {
			con = false;
			System.out.print("请输入长方形的长:");
			int a = input.nextInt();
			System.out.print("请输入长方形的宽:");
			int b = input.nextInt();
			A1.setLength(a);
			A1.setWide(b);
			System.out.println("面积是:" + A1.getArea() + "\n" + "周长是:"
					+ A1.getZhouchang());
			System.out.println("是否需要继续计算?y/n");
			char c = input.next().charAt(0);
			con = (c == 'y' ? true : false);
		} while (con);
	}

}

class Arectangle {
	private int length;
	private int wide;
	static int i = 0;

	public Arectangle() { // 无参构造

	}

	public Arectangle(int length, int wide) { // 有参构造
		this.length = length;
		this.wide = wide;
	}

	public void setLength(int length) { // 设置长
		this.length = length;
	}

	public int getLength() { // 获取长
		return length;
	}

	public void setWide(int wide) { // 设置宽
		this.wide = wide;
	}

	public int getWide() { // 获取宽
		return wide;
	}

	public int getArea() {
		return length * wide;
	}

	public int getZhouchang() {
		return (length + wide) * 2;
	}

}
