/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.simpleshoppingsystem;

/**
 *
 * @author -e-
 */
public class SimpleShoppingSystem {

    public static void main(String[] args) {
        
        //Customer C1 = new Customer(001, "Rohitha", "Wijethunga", 100);
        
        //C1.displayUserInfo();
        
        Order O1 = new Order("Computer", 2, 200.00);
        
        System.out.println(O1.calculateTotalCost(10));
    }
}
