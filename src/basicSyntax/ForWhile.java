package basicSyntax;

public class ForWhile {

	public static void main(String[] args) {
		int num = 1;
		
		while (num <= 100) {
			if ((num % 3 == 0) && (num % 5 == 0)) {
				System.out.println("FizzBuzz");
			} else if (num % 3 == 0) {
				System.out.println("Fizz");
			} else if (num % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(num);
			}
			
			num++;
		}
		
		String[] programs = {"Ruby", "Golang", "Java", "Python", "Typescript", "HTML", "Javascript"};
		
	    for (String program: programs) {
	        if (program == "Java") {
	        	System.out.println("現在学習中の言語はJavaです。");
	        	continue;
	        } else if (program =="HTML") {
	        	System.out.println("HTMLはプログラミング言語ではありません。");
	        	break;
	        }
	        
	        System.out.println(program);
	    }
	}
}
