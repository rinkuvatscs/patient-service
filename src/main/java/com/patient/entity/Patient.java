package com.patient.entity;


public class Patient {

    private Integer patientId;
    private String patientName;
    private String patientEmail;
    private String patientAadhaar;
    private String patientMobile;
    private String patientHomeAddress;
    private String dateOfBirth;
    private String gender;
    
    
    
    
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getPatientId() {
		return patientId;
	}
	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getPatientEmail() {
		return patientEmail;
	}
	public void setPatientEmail(String patientEmail) {
		this.patientEmail = patientEmail;
	}
	public String getPatientAadhaar() {
		return patientAadhaar;
	}
	public void setPatientAadhaar(String patientAadhaar) {
		this.patientAadhaar = patientAadhaar;
	}
	public String getPatientMobile() {
		return patientMobile;
	}
	public void setPatientMobile(String patientMobile) {
		this.patientMobile = patientMobile;
	}
	public String getPatientHomeAddress() {
		return patientHomeAddress;
	}
	public void setPatientHomeAddress(String patientHomeAddress) {
		this.patientHomeAddress = patientHomeAddress;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", patientEmail=" + patientEmail
				+ ", patientAadhaar=" + patientAadhaar + ", patientMobile=" + patientMobile + ", patientHomeAddress="
				+ patientHomeAddress + ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + "]";
	}
	

   
   
}
