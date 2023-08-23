package Encapsulation;

public class ClassA {

	private int value;// Data hiding
	private String Name;

	public void setvalue(int x) { // Data Abstraction

		value = x; // Setters
	}

	public void setName(String S) { // Data Abstraction

		Name = S;
	}

	public int getvalue() {

		return value; // Getters
	}

	public String getName() {

		return Name;
	}
}

// In encapsulation the data member and the member method in class wrap as the single unit
// is know as encapsulation.
