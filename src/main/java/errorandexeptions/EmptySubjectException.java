package errorandexeptions;

public class EmptySubjectException extends RuntimeException{

  @Override
  public String toString() {
    return "Student must have at least one subject";
  }
}
