/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mthreell.statecapitals3;

/**
 *
 * @author lindseylogan
 */
public class Capital {
    
    private String name;
    private String population;
    private String squareMileage;
    
    public Capital(String name, String population, String squareMileage) {
        this.name = name;
        this.population = population;
        this.squareMileage = squareMileage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getSquareMileage() {
        return squareMileage;
    }

    public void setSquareMileage(String squareMileage) {
        this.squareMileage = squareMileage;
    }
    
    
}
