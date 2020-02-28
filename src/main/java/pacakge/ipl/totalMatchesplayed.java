package pacakge.ipl;
import java.util.*;


public class totalMatchesplayed {
    HashMap<Integer,Integer> matchesPlayedPerYear = new HashMap<>();
    public HashMap<Integer,Integer> getyeardata(){
        ListIterator<matches> it = util.matchesData.listIterator();
        while(it.hasNext()){
            int s = it.next().getSeason();
            if(matchesPlayedPerYear.containsKey(s))
                matchesPlayedPerYear.put(s, matchesPlayedPerYear.get(s)+1);
            matchesPlayedPerYear.putIfAbsent(s,Integer.parseInt("1"));
        }
        return matchesPlayedPerYear;
    }
}
