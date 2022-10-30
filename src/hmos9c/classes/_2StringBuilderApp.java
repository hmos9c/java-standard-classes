package hmos9c.classes;

public class _2StringBuilderApp {
  public static void main(String[] args) {

    StringBuilder builder = new StringBuilder();
    builder.append("Sanas");
    builder.append(" ");
    builder.append("Feb");
    builder.append("riyan");

    String name = builder.toString();
    System.out.println(name);

  }
}
