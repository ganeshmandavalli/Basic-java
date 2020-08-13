package serialdserial;

import java.io.Serializable;
public class Customer implements Serializable {
	private static final long serialversionUUID =200L; 
	transient String name;
	int crn;
	double balance;
	public Customer(String name,int crn,double balance)  {
		this.name=name;
		this.crn=crn;
		this.balance=balance;
	}
	public String getname() {
		return name;
	}
	public int getcrn() {
		return crn;
	}
	public double getbalance() {
		return balance;
	}
}
