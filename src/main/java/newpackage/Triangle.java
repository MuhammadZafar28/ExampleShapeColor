/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import com.mycompany.exampleshapecolor.bridgeRefactored.Color;
import com.mycompany.exampleshapecolor.bridgeRefactored.Shape;

/**
 *
 * @author MoaathAlrajab
 */
public class Triangle extends Shape {
	
    public Triangle(Color color) {
        super(color);
    }
 
    @Override
    public String draw() {
        return "Triangle drawn " + color.applyColor();
    }
}