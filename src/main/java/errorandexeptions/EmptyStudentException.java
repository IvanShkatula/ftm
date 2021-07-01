package errorandexeptions;

public class EmptyStudentException extends RuntimeException{

  @Override
  public String toString() {
    return "There should be at least one student in the group";
  }
}
