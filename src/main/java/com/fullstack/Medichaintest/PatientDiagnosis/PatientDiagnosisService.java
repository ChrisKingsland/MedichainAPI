package com.fullstack.Medichaintest.PatientDiagnosis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientDiagnosisService {

    private PatientDiagnosisRepository patientDiagnosisRepository;

    @Autowired
    public PatientDiagnosisService(PatientDiagnosisRepository patientDiagnosisRepository){
        this.patientDiagnosisRepository = patientDiagnosisRepository;
    }

    public List<PatientDiagnosis> getPatientDiagnosis(){
        return patientDiagnosisRepository.findAll();
    }


}
