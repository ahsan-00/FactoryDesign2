/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAH
 */
public class FactoryDesign2 {
    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
    GarmentsFactory cloths = new GarmentsFactory();
    
    System.out.println("Cloths search by Season:");
    GarmentsCloths clothsl = cloths.getCloths("SPRING");
    clothsl.AvarageWeight();
    
    GarmentsCloths cloths2 = cloths.getCloths("SILK"); 
    cloths2.AvarageWeight(); 
  }
}
 