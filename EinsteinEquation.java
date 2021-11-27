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
  // Main calculates  and outputs the amonnt of energy that can be released from a given mass
  public static void main(String[] args) {
    System.out.println("What is the mass of the object?");
    Scanner scannerObj = new Scanner(System.in);
    double objMass  = scannerObj.nextDouble();
    final double lightSpeed = 2.998e8;
    double energyReleased = objMass * Math.pow(lightSpeed, 2);
    System.out.printf("%s Joules of energy is released from an object of mass %s kg.", 
                     energyReleased, objMass);

  }
}
