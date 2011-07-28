import junit.framework.TestCase;
import java.util.*;

public class RomanNumeralsTest extends TestCase {
  public void test1() throws Exception {
    assertEquals("I", RomanNumerals.romanize(1));
  }
  public void test2() throws Exception {
    assertEquals("II", RomanNumerals.romanize(2));
  }
  public void test3() throws Exception {
    assertEquals("III", RomanNumerals.romanize(3));
  }
  public void test4() throws Exception {
    assertEquals("IV", RomanNumerals.romanize(4));
  }
  public void test5() throws Exception {
    assertEquals("V", RomanNumerals.romanize(5));
  }
  public void test6() throws Exception {
    assertEquals("VI", RomanNumerals.romanize(6));
  }
  public void test7() throws Exception {
    assertEquals("VII", RomanNumerals.romanize(7));
  }
  public void test8() throws Exception {
    assertEquals("VIII", RomanNumerals.romanize(8));
  }
  public void test9() throws Exception {
    assertEquals("IX", RomanNumerals.romanize(9));
  }
  public void test10() throws Exception {
    assertEquals("X", RomanNumerals.romanize(10));
  }
  public void test11() throws Exception {
    assertEquals("XI", RomanNumerals.romanize(11));
  }
  public void test12() throws Exception {
    assertEquals("XII", RomanNumerals.romanize(12));
  }
  public void test13() throws Exception {
    assertEquals("XIII", RomanNumerals.romanize(13));
  }
  public void test14() throws Exception {
    assertEquals("XIV", RomanNumerals.romanize(14));
  }
  public void test15() throws Exception {
    assertEquals("XV", RomanNumerals.romanize(15));
  }
  public void test16() throws Exception {
    assertEquals("XVI", RomanNumerals.romanize(16));
  }
  public void test17() throws Exception {
    assertEquals("XVII", RomanNumerals.romanize(17));
  }
  public void test18() throws Exception {
    assertEquals("XVIII", RomanNumerals.romanize(18));
  }
  public void test19() throws Exception {
    assertEquals("XIX", RomanNumerals.romanize(19));
  }
  public void test20() throws Exception {
    assertEquals("XX", RomanNumerals.romanize(20));
  }
  public void test21() throws Exception {
    assertEquals("XXI", RomanNumerals.romanize(21));
  }
  public void test24() throws Exception {
    assertEquals("XXIV", RomanNumerals.romanize(24));
  }
  public void test25() throws Exception {
    assertEquals("XXV", RomanNumerals.romanize(25));
  }
  public void test29() throws Exception {
    assertEquals("XXIX", RomanNumerals.romanize(29));
  }
  public void test30() throws Exception {
    assertEquals("XXX", RomanNumerals.romanize(30));
  }
  public void test40() throws Exception {
    assertEquals("XL", RomanNumerals.romanize(40));
  }
  public void test44() throws Exception {
    assertEquals("XLIV", RomanNumerals.romanize(44));
  }
  public void test45() throws Exception {
    assertEquals("XLV", RomanNumerals.romanize(45));
  }
  public void test49() throws Exception {
    assertEquals("XLIX", RomanNumerals.romanize(49));
  }
  public void test50() throws Exception {
    assertEquals("L", RomanNumerals.romanize(50));
  }
}
