package pacakge.ipl;

import java.util.HashMap;
import java.util.ListIterator;

public class matcheswon {
    HashMap<String,Integer> matchesWon = new HashMap<>();

    public  HashMap<String,Integer> getteamdata(){
        ListIterator<matches> it = util.matchesData.listIterator();
        while(it.hasNext()) {
            String s = it.next().getWinner();
            if (matchesWon.containsKey(s)){
                matchesWon.put(s, matchesWon.get(s) + 1);
            }
            else{
                matchesWon.putIfAbsent(s, Integer.parseInt("1"));
            }
        }
      return  matchesWon;

    }
}
