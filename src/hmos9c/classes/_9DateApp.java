package hmos9c.classes;

import java.util.Calendar;
import java.util.Date;

public class _9DateApp {

  public static void main(String[] args) {


    Date tanggal = new Date(34256621200L);

    System.out.println(tanggal);

    Calendar calendar = Calendar.getInstance();
    calendar.set(Calendar.YEAR, 2001);
    calendar.set(Calendar.MONTH, Calendar.FEBRUARY);
    calendar.set(Calendar.HOUR_OF_DAY, 10);

    Date result = calendar.getTime();
    System.out.println(result);

  }

}
