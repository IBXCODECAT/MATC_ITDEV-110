/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.schmitt.buildingobjectsinclass;

/**
 * @author Nathan Schmitt
 */
public class Money
{
    private double accountBalance = 500;
    private double depositAmount = 20;
    
    //Getter methdos also called accessor methods
    protected double getAccountBalance() 
    {
        return accountBalance;
    }
    
    protected double getDepositAmount()
    {
        return depositAmount;
    }
    
    //Setter methods also called mutator methods
    protected void setAccountBalance(double value)
    {
        accountBalance = value;
    }
    
    protected void setDepositAmount(double value)
    {
        depositAmount = value;
    }
}
