package jiaoCai_2;

import java.util.Arrays;

public class StudentAdmin {
	public void sortName(String[] names){
		for (int i = 0; i < names.length-1; i++) {
			for (int j = 0; j < names.length-1-i; j++) {
				if(names[j].compareToIgnoreCase(names[j+1]) > 0){
					String temp = names[j];
					names[j] = names[j+1];
					
					names[j+1] = temp;
				}
			}

		}

	}
	public void show(String[] a){
		for (int i = 0; i < a.length; i++) {
			if(a[i] != null)
				System.out.print(a[i]+"\t");
		}
		System.out.println();
	}
}
