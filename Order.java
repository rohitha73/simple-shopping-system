/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simpleshoppingsystem;

/**
 *
 * @author -e-
 */
public class Order {
    private String itemName;
    private int quantity;
    private double price;
    
    
    public Order(String itemName, int quantity, double price){
    
    this.itemName = itemName;
    this.quantity = quantity;
    this.price = price;
    
    }

    /**
     * @return the itemName
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * @param itemName the itemName to set
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }
    
    public double calculateTotalCost(){
    
        double total =  quantity*price;
        return total;
    
    }
    
    public double calculateTotalCost(double precent){
    
        double precentAmount = price*(precent/100);
        double netPrice = price - precentAmount;
        return netPrice*quantity;
    
    }
    
    
}
