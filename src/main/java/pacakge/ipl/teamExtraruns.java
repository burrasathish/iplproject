            package pacakge.ipl;
            import java.util.ListIterator;
            import java.util.*;
            public class teamExtraruns {

                ArrayList<Integer>  Idof2016=new ArrayList<Integer>();
                TreeMap<String,Integer> ExtraRuns=new TreeMap<String,Integer>();
                public  TreeMap<String,Integer>  getteam(){
                    ListIterator<matches> it = util.matchesData.listIterator();
                    ListIterator<Deliveries>  list= util.deliveriesData.listIterator();
                    while(it.hasNext()){
                        if(it.next().getSeason()==2016){
                            Idof2016.add(it.next().getMatchId());
                        }
                    }
                    while (list.hasNext()){
                        if(Idof2016.contains(list.next().getMatchid())){
                            Deliveries  deli=list.next();
                            String s=deli.getBowlingTeam();
                            int runs=deli.getExtrRuns();
                            if(ExtraRuns.containsKey(s))
                                ExtraRuns.put(s,ExtraRuns.get(s)+runs);
                            ExtraRuns.putIfAbsent(s,runs);
                        }
                    }
                  return  ExtraRuns;
                }
            }