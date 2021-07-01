package classes;

import java.util.Calendar;


public class Student {
  private int id;
  private String lastName;
  private String name;
  private String patronymic;
  private Calendar birthday;
  private String address;
  private String phone;
  private String faculty;
  private int course;
  private int group;

  public Student(int id, String lastName, String name, String patronymic, Calendar birthday, String address,
                 String phone, String faculty, int course, int group) {
    this.id = id;
    this.lastName = lastName;
    this.name = name;
    this.patronymic = patronymic;
    this.birthday = birthday;
    this.address = address;
    this.phone = phone;
    this.faculty = faculty;
    this.course = course;
    this.group = group;
  }

  public Student() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPatronymic() {
    return patronymic;
  }

  public void setPatronymic(String patronymic) {
    this.patronymic = patronymic;
  }

  public Calendar getBirthday() {
    return birthday;
  }

  public void setBirthday(Calendar birthday) {
    this.birthday = birthday;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getFaculty() {
    return faculty;
  }

  public void setFaculty(String faculty) {
    this.faculty = faculty;
  }

  public int getCourse() {
    return course;
  }

  public void setCourse(int course) {
    this.course = course;
  }

  public int getGroup() {
    return group;
  }

  public void setGroup(int group) {
    this.group = group;
  }

  @Override
  public String toString() {
    return "StudentObjects{" +
        "id=" + id +
        ", lastName='" + lastName + '\'' +
        ", name='" + name + '\'' +
        ", patronymic='" + patronymic + '\'' +
        ", birthday='" + birthday + '\'' +
        ", address='" + address + '\'' +
        ", phone='" + phone + '\'' +
        ", faculty='" + faculty + '\'' +
        ", course=" + course +
        ", group=" + group +
        '}';
  }
}
