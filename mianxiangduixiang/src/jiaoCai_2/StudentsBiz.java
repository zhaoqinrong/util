package jiaoCai_2;
class Student{
	public int id;
	public String name;
	public int age;
	public int score;
	public void showInfo(){
		System.out.println(id+"\t"+name+"\t"+age+"\t"+score);
	}
	
}
public class StudentsBiz {
	Student[] students = new Student[30];
	public void addStudent(Student stu){
		for (int i = 0; i < students.length; i++) {
			if(students[i] == null){
				students[i] = stu;
				break;
			}
		}
	}
	public void show(){
		for (int i = 0; i < students.length; i++) {
			if(students[i] != null)
				students[i].showInfo();
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.name ="张三";
		stu1.id = 10;
		stu1.age=18;
		stu1.score=99;
		Student stu2 = new Student();
		stu2.name ="李四";
		stu2.age=19;
		stu2.id=11;
		stu2.score=100;
		StudentsBiz studentbiz = new StudentsBiz();
		studentbiz.addStudent(stu1);
		studentbiz.addStudent(stu2);
		studentbiz.show();
	}
}
	
