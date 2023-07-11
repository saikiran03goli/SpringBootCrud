package com.web.SpringBootPracticeCrud.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Strundet {
@Id
private Integer sId;
private String sName;
private String address;
private double fee;
public Strundet() {
	super();
}
public Integer getsId() {
	return sId;
}
public void setsId(Integer sId) {
	this.sId = sId;
}
public String getsName() {
	return sName;
}
public void setsName(String sName) {
	this.sName = sName;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public double getFee() {
	return fee;
}
public void setFee(double fee) {
	this.fee = fee;
}
@Override
public String toString() {
	return "Strundet [sId=" + sId + ", sName=" + sName + ", address=" + address + ", fee=" + fee + "]";
}

}
