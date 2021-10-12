package HomeWork4;

	public class Student extends Person implements PersonInterface {
		
	private int id;
	private double gpa;
	
	public Student(String name, int age, char gender, int id, double gpa) {
	    super(name, age, gender);
	    this.id = id;
	    this.gpa = gpa;
	}
	
	public int getId() {
	    return id;
	}
	
	public double getGPA() {
	    return gpa;
	}
	
	public void setGPA(double gpa) {
	    this.gpa = gpa;
	}
	
	@Override
	public double calculate(int n) {
	    return 0;
	}
	
	@Override
	public String toString() {
	    return "[Student - Name: "+ super.getName() + " | ID: " + this.getId() + " | GPA: " + this.getGPA() + "]";
	}
}


