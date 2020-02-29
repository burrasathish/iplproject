package pacakge.ipl;
import java.util.*;


public class totalMatchesplayed  {
    public static HashMap<Integer,Integer> matchesPlayedPerYear = new HashMap<>();
    public static  HashMap<Integer,Integer> getyeardata(List<matches> matchesList) throws  NullPointerException{
        if(matchesList == null){
            throw new NullPointerException("must not be null");
        }
        try {
            ListIterator<matches> it = matchesList.listIterator();
            while (it.hasNext()) {
                int s = it.next().getSeason();
                if (matchesPlayedPerYear.containsKey(s))
                    matchesPlayedPerYear.put(s, matchesPlayedPerYear.get(s) + 1);
                matchesPlayedPerYear.putIfAbsent(s, Integer.parseInt("1"));
            }
        }
        catch (NullPointerException e) {e.printStackTrace();}
        return matchesPlayedPerYear;
    }
}
