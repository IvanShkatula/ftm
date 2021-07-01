package classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ListOfFacultyPlusCourse {

  String facultyName;
  int courseNumber;
  ArrayCreator arrayCreator = new ArrayCreator();

  public ListOfFacultyPlusCourse() throws IOException {
    BufferedReader forString = new BufferedReader(new InputStreamReader(System.in));
    BufferedReader forInt = new BufferedReader(new InputStreamReader(System.in));
    facultyName = forString.readLine();
    courseNumber = Integer.parseInt(forInt.readLine());
  }

  //  b) списки студентов для каждого факультета и курса;
  public void listOfPeopleInFacultyAndCource() {
    for (int i = 0; i < arrayCreator.studentList.length; i++) {
      if (arrayCreator.studentList[i].getFaculty().equals(facultyName) && arrayCreator.studentList[i].getCourse() == courseNumber) {
        System.out.println(" " + arrayCreator.studentList[i].getName() + " " + arrayCreator.studentList[i].getLastName());
      }
    }
  }
}
