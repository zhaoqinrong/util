package jiaoCai_2;

public class ScoreCalc {
	int java;//����java�ɼ�
	int db;//����DB�ɼ�
	int c;//����C���Գɼ�
	//�����ܳɼ�������
	public int CalcTotal(){
		int total=java+db+c;
		return total;
	}
	//����ƽ��ֵ������
	public double CalcAvg(){
		double Avg=(java+db+c)/3.0;
		return Avg;
	}
	//��ʾ�ܳɼ�
	public void ShowTotal(){
		System.out.println("�ܳɼ��ǣ�"+CalcTotal());
		
	}
	//��ʾƽ��ֵ
	public void ShowAvg(){
		System.out.println("ƽ���ɼ��ǣ�"+CalcAvg());
	}
	
}
