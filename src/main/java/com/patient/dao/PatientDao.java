package com.patient.dao;

import java.util.List;

import com.patient.entity.Patient;
import com.patient.request.PatientRequest;

public interface PatientDao {
    public String addCustomer(PatientRequest customer);

    public String deleteCustomer(PatientRequest customerRequest);

    public Patient getCustomerByMobileNumber(String mobileNumber);

    public Patient getCustomerByAdharNumber(String adharNumber);

    public Patient getCustomerByEmail(String email);

    public List<Patient> getCustomerByName(String name);

    public Patient getCustomerById(Integer id);

    public String updateCustomer(PatientRequest customerRequest);

}