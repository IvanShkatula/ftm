package errorandexeptions;

import java.util.Arrays;

public class EmptyFacultiesException extends RuntimeException{

  @Override
  public String toString() {
    return "There should be at least one faculty in university";
  }
}
