package 继承;

import java.util.Arrays;
public class Test02 {

	public static void main(String[] args) {
		ImportCosmeticManager cm = new ImportCosmeticManager();
		cm.add(new Cosmetic("香奈儿","进口",1108));
		cm.add(new Cosmetic("圣罗兰","进口",870));
		cm.add(new Cosmetic("大宝","国产",20));
		cm.add(new Cosmetic("万紫千红","国产",15));
		cm.printInfo();
	}

}

//可输出纯进口化妆品的管理类
class ImportCosmeticManager extends CosmeticManager {
	public void printInfo() {
		//比较两个字符串的值是否相等，不能使用==	要使用equals()
		for(int i=0; i<count; i++) {
			if("进口".equals(cs[i].getType())) {
				System.out.println(cs[i].getInfo());
			}
		}
	}
	
}

//可按单价排序的化妆品管理类
class SortCosmticManager extends CosmeticManager{
	//排序输出所有商品
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

//化妆品类
class Cosmetic{
	private String name;	//名称
	private String type;	//进口/国产
	private double price;	//单价
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
		return "商品名称：" + name +"	"+ "类型：" + type + "	"+"商品价格:" + price ;
	}
	
}

//化妆品管理类
class CosmeticManager{
	protected Cosmetic[] cs = new Cosmetic[4];
	protected int count = 0;
	//进货
	public void add(Cosmetic c) { 
		int size = cs.length;
		if(count>=size) {
			int newLen = size*2;
			cs = Arrays.copyOf(cs,newLen);
		}
		cs[count] = c;
		count++;
	}
	//输出所有商品
	public void printInfo() {
		for(int i = 0; i<count; i++) {
			System.out.println(cs[i].getInfo());
		}
	}
	
	
}