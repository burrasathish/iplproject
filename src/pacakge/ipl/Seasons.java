package pacakge.ipl;

import  java.util.HashSet;
import java.util.ListIterator;
import java.util.Set;


public class Seasons {
    public Set<Integer> seasonSet=new HashSet<Integer>();
    public Set<String>bowlersSet=new HashSet<String>();
    public Set<Integer> getSeasons(){
        ListIterator<matches>  listdata=util.matchesData.listIterator();
        System.out.println(listdata);
        while(listdata.hasNext()){
            seasonSet.add(listdata.next().getSeason());
        }
       return seasonSet;
    }
}
