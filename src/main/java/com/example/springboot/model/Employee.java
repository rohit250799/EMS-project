package com.example.springboot.model;

import jakarta.persistence.*;
@Entity
@Table (name = "Employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "First name")
    private String first_name;

    @Column(name = "Last name")
    private String last_name;

    @Column(name = "Email")
    private String email;

    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id = id;
    }
    public String getFirst_name(){
        return first_name;
    }
    public void setFirst_name(String first_name){
        this.first_name = first_name;
    }
    public String getLast_name(){
        return last_name;
    }
    public void setLast_name(String last_name){
        this.last_name = last_name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
