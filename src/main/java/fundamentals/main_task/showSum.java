package fundamentals.main_task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class showSum {
  public static void main(String[] args) throws IOException {

    int sum = 0;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    while (true) {
      int number = Integer.parseInt(reader.readLine());
      sum += number;

      if (number == -1) {
        break;
      }
    }
    System.out.println(sum);
  }
}
