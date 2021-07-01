package errorandexeptions;

import java.util.Arrays;

public class Student {
  private String firstName;
  private String lastName;
  private JournalEntry[] journal;

  public Student(String firstName, String lastName, JournalEntry[] journal) {
    if (journal == null || journal.length == 0) {
      throw new EmptySubjectException();
    }
    this.firstName = firstName;
    this.lastName = lastName;
    this.journal = journal;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public JournalEntry[] getJournal() {
    return journal;
  }

  @Override
  public String toString() {
    return "Student{" +
        "firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", journal=" + Arrays.toString(journal) +
        '}';
  }
}
