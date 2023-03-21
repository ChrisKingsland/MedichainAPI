package com.fullstack.Medichaintest.PatientDiagnosis;

import jakarta.persistence.*;

@Entity
@Table
public class PatientDiagnosis {

    @Id
    @SequenceGenerator(name = "patient_sequence", sequenceName = "patient_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "patient_sequence")
    @Column(name = "DiagnosisKey")
    private Long id;

    private Long PatientKey;

    private String PatientName;

    private String DiagnosisName;

    private String ProviderName;

    private String ProviderKey;

    private String MedicationName;

    private String TestName;



    public PatientDiagnosis(Long id, Long patientKey, String patientName, String diagnosisName, String providerName, String providerKey, String medicationName, String testName) {
        this.id = id;
        this.PatientKey = patientKey;
        PatientName = patientName;
        DiagnosisName = diagnosisName;
        ProviderName = providerName;
        ProviderKey = providerKey;
        MedicationName = medicationName;
        TestName = testName;
    }

    public PatientDiagnosis(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPatientKey() {
        return PatientKey;
    }

    public void setPatientKey(Long patientKey) {
        PatientKey = patientKey;
    }

    public String getPatientName() {
        return PatientName;
    }

    public void setPatientName(String patientName) {
        PatientName = patientName;
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

    public String getProviderKey() {
        return ProviderKey;
    }

    public void setProviderKey(String providerKey) {
        ProviderKey = providerKey;
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


}
