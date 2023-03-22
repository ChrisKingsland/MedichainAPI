package com.fullstack.Medichaintest.PDF;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/pdf")
public class PDFController {

    private final PDFService pdfService;

    @Autowired
    public PDFController( PDFService pdfService){
        this.pdfService = pdfService;
    }

    @GetMapping("getPDFs")
    public List<PDF> getPDFs(){
        return pdfService.getPDFs();
    }

    @PostMapping("post")
    public void addPdf(@RequestBody PDF pdf){
        System.out.println("rrrrrrrrrrrrrrrrrrrrrrrrrrr");
        System.out.println(pdf.getPdf());
        System.out.println(pdf.getTitle());
        pdfService.addPdf(pdf);
    }



}
