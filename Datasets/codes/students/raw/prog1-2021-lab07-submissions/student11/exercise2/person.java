package lu.uni.programming1.lab7.exercise2;

import java.time.LocalDate;
import java.time.Period;

public class person {

        private String name;
        private int year;
        private int month;
        private int day;
        private boolean studies;
        private boolean teaches;
        private double age;

        public person(String name, int year, int month, int day, boolean studies, boolean teaches)
        {
            this.name = name;
            this.year = Math.max(year, 0);
            this.month = Math.min(12, Math.max(1, month));
            switch (this.month)
        {
            case 1,3,5,7,8,10,12 : {this.day = Math.min(31, Math.max(1, day));}
            break;

            case 2 : {this.day = Math.min(28, Math.max(1, day));}
            break;

            case 4,6,9,11 : {this.day = Math.min(30, Math.max(1, day));}
            break;
        }
            this.studies = studies;
            this.teaches = teaches;
            LocalDate date = LocalDate.now();
            LocalDate ageDate = LocalDate.of(this.year, this.month, this.day);
            Period agePeriod = Period.between(ageDate, date);
            this.age = agePeriod.getYears();

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public int getMonth() {
            return month;
        }

        public void setMonth(int month) {
            this.month = month;
        }

        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            this.day = day;
        }

        public boolean isStudies() {
            return studies;
        }

        public void setStudies(boolean studies) {
            this.studies = studies;
        }

        public boolean isTeaches() {
            return teaches;
        }

        public void setTeaches(boolean teaches) {
            this.teaches = teaches;
        }

        public double getAge() {
            return age;
        }

        public void setAge(double age) {
            this.age = age;
        }

        
        
        
}