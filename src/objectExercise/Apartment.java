package objectExercise;

public class Apartment extends RealEstate {
	private String type;
	private String floorPlan;
	
	
	public Apartment(String name, String owner, int price, String floorPlan) {
		super(name, owner, price);
		this.type = "アパート";
		this.floorPlan = floorPlan;
	}
	
	
	//ゲッター
	public String getType() {
		return this.type;
	}
	
	public String getFloorPlan() {
		return this.floorPlan;
	}
	
	
	//セッター
	public void setType(String type) {
		this.type = type;
	}
	
	public void seFloorPlan(String floorPlan) {
		this.floorPlan = floorPlan;
	}
	
	
	//表示
	public void printType() {
		System.out.println("物件種別：" + getType());
	}
	
	public void printFloorPlan() {
		System.out.println("間取り：" + getFloorPlan());
	}
	
	//一括表示
	public void printAll() {
		printPartition();
		printName();
		printOwner();
		printType();
		printPrice();
		printFloorPlan();
		printPartition();
	}
}
