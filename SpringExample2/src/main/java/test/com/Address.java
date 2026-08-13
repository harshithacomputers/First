package test.com;

public class Address {
	private String street;
	private String city;
	
	public Address() {
		
	}

	public Address(String street, String city) {
		
		this.street = street;
		this.city = city;
	}
	public void call() {
		System.out.println("Street:"+street+"city :"+city);
	

}
}