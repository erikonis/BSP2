import java.util.ArrayList;
import java.util.Calendar;

public class Table extends Filter{
    private int l1, c1, c2, c3;
    // private Person[] persons;
    private ArrayList<Person> persons, filtered1, filtered2;
    private Boolean filtered;
    private Calendar currentdate;
    private int cyear;
    // private Person[] persons1;
    Table(Person... persons1){
        // this.persons1 = persons1;
        persons = new ArrayList<Person>(1);
        filtered1 = new ArrayList<Person>(1);
        filtered2 = new ArrayList<Person>(1);
        c2 = 0;
        while(c2<persons1.length){
        persons.add(persons1[c2]);
        c2++;}
        this.filtered = super.getFiltered();
        l1 = persons.size();
        currentdate = Calendar.getInstance();
        // cday = currentdate.get(Calendar.DAY_OF_MONTH);
        // cmonth = currentdate.get(Calendar.MONTH);
        cyear = currentdate.get(Calendar.YEAR);}
    
    public int getL1() {
        return l1;
    }
    // public void setL(int l1) {
    //     this.l1 = l1;
    // }
    public ArrayList<Person> getPersons() {
        return persons;
    }
    // public void setPersons(ArrayList<Person> persons) {
    //     this.persons = persons;
    // }

    public void FilterLecturer(){
        c1 = 0;
        if (filtered){
            while(c1<filtered1.size()){
                if((filtered1.get(c1).isTeaching())&&(filtered1.get(c1).isStudying() != true)){
                    filtered2.add(filtered1.get(c1));}
                c1++;}}
        if(filtered == false){
            while(c1<persons.size()){
                if((persons.get(c1).isTeaching())&&(persons.get(c1).isStudying() != true)){
                    filtered1.add(persons.get(c1));}
                c1++;}
                filtered = super.getFiltered();}}
        
    public void FilterStudent(){
        c1 = 0;
        if (filtered){
            while(c1<filtered1.size()){
                if((filtered1.get(c1).isStudying())&&(filtered1.get(c1).isTeaching() != true)){
                    filtered2.add(filtered1.get(c1));}
                c1++;}}
        if(filtered == false){
            while(c1<persons.size()){
                if((persons.get(c1).isStudying())&&(persons.get(c1).isTeaching() != true)){
                    filtered1.add(persons.get(c1));}
                c1++;}
                filtered = super.getFiltered();}}

        
    public void FilterTA(){
        c1 = 0;
        if (filtered){
            while(c1<filtered1.size()){
                if((filtered1.get(c1).isStudying())&&(filtered1.get(c1).isTeaching())){
                    filtered2.add(filtered1.get(c1));}
                c1++;}}
        if(filtered == false){
            while(c1<persons.size()){
                if((persons.get(c1).isStudying())&&(persons.get(c1).isTeaching())){
                    filtered1.add(persons.get(c1));}
                c1++;}
                filtered = super.getFiltered();}}


    public void FilterJunior(){
        c1 = 0;
        if (filtered){
            while(c1<filtered1.size()){
                if((cyear - filtered1.get(c1).getByear()>=18)&&(cyear - filtered1.get(c1).getByear()<28)){
                    filtered2.add(filtered1.get(c1));}
                c1++;}}
        if(filtered == false){
            while(c1<persons.size()){
                if((cyear - persons.get(c1).getByear()>=18)&&(cyear - persons.get(c1).getByear()<28)){
                    filtered1.add(persons.get(c1));}
                c1++;}
                filtered = super.getFiltered();}}

    public void FilterMiddle(){
        c1 = 0;
        if (filtered){
            while(c1<filtered1.size()){
                if((cyear - filtered1.get(c1).getByear()>=28)&&(cyear - filtered1.get(c1).getByear()<=55)){
                    filtered2.add(filtered1.get(c1));}
                c1++;}}
        if(filtered == false){
            while(c1<persons.size()){
                if((cyear - persons.get(c1).getByear()>=28)&&(cyear - persons.get(c1).getByear()<=55)){
                    filtered1.add(persons.get(c1));}
                c1++;}
                filtered = super.getFiltered();}}
        
    public void FilterSenior(){
        c1 = 0;
        if (filtered){
            while(c1<filtered1.size()){
                if(cyear - filtered1.get(c1).getByear()>55){
                    filtered2.add(filtered1.get(c1));}
                c1++;}}
        if(filtered == false){
            while(c1<persons.size()){
                if(cyear - persons.get(c1).getByear()>55){
                    filtered1.add(persons.get(c1));}
                c1++;}
                filtered = super.getFiltered();}}

    public void Displaylist(){
        ArrayList<Person> listdisplay;
        listdisplay = persons;
        if (super.getFiltered()){
                listdisplay = filtered2;}
            else{listdisplay = filtered1;}
        c3 = 0;
        System.out.println("Name | Y  M  D | Studying | Teaching |");
        while(listdisplay.size()>c3){
            listdisplay.get(c3).displaydata();
            c3++;}}
        }
