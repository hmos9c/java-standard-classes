package hmos9c.classes;

import java.util.UUID;

public class _12UUIDApp {
  public static void main(String[] args) {

    for(var i = 0; i < 10; i++){

      UUID uuid = UUID.randomUUID();
      String key = uuid.toString();

      System.out.println(key);

    }

  }
}
