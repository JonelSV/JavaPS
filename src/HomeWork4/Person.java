package HomeWork4;

public class Person {

	String name;
	int age;
	char gender;
	
	

	public Person(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender =gender;
		
		
	}
	
	void display() {
		System.out.println("Name: " + this.name);
		System.out.println("Gender: " + this.gender);
		System.out.println("Age: " + this.age);
		
	}

	public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }
	
	
	
}
