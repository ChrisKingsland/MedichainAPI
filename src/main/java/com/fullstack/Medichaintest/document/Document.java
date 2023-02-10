package com.fullstack.Medichaintest.document;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

@Entity
@Table
public class Document {

    @SequenceGenerator(name = "document_sequence", sequenceName = "document_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "document_sequence")
    @Id
    private Long id;
    private String bytearray;
    @JsonFormat(pattern="yyyy-MM-dd")
    private String DateAdded;

    private String description;

    public Document(){

    }

    public Document(Long id, String bytearray, String dateAdded, String description) {
        this.id = id;
        this.bytearray = bytearray;
        DateAdded = dateAdded;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBytearray() {
        return bytearray;
    }

    public void setBytearray(String bytearray) {
        this.bytearray = bytearray;
    }

    public String getDateAdded() {
        return DateAdded;
    }

    public void setDateAdded(String dateAdded) {
        DateAdded = dateAdded;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}



