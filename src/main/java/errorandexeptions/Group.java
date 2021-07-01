package errorandexeptions;

import java.util.Arrays;

public class Group {
  private int groupNumber;
  Student[] students;

  public Group(int groupName, Student[] students) {
    if (students == null || students.length ==0) {
      throw new EmptyStudentException();
    }
    this.groupNumber = groupName;
    this.students = students;
  }

  public int getGroupNumber() {
    return groupNumber;
  }

  public void setGroupNumber(int groupNumber) {
    this.groupNumber = groupNumber;
  }

  public Student[] getStudents() {
    return students;
  }

  public void setStudents(Student[] students) {
    this.students = students;
  }

  @Override
  public String toString() {
    return "Group{" +
        "groupNumber=" + groupNumber +
        ", students=" + Arrays.toString(students) +
        '}';
  }
}
