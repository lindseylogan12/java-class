/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mthreell.shape;

/**
 *
 * @author lindseylogan
 */
public class Triangle extends Shape {
    
    private float height;
    private float base;
    private float side1;
    private float side2;
    private float area;
    private float perimeter;
    
    
    public Triangle(float height, float base, float side1, float side2 ) {
        this.height = height;
        this.base = base;
        this.side1 = side1;
        this.side2 = side2; 
    }
    
    @Override
    public float getArea() {            //getters only because its read-only
        area = 1/2 * (base * height);
        return area;
    }
    
    
    @Override
    public float getPerimeter() {
        perimeter = base + side1 + side2;
        return perimeter;
    }
    
}
