package objectExercise;

public class RealEstate extends Property {
	
	
	public RealEstate(String name, String owner, int price) {
		super(name, owner, price);
	}


	//表示
	public void printPartition() {
		System.out.println("=============================");
	}
	
	public void printName() {
		System.out.println("物件名：" + getName());
	}
	
	public void printOwner() {
		System.out.println("物件所有者名：" + getOwner());
	}
	
	public void printPrice() {
		System.out.println("物件価格：" + getPrice() + "円");
	}
}