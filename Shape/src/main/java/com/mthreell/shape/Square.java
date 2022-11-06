/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mthreell.shape;

/**
 *
 * @author lindseylogan
 */
public class Square extends Shape {
    
    private float height;
    private float area;
    private float perimeter;
    
    
    public Square(float height) {
        this.height = height;
    }
    
    @Override
    public float getArea() {        //getters only because its read-only
        area = height * height;
        return area;
    }
    
    
    @Override
    public float getPerimeter() {
        perimeter = height*4;
        return perimeter;
    }
    
}

    

