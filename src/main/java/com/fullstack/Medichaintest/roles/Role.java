package com.fullstack.Medichaintest.roles;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    @ManyToMany(mappedBy = "roles")
    private Collection<Users> users;
    private Collection<Privilege> Privileges;

    @ManyToMany
    @JoinTable(
            name = "roles_privileges",
            joinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"), // role_id is a foreign key that references the "id" column in the Role table
            inverseJoinColumns = @JoinColumn(name = "privilege_id", referencedColumnName = "id"))
     // represents the many-to-many relationships contains a collection of privledge objects that are associated with a role

    public Collection<Users> getUsers() {
        return users;
    }

    public void setUsers(Collection<Users> users) {
        this.users = users;
    }

    public Collection<Privilege> getPrivileges() {
        return Privileges;
    }

    public void setPrivileges(Collection<Privilege> privileges) {
        Privileges = privileges;
    }

    public Role(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
