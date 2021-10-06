package GetterAndSetter;

public class Main {

	public static void main(String[] args) {
		
		
		Computer computer1 = new Computer();
		
		computer1.setName("Macbook");
		computer1.setYear(2021);
		computer1.setCost(2998.96);
		
		
		System.out.println("Name of Product: " + computer1.getName());
		System.out.println("Model number : " + computer1.getYear());
		System.out.printf("Retail price: $ %.2f: " , computer1.getCost());
		
		
	}

}
