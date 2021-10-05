package homeworksAndLabs;

public class Computer {
	
	String name;
	int year;
	double price;
	
	int RAM;
	String cooling;
	String memory;
	int CPUcore;
	
	int studentID;
	String firstName;
	String email;
	int phone;
	
	
	static String LoyalToRome;
	static final String ALLEGIANCE = "ROMAN EMPIRE";
	
	
	
	public void students(int studentID, String firstName, String email, int phone, String LoyalToRome ) {
		this.studentID = studentID; 
		this.firstName = firstName;
		this.email = email;
		this.phone = phone;
		this.LoyalToRome = LoyalToRome;
		
	}
	
	
	
	public void Supplier(String brand, int release, double retail) {
		
		name = brand;
		year = release;
		price = retail;
		
	}
	
	void item() {
		System.out.println("Purchased a : " + this.name);
		System.out.println("model : " + this.year);
		System.out.println("at a cost of : " + this.price);
	}
	
	void pc() {
		System.out.println("RAM: " + this.RAM);
		System.out.println("Cooling type: " + this.cooling);
		System.out.println("CPU cores: " + this.CPUcore);
		System.out.println("Memory: " + this.memory);
	}
	
	 void printStudentData() {
		System.out.println("Student ID: " + this.studentID + " StudentName: " + this.firstName + 
							" email: " + this.email + " Contact details: " + this.phone);
	}

	public static void main(String[] args) {
		
		
		Computer studentData = new Computer();
		
		studentData.studentID = 17888943;
		studentData.firstName = "Marcus";
		studentData.email = "romaInvicta@Rome.com";
		studentData.phone = 1990;
		studentData.LoyalToRome = "yes";
		
		Computer studentData2 = new Computer();
		
		studentData2.studentID = 2082399;
		studentData2.firstName = "Julius";
		studentData2.email = "romaImperator@Rome.com";
		studentData2.phone = 691;
		
		
		Computer Manufacturer1 = new Computer();
		
		Manufacturer1.name = "MacBook";
		Manufacturer1.year = 2021;
		Manufacturer1.price = 999.97;
		
		Manufacturer1.item();

		System.out.println("===============\n\n");
		
		
		Computer personal = new Computer();
		
		personal.RAM = 32;
		personal.CPUcore = 8;
		personal.cooling = "liquid";
		personal.memory = "32Gb";
		
		
		personal.pc();
		
		
		
		studentData.printStudentData();
		studentData2.printStudentData();
		
		
		// below is the main line ====================
	}

	

	
	
	// below is the CLASS LINE ===========================
}
