package darkhorse;

public class demo7_Employee {
	public static void main(String[] args){
		Employee E1=new Employee();
		E1.setName("����");
		E1.setId("A007");
		E1.setGalary(20000);
		E1.show();
		Employee E2=new Employee("����","A008",25000);
		E2.show();
	}
}
/*���� name
 * ���� id
 * ���� galary
 */
class Employee{
	private String name;
	private String id;
	private double galary;
	 public Employee() {	//�޲ι���
		 
	 }
	 //�вι���
	 public Employee(String name,String id,double galary){
		 this.name=name;
		 this.id=id;
		 this.galary=galary;
	 }
	 public void setName(String name){//��������
		 this.name=name;
	 }
	 public String getName(){//get name����
		 return name;
	 }
	 public void setId(String id){//set id����
		 this.id=id;
	 }
	 public String getId(){ //get id����
		 return id;
	 }
	 public void setGalary(double galary){ //set galary����
		 this.galary=galary;
	 }
	 public double getGalary(){  //get galary����
		 return galary;
	 }
	 public void show(){
		 System.out.println("�ҽ�"+name+"\t"+"�ҵĹ���Ϊ"+id+"\t"+"��н"+galary+"\t");
	 }
}
