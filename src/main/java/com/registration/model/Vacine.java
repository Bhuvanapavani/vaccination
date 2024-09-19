package com.registration.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Vacine {
@Id
private String citizenId;
private String citizenname;
private String vacineName;
private String vacineCenterAddress;
public Vacine() {
	super();
}
public Vacine(String citizenId, String citizenname, String vacineName, String vacineCenterAddress) {
	super();
	this.citizenId = citizenId;
	this.citizenname = citizenname;
	this.vacineName = vacineName;
	this.vacineCenterAddress = vacineCenterAddress;
}
public String getCitizenId() {
	return citizenId;
}
public void setCitizenId(String citizenId) {
	this.citizenId = citizenId;
}
public String getCitizenname() {
	return citizenname;
}
public void setCitizenname(String citizenname) {
	this.citizenname = citizenname;
}
public String getVacineName() {
	return vacineName;
}
public void setVacineName(String vacineName) {
	this.vacineName = vacineName;
}
public String getVacineCenterAddress() {
	return vacineCenterAddress;
}
public void setVacineCenterAddress(String vacineCenterAddress) {
	this.vacineCenterAddress = vacineCenterAddress;
}
@Override
public String toString() {
	return "Vacine [citizenId=" + citizenId + ", citizenname=" + citizenname + ", vacineName=" + vacineName
			+ ", vacineCenterAddress=" + vacineCenterAddress + ", getCitizenId()=" + getCitizenId()
			+ ", getCitizenname()=" + getCitizenname() + ", getVacineName()=" + getVacineName()
			+ ", getVacineCenterAddress()=" + getVacineCenterAddress() + ", getClass()=" + getClass() + ", hashCode()="
			+ hashCode() + ", toString()=" + super.toString() + "]";
}





}

