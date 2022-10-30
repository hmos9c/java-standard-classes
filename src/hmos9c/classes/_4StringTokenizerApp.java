package hmos9c.classes;

import java.util.StringTokenizer;

public class _4StringTokenizerApp {
  public static void main(String[] args) {

    String value = "Sanas Febriyan";

    StringTokenizer tokenizer = new StringTokenizer(value, " ");

    while(tokenizer.hasMoreTokens()){
      String result = tokenizer.nextToken();
      System.out.println(result);
    }

  }
}
