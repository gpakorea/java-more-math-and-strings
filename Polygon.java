/*
 * Polygon.java
 */

public class Polygon {
  
  private int numSides;
  
  
  public Polygon() { 
    this.numSides = 0;
  } // end Polygon()
  
  
  public Polygon( int x ) {
    this.numSides = x;
  } // end Polygon(x)
  
  
  public int getNumSides() {
    return numSides;
  } // end getNumSides()
  
  
  public void setNumSides( int x ) {
    this.numSides = x;
  } // setNumSides(x)
  
  
  public String sidesToString() {
    String num = "";
    
    switch( numSides ) {
      case 1:
        num = "one";
        break;
      case 2:
        num = "two";
        break;
      case 3:
        num = "three";
        break;
      case 4:
        num = "four";
        break;
      case 5:
        num = "five";
        break;
      case 6:
        num = "six";
        break;
      case 7:
        num = "seven";
        break;
      case 8:
        num = "eight";
        break;
      default:
        num = "too many";
    }
    
    return "Your polygon has " + num + " sides.";
  } // end toString()
  
  
} // end Polygon