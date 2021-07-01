package fundamentals.main_task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ReverseOrder {
  public static void main(String[] args) throws IOException {
    ArrayList<String> startList = new ArrayList<>();
    ArrayList<String> reverseList = new ArrayList<>();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    for (int i = 0; i < 5; i++) {
      startList.add(reader.readLine());
    }

    for (String arg: startList) {
      reverseList.add(0, arg);
    }

    for (String arg: reverseList) {
      System.out.println(arg);
    }
  }
}
