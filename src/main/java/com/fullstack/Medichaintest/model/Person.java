package com.fullstack.Medichaintest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;
@Entity
public class Person {
    @Id
    private Long id;
    private String Firstname;
    private String Lastname;
    private String Address;
    private String Hospital;
    private boolean active;

    public Person(Long id, String firstname, String lastname, String address, String hospital, boolean active, LocalDate dateCreated) {
        this.id = id;
        Firstname = firstname;
        Lastname = lastname;
        Address = address;
        Hospital = hospital;
        this.active = active;
        this.dateCreated = dateCreated;
    }

    private LocalDate dateCreated;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getHospital() {
        return Hospital;
    }

    public void setHospital(String hospital) {
        Hospital = hospital;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }
}
