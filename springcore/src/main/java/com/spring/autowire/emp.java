package com.spring.autowire;

public class emp {
private Address address;

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}

@Override
public String toString() {
	return "emp [address=" + address + "]";
}

public emp(Address address) {
	super();
	this.address = address;
}

public emp() {
	super();
	// TODO Auto-generated constructor stub
}



}
