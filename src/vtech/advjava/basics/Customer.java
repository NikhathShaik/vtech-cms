package vtech.advjava.basics;

public class Customer {
	int cusId;
	String cusName;
	String cusAdd;
	long CusPhone;
	String email;
	public Customer(int cusId, String cusName, String cusAdd, long cusPhone, String email) {
		super();
		this.cusId = cusId;
		this.cusName = cusName;
		this.cusAdd = cusAdd;
		CusPhone = cusPhone;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [cusId=" + cusId + ", cusName=" + cusName + ", cusAdd=" + cusAdd + ", CusPhone=" + CusPhone
				+ ", email=" + email + "]";
	}
	public int getCusId() {
		return cusId;
	}
	public void setCusId(int cusId) {
		this.cusId = cusId;
	}
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public String getCusAdd() {
		return cusAdd;
	}
	public void setCusAdd(String cusAdd) {
		this.cusAdd = cusAdd;
	}
	public long getCusPhone() {
		return CusPhone;
	}
	public void setCusPhone(long cusPhone) {
		CusPhone = cusPhone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
