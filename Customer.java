/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simpleshoppingsystem;

/**
 *
 * @author -e-
 */
public class Customer extends User {
    private int starPoint;
    
    public Customer(int Id, String name, String email, int starPoint){
    
    super(Id, name, email);
    this.starPoint = starPoint;
    }
 

    /**
     * @return the starPointt
     */
    public int getStarPoint() {
        return starPoint;
    }

    /**
     * @param starPoint
     */
    public void setStarPointt(int starPoint) {
        this.starPoint = starPoint;
    }
    
    @Override
    public void displayUserInfo(){
    
    System.out.println("ID " + super.getId());
    System.out.println("Name " + super.getName());
    System.out.println("Email " + super.getEmail());
    System.out.println("StarPont " + starPoint);
    }
}
