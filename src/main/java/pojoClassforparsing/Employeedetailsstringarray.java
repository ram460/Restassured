package pojoClassforparsing;

public class Employeedetailsstringarray 
{
	 int phoneNo;
	 int salary;
	 String eId;
	 String [] email;
	 String address;
	public Employeedetailsstringarray(int phoneNo, int salary, String eId, String[] email, String address) {
		
		this.phoneNo = phoneNo;
		this.salary = salary;
		this.eId = eId;
		this.email = email;
		this.address = address;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String geteId() {
		return eId;
	}
	public void seteId(String eId) {
		this.eId = eId;
	}
	public String[] getEmail() {
		return email;
	}
	public void setEmail(String[] email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	 
}
