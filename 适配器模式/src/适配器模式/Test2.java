package ������ģʽ;

public class Test2 {

}

interface Animals{
	public void sing();
	public void run();
	public void eat();
	public void jump();
}

class Dog extends AnimalFunction{
	public void run() {
		System.out.println("i am a dog, i run");
	}
}
//������
class AnimalFunction{
	public void sing() {}
	public void run() {}
	public void eat() {}
	public void jump() {}
}