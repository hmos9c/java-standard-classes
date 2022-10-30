package hmos9c.classes;

import java.util.Random;

public class _15RandomApp {
  public static void main(String[] args) {

    Random random = new Random();

    for (int i = 0; i < 100; i++) {
      int value = random.nextInt(100);
      System.out.println(value);
    }

  }
}
