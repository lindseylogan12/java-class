/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mthreell.shape;

/**
 *
 * @author lindseylogan
 */
public class Rectangle extends Shape{
    
    private float height;
    private float length;
    private float area;
    private float perimeter;

    public Rectangle(float height, float length) {
       this.height = height;
       this.length = length;
    } 
    
    
    @Override
    public float getArea() {
        area = height * length;
        return area;
    }

    @Override
    public float getPerimeter() {
        perimeter = 2 * (height + length);
        return perimeter;
    }

    
    
    
}
