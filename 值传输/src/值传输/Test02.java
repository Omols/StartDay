package 值传输;

public class Test02 {

	public static void main(String[] args) {
		Hero hero = new Hero("剑仙",350);
		Weapon weapon  = new Weapon("守誓剑",9000);
		//把两个对象关联起来
		hero.setWeapon(weapon);
		weapon.setHero(hero);
		
		//通过英雄来获取他的信息
		String name = hero.getName();
		int age = hero.getAge();
		Weapon w = hero.getWeapon();
		System.out.println("英雄名为：" + name + ",年龄：" + age + "岁");
		System.out.println("英雄武器为:" + w.getName() + ",是传承了" + w.getGrade() + "年的神兵");
	}

//英雄类
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
//武器类
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
