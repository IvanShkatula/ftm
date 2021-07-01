package errorandexeptions;

import java.util.Arrays;

public class Statistic {

  DataConfig dataConfig = new DataConfig();
  // student names for check - "pe" "l" "i"
  // subject name for test "math" "literature" "language"
  String studentName = "i";
  int averageMarkOfStudent;
  String journalName;
  int numberOfMarks;

  String subjectName = "math";
  String facultyName = "atf";
  int groupNumber = 2;
  int averageMarkForSubjectInGroup;
  int numberOfMarksInGroup;

  int numberOfMarksInUniversity;
  int averageMarkForUniversity;

  public static void main(String[] args) {
    Statistic statistic = new Statistic();
    // statistic.countAverageMarksOfStudent();
    // statistic.AverageScoreForSpecificSubjectInSpecificGroupAtSpecificFaculty();
    statistic.AverageScoreForSpecificSubject();
  }

  public void AverageScoreForSpecificSubject() {
    for (int i = 0; i < dataConfig.students.length; i++) {
      for (int j = 0; j < dataConfig.students[i].getJournal().length; j++) {
        if (dataConfig.students[i].getJournal()[j].getSubjectName().equalsIgnoreCase(subjectName)) {
          numberOfMarksInUniversity += dataConfig.students[i].getJournal()[j].getMarks().length;
          for (int k = 0; k < dataConfig.students[i].getJournal()[j].getMarks().length; k++) {
            averageMarkForUniversity += dataConfig.students[i].getJournal()[j].getMarks()[k];
          }
        }
      }
    }
    System.out.println("average score for specific subject in University is - " + averageMarkForUniversity / numberOfMarksInUniversity);
  }

  public void AverageScoreForSpecificSubjectInSpecificGroupAtSpecificFaculty() {
    for (int i = 0; i < dataConfig.faculties.length; i++) {
      if (dataConfig.faculties[i].getFacultyName().equalsIgnoreCase(facultyName)) {
        System.out.println(dataConfig.faculties[i].getFacultyName());
        for (int j = 0; j < dataConfig.faculties[i].getGroups().length; j++) {
          if (dataConfig.faculties[i].getGroups()[j].getGroupNumber() == groupNumber) {
            System.out.println(dataConfig.faculties[i].getGroups()[j].getGroupNumber());
            for (int k = 0; k < dataConfig.faculties[i].getGroups()[j].getStudents().length; k++) {
              for (int l = 0; l < dataConfig.faculties[i].getGroups()[j].getStudents()[k].getJournal().length; l++) {
                if (dataConfig.faculties[i].getGroups()[j].getStudents()[k].getJournal()[l].getSubjectName().equalsIgnoreCase(subjectName)) {
                  System.out.println(dataConfig.faculties[i].getGroups()[j].getStudents()[k].getJournal()[l].getSubjectName());
                  numberOfMarksInGroup = dataConfig.faculties[i].getGroups()[j].getStudents()[k].getJournal()[l].getMarks().length;
                  for (int m = 0; m < dataConfig.faculties[i].getGroups()[j].getStudents()[k].getJournal()[l].getMarks().length; m++) {
                    averageMarkForSubjectInGroup += dataConfig.faculties[i].getGroups()[j].getStudents()[k].getJournal()[l].getMarks()[m];
                  }
                }
              }
            }
          }
        }
      }
    }
    System.out.println("average score for subject in group is - " + averageMarkForSubjectInGroup / numberOfMarksInGroup);
  }

  public void countAverageMarksOfStudent() {
    for (int i = 0; i < dataConfig.students.length; i++) {
      Student student = dataConfig.students[i];
      JournalEntry[] journal = student.getJournal();
      if (student.getFirstName().equalsIgnoreCase(studentName)) {
        journalName = Arrays.toString(journal);
        System.out.println("student's subjects - " + journalName);
      }
      for (JournalEntry journalEntry : journal) {
        if (Arrays.toString(journal).equalsIgnoreCase(journalName)) {
          numberOfMarks = journalEntry.getMarks().length * journal.length;
          for (int k = 0; k < journalEntry.getMarks().length; k++) {
            averageMarkOfStudent += journalEntry.getMarks()[k];
          }
        }
      }
    }
    System.out.println("amount of student marks - " + numberOfMarks);
    System.out.println("average score is - " + averageMarkOfStudent / numberOfMarks);
  }


}
