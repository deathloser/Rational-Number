
public class Rational extends Number implements Comparable<Rational> {
  int numerator;
  int denominator;
  double ratio;


  public Rational(int num, int denom) {
    this.numerator = num;
    this.denominator = denom;

  }
  private int gcd(Rational ration) {
    //represent number in lowest terms
    while (ration.numerator != ration.denominator) {
      if (ration.numerator > ration.denominator) {
        ration.numerator = ration.numerator - ration.denominator;

      } else {
        ration.denominator = ration.denominator - ration.numerator;

      }

    }
    return ration.numerator;

  }

  public boolean equals(Rational ration) {
    if(this.numerator == ration.numerator && this.denominator == ration.denominator) {
      return true;

    } else {
      return false;
    }

  }
  public double doubleValue() {
    double num = Double.valueOf(this.numerator);
    double denom = Double.valueOf(this.denominator);
    double ratio = num/denom;
    return ratio;

  }
  public float floatValue() {
    float num = (float) this.numerator;
    float denom = (float) this.denominator;
    float ratio = num/denom;
    return ratio;

  }
  public long longValue() {
    long num = (long) ((float) this.numerator);
    long denom = (long)((float)this.denominator);
    long ratio = num/denom;
    return ratio;

  }

  public int intValue() {
    int ratio = this.numerator / this.denominator;
    return ratio;

  }
  public int compareTo(Rational ration) {
    int two = 2;
    return two;

  }
  

  public int getNumerator() {
    return numerator;
  }
  public int getDenominator() {
    return denominator;
  }
  public double getRatio() {
    float ratio = ((float) numerator / denominator);
    return (ratio);
  }

  public double add(Rational ration) {
    double num = Double.valueOf(this.numerator);
    double denom = Double.valueOf(this.denominator);
    double ratio = num/denom;
    double num1 = Double.valueOf(ration.numerator);
    double denom1 = Double.valueOf(ration.denominator);
    double ratio1 = num1/denom1;

    double newValue = ratio + ratio1;
    return newValue;
  }
  public double sub(Rational ration) {
    double num = Double.valueOf(this.numerator);
    double denom = Double.valueOf(this.denominator);
    double ratio = num/denom;
    double num1 = Double.valueOf(ration.numerator);
    double denom1 = Double.valueOf(ration.denominator);
    double ratio1 = num1/denom1;

    double newValue = ratio - ratio1;
    return newValue;
  }
  public double mult(Rational ration) {
    double num = Double.valueOf(this.numerator);
    double denom = Double.valueOf(this.denominator);
    double ratio = num/denom;
    double num1 = Double.valueOf(ration.numerator);
    double denom1 = Double.valueOf(ration.denominator);
    double ratio1 = num1/denom1;

    double newValue = ratio * ratio1;
    return newValue;
  }
  public double div(Rational ration) {
    double num = Double.valueOf(this.numerator);
    double denom = Double.valueOf(this.denominator);
    double ratio = num/denom;
    double num1 = Double.valueOf(ration.numerator);
    double denom1 = Double.valueOf(ration.denominator);
    double ratio1 = num1/denom1;

    double newValue = ratio / ratio1;
    return newValue;
  }

  public String toString() {
    float ratio = ((float) numerator / denominator);
    String string = String.valueOf(ratio);
    return string;
  }

  


}