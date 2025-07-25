package lu.uni.programming1.lab9.exercise2;

import java.util.ArrayList;
import java.util.Date;

public class Logger {

   static ArrayList<String> logs = new ArrayList<>();


    public static void log(String log){
        Date date = new Date();
        logs.add(log + "   " + date);
    }

    public static void printLogs(){
        for(String log : logs){
            System.out.println(log);
        }
    }





}

