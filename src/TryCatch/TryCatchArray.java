package TryCatch;

public class TryCatchArray {

	public static void main(String[] args) {
		
		int[] myNum = {10, 20, 30, 40};
		
		String[] list = {"occurence", "handle", "error", "catch"};
		
		String input = "22";
		
		System.out.println("Hellow World");
		
		try {
			int number = Integer.parseInt(input);
			System.out.println("Error: NumberFormatException, parseInt not right");
		}catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
			
		
		try {
		
		System.out.println(myNum[6]);
		}catch(Exception ArrayIndexOutOfBounds) {
			System.out.println("Error: Array is out of bounds");
		}finally {
			System.out.println("This is the finally bit and it will run any code in here and disregard exceptions above it");
		}
	
		
		System.out.println("This is the bottom and it still runs up until here");
		
	}

}