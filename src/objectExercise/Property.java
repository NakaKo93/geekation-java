package objectExercise;

public class Property {
	private String name;
	private String owner;
	private int price;
	
	
	public Property(String name, String owner, int price) {
		this.name = name;
		this.owner = owner;
		this.price = price;
	}
	
	
	//ゲッター
	public String getName() {
		return this.name;
	}
	
	public String getOwner() {
		return this.owner;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	
	//セッター
	public void setName(String name) {
		this.name = name;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void settPrice(int price) {
		this.price = price;
	}
}
