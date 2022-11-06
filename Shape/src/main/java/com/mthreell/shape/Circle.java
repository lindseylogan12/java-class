/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mthreell.shape;

/**
 *
 * @author lindseylogan
 */
public class Circle extends Shape {
    
    private float radius;
    private float pi = 3.1415f;
    private float area;
    private float perimeter;
    
    
    public Circle(float radius, float pi) {
        this.radius = radius;
        this.pi = pi; 
    }
    
    @Override
    public float getArea() {            //getters only because its read-only
        area = pi*radius*radius;
        return area;
    }
    
    
    @Override
    public float getPerimeter() {
        perimeter = 2*pi*radius;
        return perimeter;
    }
}
