package objectExercise;

public class Main {
	
	public static void main(String[] args) {
		String name1 = "いい感じアパートメント";
		String owner1 = "山田 マンション太郎";
		int price1 = 50000000;
		String floorPlan = "3LDK";
		
		Apartment apartment = new Apartment(name1, owner1, price1, floorPlan);
		apartment.printAll();
		
		String name2 = "いい感じの土地";
		String owner2 = "山田 土地太郎";
		int price2 = 8000000;
		double breadth = 105.2;
		
		Land land = new Land(name2, owner2, price2, breadth);
		land.printAll();
	}
}
