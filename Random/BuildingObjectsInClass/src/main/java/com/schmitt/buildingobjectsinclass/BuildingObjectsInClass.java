/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.schmitt.buildingobjectsinclass;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Nathan Schmitt
 */
public class BuildingObjectsInClass {

    public static void main(String[] args)
    {
        Money daEpicMonies = new Money();
        daEpicMonies.setAccountBalance(2000.00);
        daEpicMonies.getAccountBalance();
        
        Car tesla = new Car("Tesla", "X", "V1", "White", (short)2022);
        Car volocopter = new Car("Volocopter", "VCX", "?", "White", (short)3021);
        Car fakeCar = new Car("emptyhaha", "emptyhaha", "emptyhaha", "emptyhaha", (short)0);
        
        System.out.println(tesla.toString());
        System.out.println(volocopter.toString());
        System.out.println(fakeCar.toString());
    }
}
