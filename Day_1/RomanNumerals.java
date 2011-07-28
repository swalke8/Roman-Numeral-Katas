import java.util.*;

public class RomanNumerals {

  public final static HashMap<Integer,String> romanNumerals = new HashMap<Integer,String>();
  public final static int [] keyValues = {50, 10, 5, 1};

  static {
    romanNumerals.put(1, "I");
    romanNumerals.put(5, "V");
    romanNumerals.put(10, "X");
    romanNumerals.put(50, "L");
  }

  public static String romanize(int number) {
    String numeral = new String();

    for(int key = 0; key < keyValues.length; key++) {
      while(number >= keyValues[key]) {
        numeral = update(numeral, key);
        number -= keyValues[key];
      }
      if(specialCase(number, key)) {
        numeral = update(numeral, key+1, key);
        number -= (keyValues[key] - keyValues[key+1]);
      }
      if(specialCase2(number, key)) {
        numeral = numeral.concat("I" + getRomanNumerals(key));
        return numeral;
      }
    }
    return numeral;
  }

  public static String update(String numeral, int key) {
    return numeral.concat(getRomanNumerals(key));
  }

  public static String update(String numeral, int key1, int key2) {
    return numeral.concat(getRomanNumerals(key1) + getRomanNumerals(key2));
  }

  public static boolean specialCase(int number, int key) {
    return number > 0 && keyValues[key] > 10 && (number >= keyValues[key] - keyValues[key+1]);
  }

  public static boolean specialCase2(int number, int key) {
    return number > 0 && number == (keyValues[key] - 1);
  }

  public static String getRomanNumerals(int key) {
    return romanNumerals.get(keyValues[key]);
  }
}
