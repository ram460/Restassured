package pojoClassforparsing;

public class EmployeeDetails
{
	//1.Declare global variable
String eName;
String eId;
int phoneNo;
String email;
String address;
String SpouseDetails;

//2.create constructor to initialize the variables
public EmployeeDetails(String eName, String eId, int phoneNo, String email, String address) {
	
	this.eName = eName;
	this.eId = eId;
	this.phoneNo = phoneNo;
	this.email = email;
	this.address = address;
}
public EmployeeDetails()
{
	
}
public String geteName() {
	return eName;
}
public void seteName(String eName) {
	this.eName = eName;
}
public String geteId() {
	return eId;
}
public void seteId(String eId) {
	this.eId = eId;
}
public long getPhoneNo() {
	return phoneNo;
}
public void setPhoneNo(int phoneNo) {
	this.phoneNo = phoneNo;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getaddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}









}