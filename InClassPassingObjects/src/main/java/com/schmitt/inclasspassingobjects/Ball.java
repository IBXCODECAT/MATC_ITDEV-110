/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.schmitt.inclasspassingobjects;

/**
 *
 * @author natha
 */
public class Ball
{   
    private double diameter;
    private double radius;
    private double circumference;
    
    private String color;
    private String type;
    
    public Ball(double diameter, double radius, double circumference, String color, String type) {
        this.diameter = diameter;
        this.radius = radius;
        this.circumference = circumference;
        this.color = color;
        this.type = type;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getRadius() {
        return radius;
    }

    public double getCircumference() {
        return circumference;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ball{");
        sb.append("diameter=").append(diameter);
        sb.append(", radius=").append(radius);
        sb.append(", circumference=").append(circumference);
        sb.append(", color=").append(color);
        sb.append(", type=").append(type);
        sb.append('}');
        return sb.toString();
    }
    
    
}
