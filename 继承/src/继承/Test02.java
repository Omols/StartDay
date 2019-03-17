package �̳�;

import java.util.Arrays;
public class Test02 {

	public static void main(String[] args) {
		ImportCosmeticManager cm = new ImportCosmeticManager();
		cm.add(new Cosmetic("���ζ�","����",1108));
		cm.add(new Cosmetic("ʥ����","����",870));
		cm.add(new Cosmetic("��","����",20));
		cm.add(new Cosmetic("����ǧ��","����",15));
		cm.printInfo();
	}

}

//����������ڻ�ױƷ�Ĺ�����
class ImportCosmeticManager extends CosmeticManager {
	public void printInfo() {
		//�Ƚ������ַ�����ֵ�Ƿ���ȣ�����ʹ��==	Ҫʹ��equals()
		for(int i=0; i<count; i++) {
			if("����".equals(cs[i].getType())) {
				System.out.println(cs[i].getInfo());
			}
		}
	}
	
}

//�ɰ���������Ļ�ױƷ������
class SortCosmticManager extends CosmeticManager{
	//�������������Ʒ
	public void printInfo(){
		Cosmetic[] temp = Arrays.copyOf(cs, count);
		Cosmetic c = null;
		for(int i=0; i<temp.length -1; i++) {
			for(int j=0; j<temp.length-i -1; j++) {
				if(temp[j].getPrice() > temp[j+1].getPrice()) {
					c = temp[j];
					temp[j] = temp[j+1];
					temp[j+1] = c;
				}
			}
		}
		for(Cosmetic cosmetic:temp) {
			System.out.println(cosmetic.getInfo());
		}
	}
}

//��ױƷ��
class Cosmetic{
	private String name;	//����
	private String type;	//����/����
	private double price;	//����
	public Cosmetic(String name,String type,double price){
		this.name = name;
		this.type = type;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getInfo() {
		return "��Ʒ���ƣ�" + name +"	"+ "���ͣ�" + type + "	"+"��Ʒ�۸�:" + price ;
	}
	
}

//��ױƷ������
class CosmeticManager{
	protected Cosmetic[] cs = new Cosmetic[4];
	protected int count = 0;
	//����
	public void add(Cosmetic c) { 
		int size = cs.length;
		if(count>=size) {
			int newLen = size*2;
			cs = Arrays.copyOf(cs,newLen);
		}
		cs[count] = c;
		count++;
	}
	//���������Ʒ
	public void printInfo() {
		for(int i = 0; i<count; i++) {
			System.out.println(cs[i].getInfo());
		}
	}
	
	
}