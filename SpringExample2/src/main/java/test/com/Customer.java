package test.com;

public class Customer {
	private int id;
	private String name;
	private String email;
	private Address address;
	
	public Customer() {
	
	}

	public Customer(int id, String name, String email, Address address) {
	
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
	}
public void get() {
	System.out.println("ID :"+id+"Name :"+name+"Email :"+email);
	address.call();
}
	
	

}
