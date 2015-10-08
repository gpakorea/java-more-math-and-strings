/*
 * Dice.java
 */

public class Dice {
  
  public Dice() { } // end Dice()
  
  public int rollDice() {
    double random = Math.random();
    System.out.println(random);
    
    random = random * 6;
    random = ceiling(random);
    
    System.out.println( random );
    System.out.println( (int) random );
    return (int) random;
  } // end rollDice()
  
} // end Dice