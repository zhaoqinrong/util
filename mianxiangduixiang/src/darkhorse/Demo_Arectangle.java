package darkhorse;

import java.util.Scanner;

public class Demo_Arectangle {
	public static void main(String[] args) {
		Arectangle A1 = new Arectangle();
		Scanner input = new Scanner(System.in);

		boolean con;
		do {
			con = false;
			System.out.print("�����볤���εĳ�:");
			int a = input.nextInt();
			System.out.print("�����볤���εĿ�:");
			int b = input.nextInt();
			A1.setLength(a);
			A1.setWide(b);
			System.out.println("�����:" + A1.getArea() + "\n" + "�ܳ���:"
					+ A1.getZhouchang());
			System.out.println("�Ƿ���Ҫ��������?y/n");
			char c = input.next().charAt(0);
			con = (c == 'y' ? true : false);
		} while (con);
	}

}

class Arectangle {
	private int length;
	private int wide;
	static int i = 0;

	public Arectangle() { // �޲ι���

	}

	public Arectangle(int length, int wide) { // �вι���
		this.length = length;
		this.wide = wide;
	}

	public void setLength(int length) { // ���ó�
		this.length = length;
	}

	public int getLength() { // ��ȡ��
		return length;
	}

	public void setWide(int wide) { // ���ÿ�
		this.wide = wide;
	}

	public int getWide() { // ��ȡ��
		return wide;
	}

	public int getArea() {
		return length * wide;
	}

	public int getZhouchang() {
		return (length + wide) * 2;
	}

}
