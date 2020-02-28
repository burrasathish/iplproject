package pacakge.ipl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import  pacakge.ipl.matches;
import  pacakge.ipl.util;


public class Matchid {

    public  Integer season;
   public List<Integer> matchIdl;
//
    public Map<Integer,List<Integer>> mapgetMatchIdandsession(){
        //System.out.print(matchIdl);
        Set<Integer> seasonSet=new HashSet<Integer>();
        Map<Integer,List<Integer>> Matchidmap=new HashMap<Integer, List<Integer>>();
        Seasons seasons=new Seasons();
        seasonSet =seasons.getSeasons();
        Iterator<Integer>itr=seasonSet.iterator();
     // System.out.println(itr); //hashmap

        while(itr.hasNext()){
            season=itr.next();
            int i=0;
            matchIdl=new ArrayList<Integer>();
            ListIterator<matches> it=util.matchesData.listIterator();
            while(it.hasNext()){
                //System.out.println(i+"       up   "+season);
              //System.out.println(it.next());String
                if(it.next().getSeason()==season){
                   // System.out.println(util.matchesData.get(i));
                    matchIdl.add(util.matchesData.get(i).getMatchId());
                }
                i++;
            }
           // System.out.println(matchIdl);
            Matchidmap.put(season,matchIdl);
           //System.out.println(Matchidmap);
        }
 return  Matchidmap;
    }
}
