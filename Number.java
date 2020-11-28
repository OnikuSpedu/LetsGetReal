public abstract class Number{
  public abstract double getValue();

  /*return 0 when this Number equals the other Number
  return a negative value when this Number is smaller than the other Number
  return a positive value when this Number is larger than the other Number
  */
  public int compareTo(Number other){
    if (equals(other)) return 0;
    else {
      double value = getValue();
      double otherValue = other.getValue();
      if (value > otherValue) return 1;
      else return -1;
    }
  }

  /*
  *Return true when the % difference of the values
  *are within 0.00001 of eachother.
  *Special case: if one is exactly zero, the other must be exactly zero.
  */
  public boolean equals(Number other){
      double value = getValue();
      double otherValue = other.getValue();
      double differenceThis = Math.abs((otherValue - value) / value);
      double differenceOther = Math.abs((value - otherValue) / otherValue);
      if (value == 0) {
        if(otherValue == 0) return true;
        else return false;
      }
      if (differenceThis <= (0.001 / 100) && differenceOther <= (0.001 / 100)) {
        return true;
      }
      return false; 
  }
}