package com.fullstack.Medichaintest.document;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository                                                                 // extending JpaRepository gives us all the Findall and findbyid functions to call
                                                                            // you can implement your own
public interface DocumentRepository extends JpaRepository<Document,Long> {  // specify type of info and type of primary key (id is Long)
    // this interface is responsible for data access
    //entire data access layer

    //@Query("SELECT d FROM Document d WHERE d.bytearray = ?1")
    Optional<Document> findDocumentBybytearray(String bytearray);   // SELECT * FROM student WHERE email = ?

    Optional<Document> findDocumentBydescription(String description);


}
