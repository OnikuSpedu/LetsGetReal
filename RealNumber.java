public class RealNumber extends Number{
    private double value;
  
    public RealNumber(double v){
      value = v;
    }
  
    public double getValue(){
      return value;
    }
  
    public String toString(){
      return ""+getValue();
    }
  
    /*
    *Return a new RealNumber that has the value of:
    *the sum of this and the other
    */
    public RealNumber add(Number other){
       //other can be ANY RealNumber, including a RationalNumber
       //or other subclasses of RealNumber (that aren't written yet)
       return new RealNumber(this.value + other.getValue());
    }
  
    /*
    *Return a new RealNumber that has the value of:
    *the product of this and the other
    */
    public RealNumber multiply(Number other){
      return new RealNumber(this.value * other.getValue());
    }
  
    /*
    *Return a new RealNumber that has the value of:
    *this divided by the other
    */
    public RealNumber divide(Number other){
        return new RealNumber(this.value / other.getValue());
    }
  
    /*
    *Return a new RealNumber that has the value of:
    *this minus the other
    */
    public RealNumber subtract(Number other){
      return new RealNumber(this.value - other.getValue());
    }
  }