package spboot.web.jpa.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="customer")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property="customerId")
public class Customer {
	  
	@Id
	@Column(name="customer_id")
	int customerId;
	
	@Column(name="customer_name")
	String customerName;
	
	@Column(name="customer_age")
	int customerAge;
	
	@Column(name="customer_gender")
	char customerGender;
	
	@Column(name="customer_mailid")
	String customerMailId;
	
	@Column(name="customer_phone_number")
	long customerPhoneNumber;
	
	@Column(name="customer_password")
	String customerPassword;

	@Column(name="customer_address")
	String customerAddress;

	@Column(name="customer_address2")
	String customerAddress2;

	
	@OneToMany(cascade = CascadeType.REMOVE,mappedBy="customer")
	List<TestAppointment> testAppointment;

	public Customer() {}
	
	public Customer(int customerId, String customerName, int customerAge, char customerGender, String customerMailId,
			long customerPhoneNumber, String customerPassword, String customerAddress,String customerAddress2, List<TestAppointment> testAppointment){
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAge = customerAge;
		this.customerGender = customerGender;
		this.customerMailId = customerMailId;
		this.customerPhoneNumber = customerPhoneNumber;
		this.customerPassword = customerPassword;
		this.customerAddress = customerAddress;
		this.customerAddress = customerAddress2;

		this.testAppointment = testAppointment;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerAge() {
		return customerAge;
	}

	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}

	public char getCustomerGender() {
		return customerGender;
	}

	public void setCustomerGender(char customerGender) {
		this.customerGender = customerGender;
	}

	public String getCustomerMailId() {
		return customerMailId;
	}

	public void setCustomerMailId(String customerMailId) {
		this.customerMailId = customerMailId;
	}

	public long getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}

	public void setCustomerPhoneNumber(long customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	// customerAddress
	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress2(String customerAddress2) {
		this.customerAddress2 = customerAddress2;
	}

	public String getCustomerAddress2() {
		return customerAddress2;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public List<TestAppointment> getTestAppointment() {
		return testAppointment;
	}

	public void setTestAppointment(List<TestAppointment> testAppointment) {
		this.testAppointment = testAppointment;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAge=" + customerAge
				+ ", customerGender=" + customerGender + ", customerMailId=" + customerMailId + ", customerPhoneNumber="
				+ customerPhoneNumber + ", customerPassword="
				+ customerPassword + ", customerAddress="
				+ customerAddress + ", customerAddress2="
				+ customerAddress2 + ", testAppointment=" + testAppointment + "]";
	}
}