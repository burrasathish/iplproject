package pacakge.ipl;

import java.util.HashMap;
import java.util.ListIterator;
import  java.sql.Statement;
import java.sql.ResultSet;
import  java.sql.Connection;
import pacakge.ipl.dbconnection;

public class matcheswon {
    HashMap<String,Integer> matchesWon = new HashMap<>();

    public void getteamdata(){

        ListIterator<matches> it = util.matchesData.listIterator();

        while(it.hasNext()) {
            //matchesPlayedPerYear.put(it);
            String s = it.next().getWinner();
            //System.out.println(s);
            if (matchesWon.containsKey(s)){
                matchesWon.put(s, matchesWon.get(s) + 1);
            }
            else{
                matchesWon.putIfAbsent(s, Integer.parseInt("1"));
            }
            // System.out.print(matchesWon);
        }
        System.out.print(matchesWon);

    }
}
