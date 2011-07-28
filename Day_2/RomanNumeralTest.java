import junit.framework.TestCase;

public class RomanNumeralTest extends TestCase {
  public void test1() throws Exception {
    assertEquals("I", RomanNumeral.romanize(1));
  }
  public void test2() throws Exception {
    assertEquals("II", RomanNumeral.romanize(2));
  }
  public void test3() throws Exception {
    assertEquals("III", RomanNumeral.romanize(3));
  }
  public void test4() throws Exception {
    assertEquals("IV", RomanNumeral.romanize(4));
  }
  public void test5() throws Exception {
    assertEquals("V", RomanNumeral.romanize(5));
  }
  public void test6() throws Exception {
    assertEquals("VI", RomanNumeral.romanize(6));
  }
  public void test7() throws Exception {
    assertEquals("VII", RomanNumeral.romanize(7));
  }
  public void test8() throws Exception {
    assertEquals("VIII", RomanNumeral.romanize(8));
  }
  public void test9() throws Exception {
    assertEquals("IX", RomanNumeral.romanize(9));
  }
  public void test10() throws Exception {
    assertEquals("X", RomanNumeral.romanize(10));
  }
}
