import java.util.*;

public class RomanNumeral {
  private static Map<Integer,String> romanNumerals = new HashMap<Integer,String>();
  static {
    romanNumerals.put(1, "I");
    romanNumerals.put(5, "V");
    romanNumerals.put(10, "X");
  }
  private static final int [] romanNumeralValues = {10, 5, 1};

  public static String romanize(int number) {
    String numeral = new String();
    for(int value : romanNumeralValues) {
      while(number >= value) {
        numeral = numeral.concat(romanNumerals.get(value));
        number -= value;
      }
      if(number > 0 && number == value-1) {
        numeral = numeral.concat("I" + romanNumerals.get(value));
        return numeral;
      }
    }
    return numeral;
  }
}
