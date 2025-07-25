package lu.uni.programming1.lab6.exercise2;

public class Person {

    private String name;
    private String passportNumber;

    public Person(String name_, String passportNumber_) {
		this.name = name_;
		this.passportNumber = passportNumber_;
	}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", passportNumber=" + passportNumber + "]";
    }



    
}
