package objectExercise;

public class Land extends RealEstate {
	private String type;
	private double breadth;
	
	
	public Land(String name, String owner, int price, double breadth) {
		super(name, owner, price);
		this.type = "土地";
		this.breadth = breadth;
	}
	
	//ゲッター
	public String getType() {
		return this.type;
	}
	
	public double getBreadth() {
		return this.breadth;
	}
	
	
	//セッター
	public void setType(String type) {
		this.type = type;
	}
	
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	
	
	//表示
	public void printType() {
		System.out.println("物件種別：" + getType());
	}
	
	public void printBreadth() {
		System.out.println("広さ：" + getBreadth() + "㎡");
	}
	
	//一括表示
	public void printAll() {
		printPartition();
		printName();
		printOwner();
		printType();
		printPrice();
		printBreadth();
		printPartition();
	}
}
