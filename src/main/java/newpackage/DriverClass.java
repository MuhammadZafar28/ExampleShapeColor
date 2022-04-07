/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import com.mycompany.exampleshapecolor.bridgeRefactored.*;

/**
 *
 * @author MoaathAlrajab
 */
public class DriverClass {
    
	public static void main(String[] args) {
	
		Shape square = new Triangle(new BlueColor());
		String blueSquare = square.draw();
		System.out.println(blueSquare);
		
		System.out.println("============================================");
		
		Shape shape =  new Pentagon(new RedColor());
		String redRectangle = shape.draw();
		System.out.println(redRectangle);
	}
 
}