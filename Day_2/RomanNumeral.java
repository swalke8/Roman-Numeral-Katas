import java.util.*;

public class RomanNumeral {
  private static Map<Integer,String> numbers = new HashMap<Integer,String>();
  static {
    numbers.put(1, "I");
    numbers.put(5, "V");
    numbers.put(10, "X");
  }
  private static int [] arrayOfNumbers = {1, 5, 10};

  public static String romanize(int number) {
    String numeral = new String();
    for(int i = arrayOfNumbers.length-1; i >= 0; i--) {
      while(number >= numberValue(i)) {
        numeral = numeral.concat(numbers.get(numberValue(i)));
        number -= numberValue(i);
      }
      if(number > 0 && number == numberValue(i)-1) {
        numeral = numeral.concat("I" + numbers.get(numberValue(i)));
        number = 0;
      }
    }
    return numeral;
  }

  private static int numberValue(int number) {
    return arrayOfNumbers[number];
  }
}
