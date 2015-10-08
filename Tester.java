/*
 * Project: Tester.java
 * Description: Tests Circle.java, Dice.java, Polygon.java
 * Name: Aaron Snowberger
 * Date: Oct 8, 2015
 */

public class Tester {
  
  public static void main( String[] args ) {
    
    Circle c = new Circle();
    System.out.println( "Circle Area: " + c.calcArea(3) ); // static method can be calcArea(3);
    
    Dice d = new Dice();
    int roll = d.rollDice();
    while( roll != 6 ) {
      System.out.println( "\nThe dice shows " + roll );
      roll = d.rollDice();
    }
      
    Polygon p = new Polygon(40);
    System.out.println( "\n" + p.sidesToString() );
    
    
    
  } // end main method
  
} // end Tester