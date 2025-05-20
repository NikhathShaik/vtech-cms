package vtech.advjava.basics.examples.a1;

public class Address {
	int streetNo;
	String city;
	String state;
	long pincode;
	
	public Address(int streetNo, String city, String state, long pincode) {
		super();
		this.streetNo = streetNo;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [streetNo=" + streetNo + ", city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}
	
}
