package fundamentals.main_task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ShowRandomDigits {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int amountOfDigits = Integer.parseInt(reader.readLine());
    ArrayList<Integer> list = new ArrayList<>();

    for (int i = 0; i < amountOfDigits; i++) {
      int randomNumber = (int) (Math.random() * 10);
      list.add(randomNumber);
    }

    for (int number: list) {
      System.out.println(number);
    }

    for (int number: list) {
      System.out.print(number + " ");
    }
  }
}
