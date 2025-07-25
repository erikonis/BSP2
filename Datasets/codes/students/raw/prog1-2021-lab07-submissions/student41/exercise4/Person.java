package lu.uni.programming1.lab7.exercise4;


public abstract class Person{
private String name;
private int dayBirth;
private int monthBirth;
private int yearBirth;

public Person(String name_, int yearBirth_, int monthBirth_, int dayBirth_){
  this.name = name_;
  this.yearBirth = yearBirth_;
  this.monthBirth = monthBirth_;
  this.dayBirth = dayBirth_;
}

public String getName(){
    return name;
}

public int getyearBirth(){
    return yearBirth;
}

public int getmonthBirth(){
    return monthBirth;
}
public int getdayBirth(){
    return dayBirth;
}


public abstract String getDescription();

}

