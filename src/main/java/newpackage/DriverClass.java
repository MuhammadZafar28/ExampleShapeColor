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
	
		Shape triangle = new Triangle(new BlueColor());
		String blueSquare = triangle.draw();
		System.out.println(blueSquare);
		
		System.out.println("============================================");
		
		Shape pentagon =  new Pentagon(new RedColor());
		String redRectangle = pentagon.draw();
		System.out.println(redRectangle);
	}
 
}