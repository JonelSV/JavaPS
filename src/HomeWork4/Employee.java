package HomeWork4;



	public class Employee extends Person implements PersonInterface {

	    private final static String organization = "Per Scholas";

	    private int id;
	    private double salary;

	    public Employee(String name, int age, char gender, int id, double salary) {
	        super(name, age, gender);
	        this.id = id;
	        this.salary = salary;
	    }

	    public int getId() {
	        return id;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    public void setSalary(double salary) {
	        this.salary = salary;
	    }

	    @Override
	    public double calculate(int number) {
	        return 0;
	    }

	  
	
	
}
