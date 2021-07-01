package errorandexeptions;

public class EmptyGroupException extends RuntimeException {

  @Override
  public String toString() {
    return "There should be at least one group in faculty";
  }
}
