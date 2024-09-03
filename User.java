/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simpleshoppingsystem;

/**
 *
 * @author -e-
 */
public class User {
    private int Id;
    private String name;
    private String email;


    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    public User(int Id, String name, String email){
    
    this.Id = Id;
    this.name = name;
    this.email = email;
    
    }
    
    public void displayUserInfo(){
    
    System.out.println("ID " + Id);
    System.out.println("Name " + name);
    System.out.println("Email " + email);
    }
}
