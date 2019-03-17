
public class Test01 {
	public static final int PERSON_NUM = 10;
	public static void main(String[] args) {
		System.out.println(Test01.PERSON_NUM);
		
	}

}

//常量类(工具类)
class Constant{
	public static final int PERSON_NUM = 10;	//人数 
}

class FinalClass{
	public final int DAY_NUMBER;
	public FinalClass(){
		DAY_NUMBER = 10;
	}
}