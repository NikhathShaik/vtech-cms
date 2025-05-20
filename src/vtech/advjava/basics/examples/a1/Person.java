package vtech.advjava.basics.examples.a1;

public class Person {
	int personId;
	String personName;
	Address personAddress;
	public Person(int personId, String personName, Address personAddress) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.personAddress = personAddress;
	}
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", personAddress=" + personAddress + "]";
	}
	

}
