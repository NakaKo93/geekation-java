package basicSyntax;

public class MethodPractice {

	public static void main(String[] args) {
		int a = 16;
		int b = 8;
		
		int add = add(a, b);
		int subtract = subtract(a, b);
		int multiplied = multiplied(a, b);
		int division = division(a, b);
		
		print(add);
		print(subtract);
		print(multiplied);
		print(division);
	}
	
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static int subtract(int a, int b) {
		return a - b;
	}
	
	public static int multiplied(int a, int b) {
		return a * b;
	}
	
	public static int division(int a, int b) {
		return a / b;
	}
	
	public static void print(int a) {
		System.out.println( "計算結果は" + a + "です。");
	}
}
