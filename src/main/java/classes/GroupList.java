package classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GroupList {

  //  d) список учебной группы.
  int groupNumber;
  ArrayCreator arrayCreator = new ArrayCreator();

  public GroupList() throws IOException {
    BufferedReader forInt = new BufferedReader(new InputStreamReader(System.in));
    groupNumber = Integer.parseInt(forInt.readLine());
  }

  public void listOfStudentInGroup() {
    for (int i = 0; i < arrayCreator.studentList.length; i++) {
      if (arrayCreator.studentList[i].getGroup() == groupNumber) {
        System.out.println(" " + arrayCreator.studentList[i].getName() + " " + arrayCreator.studentList[i].getLastName());
      }
    }
  }


}
