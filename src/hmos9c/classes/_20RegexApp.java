package hmos9c.classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _20RegexApp {
  public static void main(String[] args) {

    String name = "Sanas Febriyan hmos9c";

    Pattern pattern = Pattern.compile("[a-zA-Z]*[a][a-zA-Z]*");
    Matcher matcher = pattern.matcher(name);

    while (matcher.find()){
      String result = matcher.group();
      System.out.println(result);
    }

  }
}
