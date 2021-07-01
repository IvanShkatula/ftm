package errorandexeptions;

import java.util.Arrays;

public class University {
  private String universityName;
  Faculty[] faculties;

  public University(String universityName, Faculty[] faculties) {
    if (faculties == null || faculties.length == 0) {
      throw new EmptyFacultiesException();
    }
    this.universityName = universityName;
    this.faculties = faculties;
  }

  public String getUniversityName() {
    return universityName;
  }

  public Faculty[] getFaculties() {
    return faculties;
  }

  @Override
  public String toString() {
    return "University{" +
        "universityName='" + universityName + '\'' +
        ", faculties=" + Arrays.toString(faculties) +
        '}';
  }
}
