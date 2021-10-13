package classes;

public class Person {
	String name;
	String lastName;
	String cellphone;
	String email;
	String direction;
	
	public Person(String name, String lastName, String cellphone, String email, String direction) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.cellphone = cellphone;
		this.email = email;
		this.direction = direction;
	}

	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}

	public String getCellphone() {
		return cellphone;
	}

	public String getEmail() {
		return email;
	}

	public String getDirection() {
		return direction;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}
	
	public String toString() {
		return this.name+" "+this.lastName;
	}
}
