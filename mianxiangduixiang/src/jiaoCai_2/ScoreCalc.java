package jiaoCai_2;

public class ScoreCalc {
	int java;//保存java成绩
	int db;//保存DB成绩
	int c;//保存C语言成绩
	//计算总成绩并返回
	public int CalcTotal(){
		int total=java+db+c;
		return total;
	}
	//计算平均值并返回
	public double CalcAvg(){
		double Avg=(java+db+c)/3.0;
		return Avg;
	}
	//显示总成绩
	public void ShowTotal(){
		System.out.println("总成绩是："+CalcTotal());
		
	}
	//显示平均值
	public void ShowAvg(){
		System.out.println("平均成绩是："+CalcAvg());
	}
	
}
