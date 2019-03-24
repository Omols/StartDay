package 抽象类;

public class Test2 {

	public static void main(String[] args) {
		Student stu = new Student("狗子", 12, "警卫");
		System.out.println(stu.talk());
	}

}

//定义一个抽象类
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
		return "学生--> 姓名：" + name + ",年龄" + age + ",职业：" + occupation;
	}
}