package classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FacultyList {

  String facultyName;
  ArrayCreator arrayCreator = new ArrayCreator();

  public FacultyList() throws IOException {
    BufferedReader forString = new BufferedReader(new InputStreamReader(System.in));
     facultyName = forString.readLine();
  }

  //  a) список студентов заданного факультета;
  public void listOfPeopleInFaculty() {
    for (int i = 0; i < arrayCreator.studentList.length; i++) {
      if (arrayCreator.studentList[i].getFaculty().equals(facultyName)) {
        System.out.println(" " + arrayCreator.studentList[i].getName() + " " + arrayCreator.studentList[i].getLastName());
      }
    }
  }
}
