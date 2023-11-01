package pojoClassforparsing;

public class SpouseDetails 
{
	 
	 String spouseeName;
	 String spouseeId;
	 int spousephoneNo;
	 String spouseemail;
	 String spouseaddress;
	public SpouseDetails(String spouseeName, String spouseeId, int spousephoneNo, String spouseemail,
			String spouseaddress) {
		//super();
		this.spouseeName = spouseeName;
		this.spouseeId = spouseeId;
		this.spousephoneNo = spousephoneNo;
		this.spouseemail = spouseemail;
		this.spouseaddress = spouseaddress;
	}
	public String getSpouseeName() {
		return spouseeName;
	}
	public void setSpouseeName(String spouseeName) {
		this.spouseeName = spouseeName;
	}
	public String getSpouseeId() {
		return spouseeId;
	}
	public void setSpouseeId(String spouseeId) {
		this.spouseeId = spouseeId;
	}
	public int getSpousephoneNo() {
		return spousephoneNo;
	}
	public void setSpousephoneNo(int spousephoneNo) {
		this.spousephoneNo = spousephoneNo;
	}
	public String getSpouseemail() {
		return spouseemail;
	}
	public void setSpouseemail(String spouseemail) {
		this.spouseemail = spouseemail;
	}
	public String getSpouseaddress() {
		return spouseaddress;
	}
	public void setSpouseaddress(String spouseaddress) {
		this.spouseaddress = spouseaddress;
	}
	 
	 
}
