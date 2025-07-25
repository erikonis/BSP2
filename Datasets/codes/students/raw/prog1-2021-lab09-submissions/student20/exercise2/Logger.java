package lu.uni.programming1.lab9.exercise2;

import java.time.LocalDate;

public class Logger{
    private Action action;
    private LocalDate date;

    public Logger() {
        date = LocalDate.now();
    }

    @Override
    public String toString() {
        return date + "\n" + action;
    }
}
