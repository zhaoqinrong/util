package darkhorse;

public class demo7_Employee {
	public static void main(String[] args){
		Employee E1=new Employee();
		E1.setName("张三");
		E1.setId("A007");
		E1.setGalary(20000);
		E1.show();
		Employee E2=new Employee("李四","A008",25000);
		E2.show();
	}
}
/*姓名 name
 * 工号 id
 * 工资 galary
 */
class Employee{
	private String name;
	private String id;
	private double galary;
	 public Employee() {	//无参构造
		 
	 }
	 //有参构造
	 public Employee(String name,String id,double galary){
		 this.name=name;
		 this.id=id;
		 this.galary=galary;
	 }
	 public void setName(String name){//设置名字
		 this.name=name;
	 }
	 public String getName(){//get name方法
		 return name;
	 }
	 public void setId(String id){//set id方法
		 this.id=id;
	 }
	 public String getId(){ //get id方法
		 return id;
	 }
	 public void setGalary(double galary){ //set galary方法
		 this.galary=galary;
	 }
	 public double getGalary(){  //get galary方法
		 return galary;
	 }
	 public void show(){
		 System.out.println("我叫"+name+"\t"+"我的工号为"+id+"\t"+"月薪"+galary+"\t");
	 }
}
