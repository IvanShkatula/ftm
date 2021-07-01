package errorandexeptions;

public class DataConfig {

  Student[] students;
  Group[] groups;
  Faculty[] faculties;
  University bntu;
  {
    int[] marks1 = new int[]{5, 6, 7, 8};
    int[] marks2 = new int[]{9, 2, 4, 6};
    int[] marks3 = new int[]{3, 6, 1, 3};
    int[] marks4 = new int[]{5, 4, 9, 2};
    int[] marks5 = new int[]{4, 1, 7, 1};
    int[] marks6 = new int[]{7, 9, 1, 4};
    int[] marks7 = new int[]{1, 7, 6, 9};
    int[] marks8 = new int[]{5, 4, 3, 8};
    int[] marks9 = new int[]{1, 8, 7, 9};

    JournalEntry math = new JournalEntry("math", marks1);
    JournalEntry math2 = new JournalEntry("math", marks2);
    JournalEntry math3 = new JournalEntry("math", marks3);
    JournalEntry language = new JournalEntry("language", marks4);
    JournalEntry language2 = new JournalEntry("language", marks5);
    JournalEntry language3 = new JournalEntry("language", marks6);
    JournalEntry literature = new JournalEntry("literature", marks7);
    JournalEntry literature2 = new JournalEntry("literature", marks8);
    JournalEntry literature3 = new JournalEntry("literature", marks9);
    JournalEntry[] journal = new JournalEntry[]{math, language, literature};
    JournalEntry[] journal2 = new JournalEntry[]{language2, literature3};
    JournalEntry[] journal3 = new JournalEntry[]{math2, literature2};
    JournalEntry[] journal4 = new JournalEntry[]{language3};
    JournalEntry[] journal5 = new JournalEntry[]{math3};

    Student ivanATF1 = new Student("i", "i", journal);
    Student olgaATF1 = new Student("o", "o", journal2);
    Student peterATF2 = new Student("pe", "pe", journal3);
    Student katyaATF2 = new Student("k", "k", journal4);

    Student leshaFMP1 = new Student("l", "l", journal5);
    Student marinaFMP1 = new Student("m", "m", journal);
    Student andreiFMP2 = new Student("a", "a", journal2);
    Student polinaFMP2 = new Student("po", "po", journal3);
    students = new Student[]{ivanATF1, olgaATF1, peterATF2, katyaATF2, leshaFMP1, marinaFMP1, andreiFMP2, polinaFMP2};

    Group atf1 = new Group(1, new Student[]{ivanATF1, olgaATF1});
    Group atf2 = new Group(2, new Student[]{peterATF2, katyaATF2});
    Group fmp1 = new Group(1, new Student[]{leshaFMP1, marinaFMP1});
    Group fmp2 = new Group(2, new Student[]{andreiFMP2, polinaFMP2});
    groups = new Group[]{atf1, atf2, fmp1, fmp2};

    Faculty facultyATF = new Faculty("atf", new Group[]{atf1, atf2});
    Faculty facultyFMP = new Faculty("fmp", new Group[]{fmp1, fmp2});
    faculties = new Faculty[]{facultyATF, facultyFMP};

    bntu = new University("bntu", faculties);
  }
}
