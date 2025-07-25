package Exercise4;

import java.time.LocalDate;
import java.time.Period;

public class Person {
  private String name;
  private int yearOfBirth;
  private int monthOfBirth;
  private int dayOfBirth;
  private boolean studies;
  private boolean teaches;

  /*
   * comme type on a: - String = chaine de caractères - int = integers = nombre
   * entier - Double = nombre entier et a virgule - Boolean = vraie ou faux
   */
  public Person(String name, int year, int month, int day, boolean student, boolean teacher) {
    /*
     * 3this.setName(name); this.setYearOfBirth(year); this.setMonthOfBirth(month);
     * this.setDayOfBirth(day); this.setStudies(student); this.setTeaches(teacher);
     * is the same right? and what is the best?
     */
    this.name = name;
    this.yearOfBirth = year;
    this.monthOfBirth = month;
    this.dayOfBirth = day;
    this.studies = student;
    this.teaches = teacher;
  }

  public boolean isTeaches() {
    return teaches;
    // it s more natural to say is teachet that get teacher
  }

  public void setTeaches(boolean teaches) {
    this.teaches = teaches;
  }

  public boolean isStudies() {
    return studies;
  }

  public void setStudies(boolean studies) {
    this.studies = studies;
  }

  public int getDayOfBirth() {
    return dayOfBirth;
  }

  public void setDayOfBirth(int dayOfBirth) {
    this.dayOfBirth = dayOfBirth;
  }

  public int getMonthOfBirth() {
    return monthOfBirth;
  }

  public void setMonthOfBirth(int monthOfBirth) {
    this.monthOfBirth = monthOfBirth;
  }

  public int getYearOfBirth() {
    return yearOfBirth;
  }

  public void setYearOfBirth(int yearOfBirth) {
    this.yearOfBirth = yearOfBirth;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    Period period = Period.between(LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth), LocalDate.now());
    return period.getYears();
  }

  @Override
  public String toString() {
    return "-" + name + " born on " + yearOfBirth + "/" + monthOfBirth + "/" + dayOfBirth + ". studies:"+ studies + " teaches:"  + teaches;
  }
}
