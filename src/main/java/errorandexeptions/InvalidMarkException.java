package errorandexeptions;

public class InvalidMarkException extends RuntimeException{

  private final int invalidMark;

  public InvalidMarkException(int invalidMark) {
    this.invalidMark = invalidMark;
  }

  @Override
  public String toString() {
    return "Mark should be from 0 till 10. Current mark is - " + invalidMark;
  }
}
