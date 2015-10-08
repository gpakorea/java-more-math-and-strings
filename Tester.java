/*
 * Project: Tester.java
 * Description: Tests Circle.java, Dice.java, Polygon.java
 * Name: Aaron Snowberger
 * Date: Oct 8, 2015
 */

public class Tester {
  
  public static void main( String[] args ) {
    
    Circle c = new Circle();
    System.out.println( c.calcArea(3) ); // static method can be calcArea(3);
    
    Dice d = new Dice();
    d.rollDice();
    
    Polygon p = new Polygon(40);
    System.out.println( p.sidesToString() );
    
    
    
  } // end main method
  
} // end Tester