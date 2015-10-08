/*
 * Dice.java
 */

public class Dice {
  
  public Dice() { } // end Dice()
  
  public int rollDice() {
    
    double random = Math.random();
    System.out.println( "Random num: " + random );
    
    random = random * 6;
    System.out.println( "Between 1-6: " + random );
    
    random = Math.ceil(random);
    System.out.println( "Rounded up: " + random );
    
    System.out.println( "Final int: " + (int) random );
    return (int) random;
  } // end rollDice()
  
} // end Dice