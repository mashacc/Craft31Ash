package encapsulation;

public class Car {
private String model;
private int year;

// constructor
public Car(Class<Integer> class1, int year) {
	this.model = class1();
	this.year = year;
}
	
private String class1() {
	// TODO Auto-generated method stub
	return null;
}

public String getModel() {
	return model;
}

public void setModel(String model) {
	this.model = model;
}

public int getYear() {
	return year;
}
public void setYear(int year) {

	if (year >= 2000 || year <= 2025) {
		this.year = year;
	}
	System.out.print("you are only allowed to enter from 2000 til 2025");}



public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
