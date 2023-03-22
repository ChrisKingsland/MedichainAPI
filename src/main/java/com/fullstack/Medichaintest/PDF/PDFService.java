package com.fullstack.Medichaintest.PDF;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PDFService {
    private PDFRepository pdfRepository;

    @Autowired
    public PDFService(PDFRepository pdfRepository){
        this.pdfRepository =pdfRepository;
    }

    public List <PDF> getPDFs (){
        return pdfRepository.findAll();
    }

    public void addPdf(PDF pdf){
        Optional<PDF> pdfOptional = pdfRepository.findByTitle(pdf.getTitle());

       if(pdfOptional.isPresent()){
          throw new IllegalStateException("This role already exist");
       }

       pdfRepository.save(pdf);
    }



}
