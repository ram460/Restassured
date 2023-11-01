package PojoclassDemo;

import java.util.Date;

public class Bookinglibrary 
{
	String firstname;
	String lastname;
	int  totalprice;
	boolean depositpaid;
	Object bookingdates;
	//Date checkin;
	//Date checkout;
	String additionalneeds;
	

	public Bookinglibrary(String firstname, String lastname, int totalprice, boolean depositpaid, Object bookingdates,
			  String additionalneeds) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.totalprice = totalprice;
		this.depositpaid = depositpaid;
		this.bookingdates = bookingdates;
		this.additionalneeds = additionalneeds;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public int getTotalprice() {
		return totalprice;
	}


	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}


	public boolean isDepositpaid() {
		return depositpaid;
	}


	public void setDepositpaid(boolean depositpaid) {
		this.depositpaid = depositpaid;
	}


	public Object getBookingdates() {
		return bookingdates;
	}


	public void setBookingdates(Object bookingdates) {
		this.bookingdates = bookingdates;
	}


	/*public Date getCheckin() {
		return checkin;
	}


	public void setCheckin(Date checkin) {
		this.checkin = checkin;
	}


	public Date getCheckout() {
		return checkout;
	}


	public void setCheckout(Date checkout) {
		this.checkout = checkout;
	}
*/

	public String getAdditionalneeds() {
		return additionalneeds;
	}


	public void setAdditionalneeds(String additionalneeds) {
		this.additionalneeds = additionalneeds;
	}
	
	
}
