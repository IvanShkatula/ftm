package classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

//  c) список студентов, родившихся после заданного года;
public class ListOfStudentElderThen {

  int year;
  ArrayCreator arrayCreator = new ArrayCreator();

  public ListOfStudentElderThen() throws IOException {
    BufferedReader forInt = new BufferedReader(new InputStreamReader(System.in));
    year = Integer.parseInt(forInt.readLine());
  }

  public void listOfStudentElderThen() {
    for (int i = 0; i < arrayCreator.studentList.length; i++) {
      if (arrayCreator.studentList[i].getBirthday().get(Calendar.YEAR) > year) {
        System.out.println(" " + arrayCreator.studentList[i].getName() + " " + arrayCreator.studentList[i].getLastName());
      }
    }
  }
}
