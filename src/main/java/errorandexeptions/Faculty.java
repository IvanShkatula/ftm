package errorandexeptions;

import java.util.Arrays;

public class Faculty {
  String facultyName;
  Group[] groups;

  public Faculty(String facultyName, Group[] groups) {
    if (groups == null || groups.length ==0) {
      throw new EmptyGroupException();
    }
    this.facultyName = facultyName;
    this.groups = groups;
  }

  public String getFacultyName() {
    return facultyName;
  }

  public void setFacultyName(String facultyName) {
    this.facultyName = facultyName;
  }

  public Group[] getGroups() {
    return groups;
  }

  public void setGroups(Group[] groups) {
    this.groups = groups;
  }

  @Override
  public String toString() {
    return "Faculty{" +
        "facultyName='" + facultyName + '\'' +
        ", groups=" + Arrays.toString(groups) +
        '}';
  }
}
