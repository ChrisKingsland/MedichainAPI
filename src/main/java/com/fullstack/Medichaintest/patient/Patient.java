package com.fullstack.Medichaintest.patient;


import jakarta.persistence.*;
import org.hibernate.type.descriptor.jdbc.LongVarbinaryJdbcType;

@Entity
@Table(name = "Patient")
public class Patient {
    @Id
    @SequenceGenerator(name = "patient_sequence", sequenceName = "patient_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "patient_sequence")
    @Column(name = "PatientKey")
    private Long id;

    private String email;

    private String FirstName;

    private String LastName;

    private String DiagnosisName;

    private String ProviderName;

    private String MedicationName;

    private String TestName;

    private String pdf;

    public Patient(Long id, String email, String firstName, String lastName, String diagnosisName, String providerName, String medicationName, String testName, String pdf) {
        this.id = id;
        this.email = email;
        FirstName = firstName;
        LastName = lastName;
        DiagnosisName = diagnosisName;
        ProviderName = providerName;
        MedicationName = medicationName;
        TestName = testName;
        this.pdf = pdf;
    }

    public Patient(){


    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getDiagnosisName() {
        return DiagnosisName;
    }

    public void setDiagnosisName(String diagnosisName) {
        DiagnosisName = diagnosisName;
    }

    public String getProviderName() {
        return ProviderName;
    }

    public void setProviderName(String providerName) {
        ProviderName = providerName;
    }

    public String getMedicationName() {
        return MedicationName;
    }

    public void setMedicationName(String medicationName) {
        MedicationName = medicationName;
    }

    public String getTestName() {
        return TestName;
    }

    public void setTestName(String testName) {
        TestName = testName;
    }

    public String getPdf() {
        return pdf;
    }

    public void setPdf(String pdf) {
        this.pdf = pdf;
    }
}
