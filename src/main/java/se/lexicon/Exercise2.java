package se.lexicon;

import java.util.ArrayList;
import java.util.Iterator;

public class Exercise2 {

    public static void main(String [] args){
        ArrayList<String> week = new ArrayList<>();
        week.add("Sunday");
        week.add("Monday");
        week.add("Tuesday");
        week.add("Wednesday");
        week.add("Thursday");
        week.add("Friday");
        week.add("Saturday");
        Iterator<String> iterator = week.listIterator();
        while (iterator.hasNext()){
            System.out.println("week:" + iterator.next());
        }
    }
}
