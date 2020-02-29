package pacakge.ipl;

import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;

public class matcheswon {
 public static  HashMap<String,Integer> matchesWon = new HashMap<>();
    public static   HashMap<String,Integer> getteamdata(List<matches>matchesData) {
        ListIterator<matches> it = matchesData.listIterator();

        if(matchesData == null){
            throw new NullPointerException("must not be null");
        }

        try {
            while (it.hasNext()) {
                String s = it.next().getWinner();
                if (matchesWon.containsKey(s)) {
                    matchesWon.put(s, matchesWon.get(s) + 1);
                } else {
                    matchesWon.putIfAbsent(s, Integer.parseInt("1"));
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
            return matchesWon;
    }
}
