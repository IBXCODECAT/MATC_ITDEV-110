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
    private double widthdrawAmount = 20;
    private double overdraftLimit = 20;
    
    //Getter methdos also called accessor methods
    protected double getAccountBalance() 
    {
        return accountBalance;
    }
    
    protected double getDepositAmount()
    {
        return depositAmount;
    }
    
    protected double getWidthdrawAmount() 
    {
        return widthdrawAmount;
    }
    
    protected double getOverdraftLimit()
    {
        return overdraftLimit;
    }
    
    //Setter methods also called mutator methods
    protected void setAccountBalance(double accountBalance)
    {
        this.accountBalance = accountBalance;
    }
    
    protected void setDepositAmount(double depositAmount)
    {
        this.depositAmount = depositAmount;
    }
    
    protected void setWidthdrawAmount(double widthdrawAmount)
    {
        this.widthdrawAmount = widthdrawAmount;
    }
    
    protected void setOverdraftLimit(double overdraftLimit)
    {
        this.overdraftLimit = overdraftLimit;
    }
}
