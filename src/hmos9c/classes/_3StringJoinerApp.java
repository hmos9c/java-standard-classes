package hmos9c.classes;

import java.util.StringJoiner;

public class _3StringJoinerApp {
  public static void main(String[] args) {

    StringJoiner joiner = new StringJoiner(", ", "{", "}");

    joiner.add("Sanas");
    joiner.add("Akmal");
    joiner.add("Ardi");

    String value = joiner.toString();
    System.out.println(value);

  }
}
