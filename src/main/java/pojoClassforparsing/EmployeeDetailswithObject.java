package pojoClassforparsing;

public class EmployeeDetailswithObject 
{
String eName;
String eid;
int[]pNo;
String[]eMail;
Object Spouse;
public EmployeeDetailswithObject(String eName, String eid, int[] pNo, String[] eMail, Object spouse) {
	super();
	this.eName = eName;
	this.eid = eid;
	this.pNo = pNo;
	this.eMail = eMail;
	Spouse = spouse;
}
public String geteName() {
	return eName;
}
public void seteName(String eName) {
	this.eName = eName;
}
public String getEid() {
	return eid;
}
public void setEid(String eid) {
	this.eid = eid;
}
public int[] getpNo() {
	return pNo;
}
public void setpNo(int[] pNo) {
	this.pNo = pNo;
}
public String[] geteMail() {
	return eMail;
}
public void seteMail(String[] eMail) {
	this.eMail = eMail;
}
public Object getSpouse() {
	return Spouse;
}
public void setSpouse(Object spouse) {
	Spouse = spouse;
}


}
