package ֵ����;

public class Test02 {

	public static void main(String[] args) {
		Hero hero = new Hero("����",350);
		Weapon weapon  = new Weapon("���Ľ�",9000);
		//�����������������
		hero.setWeapon(weapon);
		weapon.setHero(hero);
		
		//ͨ��Ӣ������ȡ������Ϣ
		String name = hero.getName();
		int age = hero.getAge();
		Weapon w = hero.getWeapon();
		System.out.println("Ӣ����Ϊ��" + name + ",���䣺" + age + "��");
		System.out.println("Ӣ������Ϊ:" + w.getName() + ",�Ǵ�����" + w.getGrade() + "������");
	}

//Ӣ����
static class Hero{
	
	private String name;
	private int age;
	private Weapon weapon;
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	public Weapon getWeapon() {
		return weapon;
	}
	public Hero() {}
	public Hero(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() { 
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
//������
static class Weapon{
	
	private String name;
	private int grade;
	private Hero hero;
	public void setHero(Hero hero) {
		this.hero = hero;
	}
	public Hero getHero() {
		return hero;
	}
	public Weapon() {}
	public Weapon(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
}

}
