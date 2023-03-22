package com.fullstack.Medichaintest.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class PatientService {
    private PatientRepository patientRepository;

    @Autowired
    public PatientService(PatientRepository patientRepository){
        this.patientRepository = patientRepository;
    }

    public List<Patient> getPatient(){
        return patientRepository.findAll();
    }

    public void newPatient(Patient patient){
        Optional<Patient> patientOptional = patientRepository.findPatientByEmail(patient.getEmail());

        if( patientOptional.isPresent()){
            throw new IllegalStateException("This Patient already exists ");
        }
        patientRepository.save(patient);
    }

}
