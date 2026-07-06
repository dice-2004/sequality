package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  @Test
  public void testGetIndividualFee() {
    Calculate calc = new Calculate();
    assertEquals(1000, calc.getIndividualFee(10));
    assertEquals(2000, calc.getIndividualFee(15));
  }

  @Test
  public void testGetTotalFee() {
    Calculate calc = new Calculate();
    assertEquals(7000, calc.getTotalFee(10, 7));
    assertEquals(10800, calc.getTotalFee(10, 12));
    assertEquals(14000, calc.getTotalFee(15, 7));
    assertEquals(21600, calc.getTotalFee(15, 12));
  }

  public static void main(String[] args) {
    printResult(10, 7);
    printResult(10, 12);
    printResult(15, 7);
    printResult(15, 12);
  }

  public static void printResult(int age, int size) {
    Calculate calc = new Calculate();
    int individual = calc.getIndividualFee(age);
    int total = calc.getTotalFee(age, size);
    if (size >= 10) {
      System.out.println(
          "Age " + age + ", Size " + size + ": Individual " + individual + ", Total " + total + " (Discount applied).");
    } else {
      System.out.println("Age " + age + ", Size " + size + ": Individual " + individual + ", Total " + total + ".");
    }
  }
}
