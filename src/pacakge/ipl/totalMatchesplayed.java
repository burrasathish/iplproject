package pacakge.ipl;
import java.util.*;
 import  java.sql.Statement;
 import java.sql.ResultSet;
 import  java.sql.Connection;

public class totalMatchesplayed {
    //    private Set<Integer> seasonSet = new HashSet<Integer>();
//    private int season;
    HashMap<Integer,Integer> matchesPlayedPerYear = new HashMap<>();



    public void getyeardata(){
        dbconnection conn=new dbconnection();
        Connection Con=conn.dbconnect();
//        Seasons seasons = new Seasons();
//        seasonSet = seasons.getSeasons();
        //System.out.println(seasonSet);
//        Iterator<Integer> itSeason = seasonSet.iterator();
        try{
            Statement stmt =Con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from matches");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        ListIterator<matches> it = util.matchesData.listIterator();


        while(it.hasNext()){
            //matchesPlayedPerYear.put(it);
            int s = it.next().getSeason();
            if(matchesPlayedPerYear.containsKey(s))
                matchesPlayedPerYear.put(s, matchesPlayedPerYear.get(s)+1);
            matchesPlayedPerYear.putIfAbsent(s,Integer.parseInt("1"));
        }
        System.out.print(matchesPlayedPerYear);
    }
}
