package denemeclass;

public class CorporateCustomer extends Customer{
       private String companyName;
       private String TaxNumber;
	   private String CustomerNumber;
	   private String PhoneNumber;
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getTaxNumber() {
		return TaxNumber;
	}
	public void setTaxNumber(String taxNumber) {
		TaxNumber = getTaxNumber();
	}
	public String getCustomerNumber() {
		return CustomerNumber;
	}
	public void setCustomerNumber(String customerNumber) {
		CustomerNumber = customerNumber;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	
       
}
	
