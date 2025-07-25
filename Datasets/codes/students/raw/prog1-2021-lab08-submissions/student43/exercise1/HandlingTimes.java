package lu.uni.programming1.lab8.exercise1;

public enum HandlingTimes {
    EXPRESS(100,"1 day"), PRIORITY(50,"3 days"), CLASSIC(10,"5 days"), NORUSH(0,"8 days");

    double fee;
    String time;
    
    HandlingTimes(double fee, String time){
        HandlingTimes.this.fee = fee;
        HandlingTimes.this.time = time;
    }
}
