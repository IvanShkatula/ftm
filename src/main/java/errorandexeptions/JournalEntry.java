package errorandexeptions;

import java.util.Arrays;

public class JournalEntry {

  private final String subjectName;
  private final int[] marks;

  public JournalEntry(String subjectName, int[] marks) {
    for (int mark: marks) {
      if (mark < 0 || mark > 10) {
        throw new InvalidMarkException(mark);
      }
    }
    this.subjectName = subjectName;
    this.marks = marks;
  }

  public String getSubjectName() {
    return subjectName;
  }

  public int[] getMarks() {
    return marks;
  }

  @Override
  public String toString() {
    return "JournalEntry{" +
        "subjectName='" + subjectName + '\'' +
        ", marks=" + Arrays.toString(marks) +
        '}';
  }
}
