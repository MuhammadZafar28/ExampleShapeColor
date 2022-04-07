/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exampleshapecolor.bridgeRefactored;

/**
 *
 * @author MoaathAlrajab
 */
public abstract class Shape {
	protected Color color;
	
    public Shape(Color color) {
		this.color = color;
	}
 
	public abstract String draw();
}
