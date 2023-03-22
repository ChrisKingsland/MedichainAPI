package com.fullstack.Medichaintest.PDF;

import com.fullstack.Medichaintest.roles.User;
import jakarta.persistence.*;

import java.util.Collection;

@Entity
@Table()
public class PDF {
    @SequenceGenerator(name = "pdf_sequence", sequenceName = "pdf_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pdf_sequence")
    //@Column(name = "PDFKey")
    @Id
    private Long id;

    String pdfArray;

    String title;

    @ManyToMany(mappedBy = "pdfs", fetch = FetchType.LAZY)
    private Collection<User> users;


    public Collection<User> getUsers() {
        return users;
    }

    public void setUsers(Collection<User> users) {
        this.users = users;
    }

    public PDF(Long id, String pdfArray, String title) {
        this.id = id;
        this.pdfArray = pdfArray;
        this.title =title;
    }

    public PDF(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPdf() {
        return pdfArray;
    }

    public void setPdf(String pdfArray) {
        this.pdfArray = pdfArray;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
