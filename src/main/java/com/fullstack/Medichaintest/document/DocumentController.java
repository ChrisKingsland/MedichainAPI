package com.fullstack.Medichaintest.document;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.print.Doc;
import java.util.List;

//import static com.sun.beans.introspect.PropertyInfo.Name.required;

@RestController
@RequestMapping(path = "api/v1/document")
public class DocumentController {
    private final DocumentService documentservice;  // reference to documentservice (Object)

    @Autowired  // dependency injection "magically instatiated
    public DocumentController(DocumentService documentservice) {   // pass the service object into the controller
                                                                    // not going to work as we don't have a documentservice instance
        this.documentservice = documentservice;
    }
    @GetMapping("get")
    public List<Document> getDocument(){    //returns a list of type Document
        return documentservice.getDocument();

    }
    @CrossOrigin(exposedHeaders = {"Access-Control-Allow-Origin","Access-Control-Allow-Credentials", "Access-Control-Expose-Headers"})
    @GetMapping("gettest")
    public String getTest() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Access-Control-Allow-Origin", "*");
        headers.add("Access-Control-Allow-Credentials", "true");
        headers.add("Access-Control-Expose-Headers", "Authorization, Content-Type");
        return "Hello World";
    }

    @GetMapping("world")
    public String ngrokTest(){
        return "yuh we made it";
    }


    @PostMapping("post")
    public void registerNewDocument(@RequestBody Document document){    //grabs JSON body from "post" endpoint
        System.out.println("123yooooooooooooooo" + document.getBytearray());
        documentservice.addNewDocument(document);
    }

    @DeleteMapping(path = "{documentId}")
    public void deleteDocument(@PathVariable("documentId") Long docId){  // passes a Long id variable instead of a Document type object
        documentservice.deleteDocuments(docId);

    }

    @PutMapping(path = "{documentId}")
    public void updateDocument(@PathVariable("documentId") Long docId,
                               @RequestParam(required = false) String bytearray,
                               @RequestParam(required = false) String Description   ){
        documentservice.updateDoc(docId, bytearray, Description);


    }

    /*
    @GetMapping("grab")
    public Document seeDoc(){

        return documentservice.seeDocument();
    }

     */

}
