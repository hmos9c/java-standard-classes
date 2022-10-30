package hmos9c.classes;

import java.util.Base64;

public class _13Base64App {
  public static void main(String[] args) {

    String original = "Sanas Febriyan";

    String encoded = Base64.getEncoder().encodeToString(original.getBytes());
    System.out.println(encoded);

    byte[] bytes = Base64.getDecoder().decode(encoded);
    String result = new String(bytes);

    System.out.println(result);

  }
}
