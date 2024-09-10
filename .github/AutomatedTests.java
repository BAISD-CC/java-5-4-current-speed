import org.junit.Test;
import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AutomatedTests {

  // Begin return tests
  @Test
  public void calcTarget1000Rate98Minutes4() {
    double target = 1000;
    double rate = 9.8;
    double minutes = 4;
    double expectedAnswer = target / Math.pow((1 + rate), minutes);

    CurrentSpeed currentSpeed = new CurrentSpeed();
    double actualAnswer = currentSpeed.currentSpeed(target, rate, minutes);

    assertEquals(expectedAnswer, actualAnswer, 0.01); // 0.01 is the delta for double comparison precision
  }
  @Test
  public void calcTarget9354Rate62Minutes38() {
    double target = 9354;
    double rate = 62;
    double minutes = 3.8;
    double expectedAnswer = target / Math.pow((1 + rate), minutes);

    CurrentSpeed currentSpeed = new CurrentSpeed();
    double actualAnswer = currentSpeed.currentSpeed(target, rate, minutes);

    assertEquals(expectedAnswer, actualAnswer, 0.01); // 0.01 is the delta for double comparison precision
  }
  @Test
  public void calcTarget45214Rate66Minutes3() {
    double target = 4521.4;
    double rate = 6.2;
    double minutes = 3;
    double expectedAnswer = target / Math.pow((1 + rate), minutes);

    CurrentSpeed currentSpeed = new CurrentSpeed();
    double actualAnswer = currentSpeed.currentSpeed(target, rate, minutes);

    assertEquals(expectedAnswer, actualAnswer, 0.01); // 0.01 is the delta for double comparison precision
  }
  @Test
  public void calcTarget71455Rate0Minutes0() {
    double target = 71455;
    double rate = 0;
    double minutes = 0;
    double expectedAnswer = target / Math.pow((1 + rate), minutes);

    CurrentSpeed currentSpeed = new CurrentSpeed();
    double actualAnswer = currentSpeed.currentSpeed(target, rate, minutes);

    assertEquals(expectedAnswer, actualAnswer, 0.01); // 0.01 is the delta for double comparison precision
  }
  @Test
  public void calcTargetLightSpeedRate200Minutes400() {
    double target = 1080000000;
    double rate = 200;
    double minutes = 400;
    double expectedAnswer = target / Math.pow((1 + rate), minutes);

    CurrentSpeed currentSpeed = new CurrentSpeed();
    double actualAnswer = currentSpeed.currentSpeed(target, rate, minutes);

    assertEquals(expectedAnswer, actualAnswer, 0.01); // 0.01 is the delta for double comparison precision
  }
  @Test
  public void calcTargetOperationPlumbbobRate200000Minutes00125() {
    double target = 200000;
    double rate = 200000;
    double minutes = 0.0125;
    double expectedAnswer = target / Math.pow((1 + rate), minutes);

    CurrentSpeed currentSpeed = new CurrentSpeed();
    double actualAnswer = currentSpeed.currentSpeed(target, rate, minutes);

    assertEquals(expectedAnswer, actualAnswer, 0.01); // 0.01 is the delta for double comparison precision
  }
  @Test
  public void calcTarget500Rate20Minutes2() {
    double target = 500;
    double rate = 20;
    double minutes = 2;
    double expectedAnswer = target / Math.pow((1 + rate), minutes);

    CurrentSpeed currentSpeed = new CurrentSpeed();
    double actualAnswer = currentSpeed.currentSpeed(target, rate, minutes);

    assertEquals(expectedAnswer, actualAnswer, 0.01); // 0.01 is the delta for double comparison precision
  }
  @Test
  public void calcTarget9001Rate7000Minutes02() {
    double target = 9001;
    double rate = 7000;
    double minutes = 0.2;
    double expectedAnswer = target / Math.pow((1 + rate), minutes);

    CurrentSpeed currentSpeed = new CurrentSpeed();
    double actualAnswer = currentSpeed.currentSpeed(target, rate, minutes);

    assertEquals(expectedAnswer, actualAnswer, 0.01); // 0.01 is the delta for double comparison precision
  }
  @Test
  public void calcTarget436Rate189Minutes23() {
    double target = 436;
    double rate = 189;
    double minutes = 2.3;
    double expectedAnswer = target / Math.pow((1 + rate), minutes);

    CurrentSpeed currentSpeed = new CurrentSpeed();
    double actualAnswer = currentSpeed.currentSpeed(target, rate, minutes);

    assertEquals(expectedAnswer, actualAnswer, 0.01); // 0.01 is the delta for double comparison precision
  }

  @Test
  public void checkForExit() throws IOException {
    // Make sure that your file path is correct
    BufferedReader br = new BufferedReader(new FileReader("CurrentSpeed.java")); 
    String line;
    boolean flag = false;

    // This checks for forbidden words or verifies that words are present.
    while ((line = br.readLine()) != null) {
      if (line.contains("System.exit(") || line.contains("System.exit (")) {
        flag = true;
      }
    }
    if (flag == false) {
      fail("You forgot to close the program.");
    }
  } 
  @Test
  public void checkForMathPow() throws IOException {
    // Make sure that your file path is correct
    BufferedReader br = new BufferedReader(new FileReader("CurrentSpeed.java")); 
    String line;
    boolean flag = false;

    // This checks for forbidden words or verifies that words are present.
    while ((line = br.readLine()) != null) {
      if (line.contains("Math.pow(") || line.contains("Math.pow (")) {
        flag = true;
      }
    }
    if (flag == false) {
      fail("You didn't use Math.pow to solve the problem.");
    }
  } 
  @Test
  public void checkForCurrentSpeed() throws IOException {
    // Make sure that your file path is correct
    BufferedReader br = new BufferedReader(new FileReader("CurrentSpeed.java")); 
    String line;
    boolean flag = false;

    // This checks for forbidden words or verifies that words are present.
    while ((line = br.readLine()) != null) {
      if (line.contains("currentSpeed(") || line.contains("currentSpeed (")) {
        flag = true;
      }
    }
    if (flag == false) {
      fail("You didn't use a method named currentSpeed to solve this problem.");
    }
  } 
}
