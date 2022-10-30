package hmos9c.classes;

public class _1StringApp {
  public static void main(String[] args) {

    String name = "Sanas Febriyan";
    String nameLowercase = name.toLowerCase();
    String nameUppercase = name.toUpperCase();


    System.out.println(name);
    System.out.println(nameLowercase);
    System.out.println(nameUppercase);
    System.out.println(name.length());
    System.out.println(name.startsWith("Sanas"));
    System.out.println(name.endsWith("Febriyan"));

    String[] names = name.split(" ");
    for(var value : names){
      System.out.println(value);
    }

    System.out.println(" ".isBlank());
    System.out.println(" ".isEmpty());
    System.out.println("".isEmpty());
    System.out.println(name.charAt(0));

    char[] chars = name.toCharArray();

  }
}
