package ������;

public class Test2 {

	public static void main(String[] args) {
		Student stu = new Student("����", 12, "����");
		System.out.println(stu.talk());
	}

}

//����һ��������
abstract class Person1{
	String name;
	int age;
	String occupation;
	public Person1(String name,int age,String occupation) {
		this.name = name;
		this.age = age;
		this.occupation = occupation;
	}
	public abstract String talk();
}

class Student extends Person1{
	public Student(String name,int age,String occupation) {
		super(name,age,occupation);
	}
	public String talk() {
		return "ѧ��--> ������" + name + ",����" + age + ",ְҵ��" + occupation;
	}
}