package classes;

import java.util.GregorianCalendar;


public class ArrayCreator {

  Student firstStudent = new Student(1, "Petrov", "Kolya",
      "Sergeevich", new GregorianCalendar(1998, 10, 01), "Korolya 88", "111-11-11", "FMP", 2, 125);
  Student secondStudent = new Student(2, "Ivanov", "Ivan",
      "Ivanich", new GregorianCalendar(1997, 03, 02), "Lobonka 88", "211-11-11", "FMP", 1, 130);
  Student thirdStudent = new Student(3, "Sidorov", "Ilya",
      "Sergeevich", new GregorianCalendar(1998, 03, 12), "Korolya 88", "111-11-11", "ATF", 2, 125);
  Student forthStudent = new Student(4, "Petrova", "Anna",
      "Sergeevich", new GregorianCalendar(1995, 10, 01), "Korolya 88", "111-11-11", "ATF", 4, 1234);
  Student fifthStudent = new Student(5, "Sidorova", "Galia",
      "Sergeevich", new GregorianCalendar(1996, 10, 01), "Korolya 88", "111-11-11", "FMP", 4, 1289);

  Student[] studentList = new Student[]{firstStudent, secondStudent, thirdStudent, forthStudent, fifthStudent};


}
