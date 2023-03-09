package com.fullstack.Medichaintest.document;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;


//Where business logic is defined
//@Component
@Service   // service vs component Same thing @Service is just for semantics to say the class must be instantiated
public class DocumentService {

    private DocumentRepository documentRepository;
    @Autowired
    public DocumentService(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }

    public List<Document> getDocument(){
       return documentRepository.findAll();

    }

    public String getTest(){
        return "Hello world";
    }

    public void addNewDocument(Document document) {
        //System.out.println("hello " + document.getDescription());
        Optional <Document> documentOptional = documentRepository.findDocumentBybytearray(document.getBytearray());
        //System.out.println(document);

        if( documentOptional.isPresent()){
            throw new IllegalStateException("Byte Array taken");
        }

        documentRepository.save(document);
    }

    public void deleteDocuments(Long docId) {
        //documentRepository.findById(docId);
        boolean exists = documentRepository.existsById(docId);
        if (!exists){
            throw new IllegalStateException("Document with id: " + docId +"  does not exist");
        }
        documentRepository.deleteById(docId);
    }
    @Transactional
    public void updateDoc(Long docId, String bytearray, String Description) {
        Document document = documentRepository.findById(docId).orElseThrow(() -> new IllegalStateException("Document with id: "+ docId+ " doesn't exist"));
        if(bytearray != null && bytearray.length()>0 && !Objects.equals(document.getBytearray(), bytearray)){
            document.setBytearray(bytearray);
        }

        if(Description != null && Description.length()>0 && !Objects.equals(document.getDescription(), Description)){
            Optional<Document> optionalDoc = documentRepository.findDocumentBydescription(Description);
            if(optionalDoc.isPresent()){
                throw new IllegalStateException("Description taken");
            }
            document.setDescription(Description);
        }

    }
/*
    public Document seeDocument() {
        return documentRepository.findById(4L);

    }*/
}
