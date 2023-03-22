package com.fullstack.Medichaintest.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/patient")
public class PatientController {

    private final PatientService patientService;

    @Autowired
    public PatientController(PatientService patientService){
        this.patientService = patientService;
    }

    @GetMapping("/get")
    public List<Patient> getPatient(){
        return patientService.getPatient();
    }

    @PostMapping("/post")
    public void newPatient(@RequestBody Patient patient){
        patientService.newPatient(patient);
    }

}
