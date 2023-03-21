package com.fullstack.Medichaintest.PatientDiagnosis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/PatientDia")
public class PatientDiagnosisController {

    private final PatientDiagnosisService patientDiagnosisService;

    @Autowired
    public PatientDiagnosisController(PatientDiagnosisService patientDiagnosisService){

        this.patientDiagnosisService = patientDiagnosisService;
    }

    @GetMapping("/get")
    public List<PatientDiagnosis> getPatientDiagnosis(){
        return patientDiagnosisService.getPatientDiagnosis();
    }
}
