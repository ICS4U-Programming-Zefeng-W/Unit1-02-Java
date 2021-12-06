/*
 * Outputs the energy that is released from the mass of an object given that the speed 
 of light is 2.998e8 m/s and E=mc^2
 * By Zefeng Wang
 * Created on November 26, 2021 
 * */

//import Math class
import java.lang.Math;
//import Scanner class
import java.util.Scanner;


// class EinsteinEquation.
class EinsteinEquation {
  // declare constant
  final static double lightSpeed = 2.998e8;
  
  public static void main(String[] args) {
    // Ask user for the mass of an object and read it
    System.out.println("What is the mass of the object?");
    Scanner scannerObj = new Scanner(System.in);
    double objMass  = scannerObj.nextDouble();
    // calculate and display the amount of energy released
    double energyReleased = objMass * Math.pow(lightSpeed, 2);
    System.out.printf("%s Joules of energy is released from an object of mass %s kg.", 
                     energyReleased, objMass);

  }
}
